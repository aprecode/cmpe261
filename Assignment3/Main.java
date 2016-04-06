package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Main newBook = new Main();

        // In this part I tested the methods
        LinkedList address = new LinkedList();

        address.insertPerson("Henry", 123);
        address.insertPerson("Amy", 3243);
        address.insertPerson("Molly", 533);
        address.insertPerson("Jack", 98);

        address.display();

        address.removePerson("Amy");

        System.out.println("Amy has removed");

        address.display();

        address.modifyPersonName("Henry", "EE");

        address.display();




        /*

        \\\\\\\\\\\\\  PROBLEM WITH THE CODE /////////////

        */

        // When I add a new person and the other one, Linked List disappears.
        // When I display it, information that I typed couldn't be reachable.
        newBook.addressBook();




    }


    /**
     * Prints the selections to be typed by the user
     */
    public void addressBook(){
        Scanner input = new Scanner(System.in);

        LinkedList addressBook = new LinkedList();
        String action;
        int number;
        String name;
        String name2;


        System.out.println("Please choose an action: ");
        System.out.println("Add new contact [A]");
        System.out.println("Delete contact [D]");
        System.out.println("Find contact [F]");
        System.out.println("Modify contact [M]");

        action = input.nextLine();
        if(action.equals("A")){
            System.out.println("Please enter the name you want to add: ");
            name = input.nextLine();
            System.out.println("Please enter the phone number: ");
            number = input.nextInt();
            addressBook.insertPerson(name,number);
            addressBook.display();
            addressBook();
        }
        else if(action.equals("D")){
            System.out.println("Please enter the name you want to delete: ");
            name = input.nextLine();
            addressBook.removePerson(name);
            addressBook.display();
            addressBook();
        }
        else if(action.equals("F")){
            System.out.println("Please enter the name you want to find: ");
            name = input.nextLine();
            addressBook.find(name);
            addressBook.display();
            addressBook();
        }
        else if(action.equals("M")){
            System.out.println("Please enter the name you want to modify");
            name = input.nextLine();
            addressBook.find(name);
            System.out.println("What information do you want to change Name[N] or Number[P]?: ");

            action = input.nextLine();
            if(action.equals("N")){
                System.out.println("Please enter the new name: ");
                name2 = input.nextLine();
                addressBook.modifyPersonName(name,name2);
                addressBook.display();
                addressBook();
            }
            else if(action.equals("P")){
                System.out.println("Please enter the new number: ");
                number = input.nextInt();
                //modify number method
                addressBook.display();
                addressBook();
            }
            else{
                System.out.println("Bad input!");
                addressBook();
            }
        }
        else {
            System.out.println("Bad input!");
            addressBook.display();
            addressBook();
        }
    }
}
