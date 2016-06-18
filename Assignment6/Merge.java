package com.company;

import java.io.*;
import java.util.Scanner;

/**
 * Created by emirhankutlu on 16/04/16.
 */
public class Merge {

    private String[] information = new String[3];


    /**
     * Reads the .txt file that contains the template for the mail. Detects the places for the informations
     * to be inserted in the file and writes the informations in those places
     */
    public void writeFile() {
        try{
            Scanner input = new Scanner(new FileInputStream("template.txt"));
            PrintWriter p = new PrintWriter(new FileOutputStream("output.txt", false));

            while (input.hasNextLine()) {

                String[] word = input.nextLine().split(" ");

                for (int i = 0; i < word.length; i++) {

                    if (word[i].equals("<<N>>,")) {
                        word[i] = information[0] + ",";

                    } else if (word[i].equals("<<A>>")) {
                        word[i] = information[1];

                    } else if (word[i].equals("<<G>>,")) {
                        word[i] = information[2] + ",";

                    }
                }

                for (int i = 0; i < word.length; i++) {
                    p.print(word[i] + " ");
                }
                p.print("\n");
            }

            p.close();


        } catch (IOException e){
            System.out.println("Writing Failed!");
        }
    }

    /**
     * Reads the input file that holds the information of Name, Age and Gender
     * @param file input file that holds the information of Name, Age and Gender
     */
    public void readFile(String file) {

        try {

            Scanner input = new Scanner(new FileInputStream(file));

            int count = 0;

            while (input.hasNextLine()) {
                information[count] = input.nextLine();
                count++;
            }

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found!");
        }
    }
}
