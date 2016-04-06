package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        // THE LINKED LIST DOESN'T HOLD VALUES FOR THE ASSETS INSERTED IN THE BEGINNING OF THE ACTION.
        // IF THE CODE IS REMOVED FROM THE COMMENT, THE METHODS THAT SUPPOSED TO WORK, RUNS SUCCESSFULLY

        //BEGINNING OF THE TEST CODE

        /*LinkedList aa = new LinkedList();

        aa.insertAutomobile(1231, "Blue");
        aa.insertCompactDisk(1223, 700);
        aa.insertElectronicAppliance(2133, "Iron");
        aa.insertElectronicAppliance(1231, "Television");
        aa.insertFurniture(1414, "IKEA");

        aa.display();

        System.out.println("**************************");

        System.out.println();
        aa.findAsset(1223);
        System.out.println();

        System.out.println("**************************");

        aa.deleteAsset(1231);
        System.out.println();

        System.out.println("1231 has removed");
        System.out.println();

        aa.display();

        System.out.println("**************************");

        System.out.println();
        aa.modifyAsset(2133, 1111);
        System.out.println();

        aa.display();*/

        //END OF THE TEST CODE

        Main tester = new Main();

        tester.test();

    }

    public void test() throws IOException {

        Scanner input = new Scanner(System.in);
        LinkedList assetList = new LinkedList();

        String action ="";
        String assetType;
        int serialNumber;
        int serialNumber2;
        String name;
        String color;
        String brand;
        int capacity;


        try {
            System.out.println("Please choose an action: ");
            System.out.println("Add new contact [A]");
            System.out.println("Delete contact [D]");
            System.out.println("Find contact [F]");
            System.out.println("Modify contact [M]");

            while ((action = input.nextLine()) != null) {



                if (action.equals("A")) {
                    System.out.println("Please enter the serial number and type of the asset" +
                            " you want to add:\t");
                    assetType = input.next();

                    if (assetType.equals("Electronic Appliances")) {

                        serialNumber = input.nextInt();
                        name = input.next();
                        assetList.insertElectronicAppliance(serialNumber, name);
                        assetList.display();
                        test();
                    } else if (assetType.equals("Automobile")) {

                        serialNumber = input.nextInt();
                        color = input.next();
                        assetList.insertAutomobile(serialNumber, color);
                        assetList.display();
                        test();

                    } else if (assetType.equals("Funiture")) {

                        serialNumber = input.nextInt();
                        brand = input.next();
                        assetList.insertFurniture(serialNumber, brand);
                        assetList.display();
                        test();
                    } else if (assetType.equals("Compact Disk")) {

                        serialNumber = input.nextInt();
                        capacity = input.nextInt();
                        assetList.insertCompactDisk(serialNumber, capacity);
                        assetList.display();
                        test();
                    } else {
                        System.out.println("Invalid Input. Please make sure serial number and type is written");
                        System.out.println();
                        test();
                    }

                } else if (action.equals("D")) {
                    System.out.println("Please enter serial number you want to delete:\t");
                    serialNumber = input.nextInt();
                    assetList.deleteAsset(serialNumber);
                    assetList.display();
                    System.out.println();
                    test();

                } else if (action.equals("F")) {
                    System.out.println("Please enter serial number you want to find:\t");
                    serialNumber = input.nextInt();
                    assetList.findAsset(serialNumber);
                    assetList.display();
                    System.out.println();
                    test();

                } else if (action.equals("M")) {

                    System.out.println("Please enter serial number you want to modify:\t");
                    serialNumber = input.nextInt();
                    assetList.findAsset(serialNumber);

                    System.out.println("Please enter new serial number:\t");

                    serialNumber2 = input.nextInt();
                    assetList.modifyAsset(serialNumber, serialNumber2);
                    assetList.display();
                    System.out.println();
                    test();

                } else {
                    System.out.println("Please make sure your input is valid");
                    System.out.println();
                    test();
                }
            }

        } catch (IOException e) {
            System.out.println("Please give input");
            System.out.println();
            test();
        }
    }
}











