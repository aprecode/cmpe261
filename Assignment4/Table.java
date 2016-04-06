package com.company;

import java.util.Random;

/**
 * Created by emirhankutlu on 06/03/16.
 */
public class Table {

    private int row;
    private int column;
    private double[][] table;

    public Table(){

    }

    /**
     * Creates a random 2D array with respect to row and column values.
     * Prints out sorted table with in decreasing or increasing order
     * @param row Length of column
     * @param column Length of row
     * @param order Determine the arder of sorting (i/d)
     */
    public void createTable(int row, int column, String order){

        this.row = row;
        this.column = column;


        Random rand = new Random();

        double [][] table = new double [row][column];
        this.table = table;


        for (int ro = 0; ro < table.length; ro++) {
            for (int col = 0; col < table[ro].length; col++) {

                table[ro][col] = rand.nextDouble();

            }

        }

        
        for(int i = 0; i < table.length; i++) {

            for(int j = 0; j < table[i].length; j++) {

                System.out.print(table[i][j] + " ");

            }

            System.out.println();

        }

        System.out.println("***********");


        double[] aa = sum(table);



        for(int i=0; i<table.length; i++){
            System.out.println("Average of the row " + i + ": "+ aa[i]);
        }

        System.out.println("*********");



        if (order.equals("i"))
            sortI(aa,table);
        else if (order.equals("d"))
            sortD(aa,table);

    }



    /**
     * Sums and takes the average of every row
     * Add them into double array
     * @param table 2D array
     * @return double array of
     */
    public double[] sum(double[][] table){

        double[] sum = new double[10];
        double result = 0;

        for(int i=0; i<table.length; i++){
            for(int j=0; j<table[0].length; j++) {
                result = result + table[i][j];
            }
            sum[i] = result/table[0].length;
            result =0;
        }
        return sum;
    }


    /**
     * Swaps the rows in the specific position
     * @param table 2D Array
     * @param i First row position
     * @param j Second row position
     */
    public void swap(double[][] table, int i, int j) {

        double[] temp = table[i];
        table[i] = table[j];
        table[j] = temp;
    }



    /**
     * Prints out the 2D array as table
     * @param table 2D array
     */
    public void print(double[][] table) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++)
                System.out.printf("%9.4f ", table[i][j]);
            System.out.println();
        }
    }


    /**
     * Sorts given 2D array in increasing order
     * @param ave Double array of averages
     * @param table 2D array
     */
    public void sortI(double[] ave, double[][] table)
    {
        int j;
        double temp;
        boolean sw = true;


        while(sw) {
            sw= false; // if false, there's no more numbers to swap

            for( j=0;  j<table.length-1;  j++ ) {
                if (ave[ j ] > ave[j+1] ) {
                    temp = ave[j];  //swap numbers in double array
                    ave[j] = ave[j+1];
                    ave[j+1] = temp;
                    swap(table,j+1,j); //swap rows in double 2d array

                    sw = true;  //set true to make more swaps

                }
            }

        }
        System.out.println("The Sorted Array");
        print(table);
        System.out.println();

    }


    /**
     * Sorts given 2D array in decreasing order
     * @param num Double array of averages
     * @param data 2D array
     */
    public void sortD(double[] num, double[][] data)
    {
        int j;
        double temp;
        boolean sw = true;


        while(sw) {
            sw= false;  // if false, there's no more numbers to swap

            for(j=0; j<data.length-1; j++) {
                if (num[j] < num[j+1]) {
                    temp = num[j];  //swap numbers in double array
                    num[j] = num[j+1];
                    num[j+1] = temp;
                    swap(data,j+1,j); //swap rows in double 2d array

                    sw = true; //set true to make more swaps

                }
            }

        }
        System.out.println("The Sorted Array");
        print(data);
        System.out.println();

    }

}
