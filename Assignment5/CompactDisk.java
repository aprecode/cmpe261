package com.company;

/**
 * Created by emirhankutlu on 20/03/16.
 */
public class CompactDisk extends Asset {

    private int capacity; //Compact Disk capacity in Mb

    /**
     * Constructor for compact disk
     * @param serialNumber integer value for serial number
     * @param capacity integer value for compact disk capacity
     */
    public CompactDisk(int serialNumber, int capacity){
        super(serialNumber);
        this.capacity = capacity;
    }

    public void setCapacity(int c){
        capacity = c;
    }

    public int getCapacity(){
        return capacity;
    }

    public void display(){
        System.out.println("Compact Disk | capacity: " + getCapacity() + "Mb" + " serial number: " + getSerialNumber());
    }
}
