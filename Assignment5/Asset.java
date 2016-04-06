package com.company;

/**
 * Created by emirhankutlu on 20/03/16.
 */
public abstract class Asset {

    private int serialNumber;

    public Asset next; // Holds reference for the asset that was added before


    /**
     * Asset constructor
     * @param serialNumber integer value for serial number
     */
    public Asset(int serialNumber){
        this.serialNumber = serialNumber;
    }

    public void setSerialNumber(int number){
        serialNumber = number;
    }

    public int getSerialNumber(){
        return serialNumber;
    }

    /**
     *  Asset display method for the linkedList representation
     */
    public void display(){
        System.out.println("Serial Number: " + getSerialNumber());
    }

    /**
     *  Asset toString method, helps display method for linkedList representation
     * @return string value of integer serial number
     */
    public String toString(){
        return "Serial Number: " + getSerialNumber();
    }
}
