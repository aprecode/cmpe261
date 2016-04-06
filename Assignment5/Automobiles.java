package com.company;

/**
 * Created by emirhankutlu on 20/03/16.
 */
public class Automobiles extends Asset {

    private String color; // Color of automobile


    /**
     * Constructor for automobiles
     * @param serialNumber integer value of serial number
     * @param color color of automobile
     */
    public Automobiles(int serialNumber, String color){
        super(serialNumber);
        this.color = color;
    }

    public void setColor(String c){
        color = c;
    }

    public String getColor(){
        return color;
    }

    public void display(){
        System.out.println("Automobile | color: " + getColor() + " serial number: " + getSerialNumber());
    }

}
