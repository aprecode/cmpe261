package com.company;

/**
 * Created by emirhankutlu on 20/03/16.
 */
public class ElectronicAppliances extends Asset {

    private String name; // Name for the Electronic Appliance e.g. iron, television


    /**
     * Constructor for Electronic Appliances
     * @param serialNumber integer value for serial number
     * @param name type of electronic appliance
     */
    public ElectronicAppliances(int serialNumber, String name){
        super(serialNumber);
        this.name = name;
    }

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void display(){
        System.out.println("Electronic Appliance | type: " + getName() + " serial number: " + getSerialNumber());
    }

}
