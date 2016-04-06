package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double a = totalSales(30,20,10,1,2,3);

        System.out.println("Total price is: " + a);

        Seat A = new Seat();
        A.setType("A");
        A.setPrice(20.5);
        A.setNumber(4);
        System.out.println(A);
        System.out.println("Type is: " + A.getType());
        System.out.println("Price for per seat: " + A.getPrice());
        System.out.println("Number of seats: " + A.getNumber());

        Seat B = new Seat("B",15.5,2);
        Seat C = new Seat("C",10,5);

        System.out.println(totalSales(A.getPrice(),B.getPrice(),C.getPrice(),A.getNumber(),B.getNumber(),C.getNumber()));


    }

    public static double totalSales(double numberA, double numberB, double numberC, int priceA, int priceB, int priceC){

        double totalSales = numberA*priceA + numberB*priceB + numberB*priceB;
        return totalSales;

    }
}
