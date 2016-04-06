package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int row;
        int column;
        String order = null;

        Table T = new Table();

        System.out.println("Please give input:\t");


        row = input.nextInt();
        column = input.nextInt();
        order = input.next();

        if(column < 10 && (order.equals("i") || order.equals("d"))) {
            T.createTable(row, column, order);
        }
        else {
            System.out.println("Invalid input! Please try again");
        }

    }

}
