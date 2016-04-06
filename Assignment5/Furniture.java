package com.company;

/**
 * Created by emirhankutlu on 20/03/16.
 */
public class Furniture extends Asset {

    private String brand; // Brand name for funiture


    /**
     * Constructor for furniture
     * @param serialNumber integer value for serial number
     * @param brand brand name for furniture
     */
    public Furniture(int serialNumber, String brand){
        super(serialNumber);
        this.brand = brand;
    }

    public void setBrand(String b){
        brand = b;
    }

    public String getBrand(){
        return brand;
    }

    public void display(){
        System.out.println("Furniture | brand: " + getBrand() + " serial number: " + getSerialNumber());
    }
}
