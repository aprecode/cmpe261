package com.company;


import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name;
        int midterm;
        int finl;
        double A1,A2,A3,A4,A5,A6;
        double assignments;
        double average;
        String ans,ans1;



        System.out.println("Enter your name and last name: ");
        name = input.nextLine();
        System.out.println("Enter your midterm exam: ");
        midterm = input.nextInt();
        System.out.println("Enter your final exam: ");
        finl = input.nextInt();

        System.out.println("Enter your A1 grade: ");
        A1 = input.nextInt();
        if(!(input.nextLine() == null)) {
            System.out.println("Did you submit it in time?");
            ans = input.nextLine();
            if (ans.equals("no")) {
                System.out.println("Did you submit it within 10 hours after the dead line?");
                ans = input.nextLine();
                if (ans.equals("no")) {
                    A1 = 0;
                } else if(ans.equals("yes")){
                    A1 = A1 - A1 * 0.1;
                }else{
                    System.out.println("INVALID INPUT");
                }
            }
        }

        System.out.println("Enter your A2 grade: ");
        A2 = input.nextInt();
        if(!(input.nextLine() == null)) {
            System.out.println("Did you submit it in time?");
            ans = input.nextLine();
            if (ans.equals("no")) {
                System.out.println("Did you submit it within 10 hours after the dead line?");
                ans = input.nextLine();
                if (ans.equals("no")) {
                    A2 = 0;
                } else if(ans.equals("yes")){
                    A2 = A2 - A2 * 0.1;
                }else{
                    System.out.println("INVALID INPUT");
                }
            }
        }


        System.out.println("Enter your A3 grade: ");
        A3 = input.nextInt();
        if(!(input.nextLine() == null)) {
            System.out.println("Did you submit it in time?");
            ans = input.nextLine();
            if (ans.equals("no")) {
                System.out.println("Did you submit it within 10 hours after the dead line?");
                ans = input.nextLine();
                if (ans.equals("no")) {
                    A3 = 0;
                } else if(ans.equals("yes")){
                    A3 = A3 - A3 * 0.1;
                }else{
                    System.out.println("INVALID INPUT");
                }
            }
        }

        System.out.println("Enter your A4 grade: ");
        A4 = input.nextInt();
        if(!(input.nextLine() == null)) {
            System.out.println("Did you submit it in time?");
            ans = input.nextLine();
            if (ans.equals("no")) {
                System.out.println("Did you submit it within 10 hours after the dead line?");
                ans = input.nextLine();
                if (ans.equals("no")) {
                    A4 = 0;
                } else if(ans.equals("yes")){
                    A4 =A4 - A4 * 0.1;
                }else{
                    System.out.println("INVALID INPUT");
                }
            }
        }

        System.out.println("Enter your A5 grade: ");
        A5 = input.nextInt();
        if(!(input.nextLine() == null)) {
            System.out.println("Did you submit it in time?");
            ans = input.nextLine();
            if (ans.equals("no")) {
                System.out.println("Did you submit it within 10 hours after the dead line?");
                ans = input.nextLine();
                if (ans.equals("no")) {
                    A5 = 0;
                } else if(ans.equals("yes")){
                    A5 = A5 - A5 * 0.1;
                }else{
                    System.out.println("INVALID INPUT");
                }
            }
        }

        System.out.println("Enter your A6 grade: ");
        A6 = input.nextInt();
        if(!(input.nextLine() == null)) {
            System.out.println("Did you submit it in time?");
            ans = input.nextLine();
            if (ans.equals("no")) {
                System.out.println("Did you submit it within 10 hours after the dead line?");
                ans = input.nextLine();
                if (ans.equals("no")) {
                    A6 = 0;
                } else if(ans.equals("yes")){
                    A6 = A6 - A6 * 0.1;
                }else{
                    System.out.println("INVALID INPUT");
                }
            }
        }


        double a1 = A1 * 0.15;
        double a2 = A2 * 0.10;
        double a3 = A3 * 0.20;
        double a4 = A4 * 0.25;
        double a5 = A5 * 0.15;
        double a6 = A6 * 0.15;


        assignments = a1 + a2 + a3 + a4 + a5 + a6;

        double mid = midterm * 0.25;
        double fin = finl * 0.3;
        double assign = assignments * 0.45;

        average = mid + fin + assign;


        System.out.println(name + "your average is: " + average);

    }
}
