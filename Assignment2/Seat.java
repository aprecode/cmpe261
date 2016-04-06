package com.company;

/**
 * Created by emirhankutlu on 21/02/16.
 */
public class Seat {

    private String type;
    private double price;
    private int number;
    private double total;


    public static void main(String[] args){

        Seat A = new Seat("A",30.0,5);
        Seat B = new Seat("B",20.0,3);
        Seat C = new Seat("C",10.0,2);

        System.out.println(totalSales(A.getPrice(),B.getPrice(),C.getPrice(),A.getNumber(),B.getNumber(),C.getNumber()));
    }

    public Seat(){
    }

    public Seat(String type, double price, int number){

        this.type = type;
        this.price = price;
        this.number = number;

    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public int getNumber(){
        return number;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public String toString(){
        return "Type: " + type + " " + "Price: " +  price + " " + "Number: " + number;
    }



    public static double totalSales(double P1, double P2, double P3, int N1, int N2, int N3){

        double totalSales = P1 * N1 + P2 * N2 + P3 * N3;
        return totalSales;
    }

}
