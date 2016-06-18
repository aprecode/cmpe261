package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by emirhankutlu on 07/05/16.
 */
public class FileReader {

    int ID, ID2, quiz1, quiz2;
    String name, surname, gender;

    ArrayList<Student> students = new ArrayList<>();

    public ArrayList<Student> read() throws FileNotFoundException {

        try {
            Scanner input = new Scanner(new FileInputStream("input.txt"));
            Scanner input2 = new Scanner(new FileInputStream("input2.txt"));

            while (input.hasNextLine() && input2.hasNextLine()) {
                name = input.next();
                surname = input.next();
                gender = input.next();
                ID = input.nextInt();
                ID2 = input2.nextInt();
                quiz1 = input2.nextInt();
                quiz2 = input2.nextInt();

                //IDs in the same rows must be equal
                if (ID == ID2) {
                    Student stu = new Student(ID, name, surname, gender, quiz1, quiz2);
                    students.add(stu);
                } else {
                    System.out.println("IDs Don't Match!");
                }

            }
        }catch (NumberFormatException e){
            System.out.println("Wrong Number Format!");
        }
        return students;
    }


}
