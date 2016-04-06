package com.company;

/**
 * Created by emirhankutlu on 20/03/16.
 */
public class LinkedList{

    private Asset firstAsset; // Reference for the last asset added to the LinkedList

    /**
     * LinkedList constructor
     */
    LinkedList(){
        firstAsset = null;
    }

    /**
     * Checks if the linkedList is empty
     * @return boolean
     */
    public boolean isEmpty() {
        return(firstAsset == null);
    }

    /**
     * Inserts new electronic appliance to the linkedList
     * @param serialNumber integer value for serial number
     * @param name name of electronic appliance
     */
    public void insertElectronicAppliance(int serialNumber,String name){

        Asset newEl = new ElectronicAppliances(serialNumber,name);
        newEl.next = firstAsset;
        firstAsset = newEl;
    }

    /**
     * Inserts new automobile to the linkedList
     * @param serialNumber integer value for serial number
     * @param color color of automobile
     */
    public void insertAutomobile(int serialNumber, String color){

        Asset newAu = new Automobiles(serialNumber,color);
        newAu.next = firstAsset;
        firstAsset = newAu;
    }
    /**
     * Inserts new compact disk to the linkedList
     * @param serialNumber integer value for serial number
     * @param capacity int value for compact disk capacity
     */
    public void insertCompactDisk(int serialNumber, int capacity){

        Asset newCo = new CompactDisk(serialNumber,capacity);
        newCo.next = firstAsset;
        firstAsset = newCo;
    }
    /**
     * Inserts new furniture to the linkedList
     * @param serialNumber integer value for serial number
     * @param brand name of brand
     */
    public void insertFurniture(int serialNumber,String brand){

        Asset newFu = new Furniture(serialNumber,brand);
        newFu.next = firstAsset;
        firstAsset = newFu;
    }


    /**
     * Finds specific asset from the linkedList by serial number
     * @param serialNumber int value for the serial number to be found
     * @return serial number which is searched for
     */
    public Asset findAsset(int serialNumber){
        Asset theAsset = firstAsset;

        if(!isEmpty()){

            while(theAsset.getSerialNumber() != serialNumber){

                if(theAsset.next == null){
                    // No matching found
                    return null;
                }else {
                    // Matching found
                    theAsset = theAsset.next;
                }

            }
            System.out.println("Match Found!");
        }else {
            System.out.println("List Is Empty");
        }
        return theAsset;

    }


    /**
     * Removes specific asset from the linketList by serial number
     * @param serialNumber int value for the serial number to be deleted
     * @return if it founds a match, gives the information about deletion
     */
    public Asset deleteAsset(int serialNumber){
        Asset focusAsset = firstAsset;
        Asset preAsset = firstAsset;

        while(focusAsset.getSerialNumber() != serialNumber){

            if(focusAsset.next == null){
                // No match found
                return null;
            }else {
                preAsset = focusAsset;
                focusAsset = focusAsset.next;
            }
        }
        if(focusAsset == firstAsset){

            // If you are here, then there is a match with
            // the firstPerson
            firstAsset = firstAsset.next;
        }else {

            // If you are here, then there is a match with
            // another person other than the firstPerson
            System.out.println("Found a match");
            System.out.println("Focus Asset: " + focusAsset);
            System.out.println("First Asset: " + firstAsset);

            preAsset.next = focusAsset.next;
        }

        return focusAsset;
    }


    /**
     * Modifies serial number of a specific asset in the linkedList
     * @param serialNumberBefore the number that wanted to be changed in the linkedList
     * @param serialNumberAfter the new serial number for the asset
     */
    public void modifyAsset(int serialNumberBefore, int serialNumberAfter){

        Asset theAsset = findAsset(serialNumberBefore);
        theAsset.setSerialNumber(serialNumberAfter);

        System.out.println("Serial number modified successfully");

    }

    /**
     * Displays the current linkedList
     */
    public void display(){

        Asset theAsset = firstAsset;

        while(theAsset != null){
            theAsset.display();
            System.out.println("Next Asset -> " + theAsset.next);
            theAsset = theAsset.next;
            System.out.println();
        }
    }

}
