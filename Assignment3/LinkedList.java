package com.company;

/**
 * Created by emirhankutlu on 28/02/16.
 */

public class LinkedList {

    // Reference for the last person added to the LinkedList
    private Person firstPerson;

    LinkedList(){
        firstPerson = null;
    }

    /**
     * Checks if the linkedList is empty
     * @return boolean
     */
    public boolean isEmpty(){
        return(firstPerson == null);
    }

    /**
     * Inserts new person to the address book
     * @param personName the name of new person to be added
     * @param personNumber the number of new person to be added
     */
    public void insertPerson(String personName, int personNumber){

        Person newPerson = new Person(personName,personNumber);
        newPerson.next = firstPerson;
        firstPerson = newPerson;
    }

    /**
     * Finds specific person from the address book
     * @param personName the name for the person to be found
     * @return person who seached for
     */
    public Person find(String personName){
        Person thePerson = firstPerson;

        if(!isEmpty()){

            while(thePerson.getPersonName() != personName){

                if(thePerson.next == null){
                    // No matching found
                    return null;
                }else {
                    // Matching found
                    thePerson = thePerson.next;
                }
            }
        }else {
            System.out.println("Book is empty");
        }
        return thePerson;
    }

    /**
     * Removes the person from the address book
     * @param personName the name for the person to be deleted
     * @return if it founds a match, gives the information about deletion
     */
    public Person removePerson(String personName){
        Person focusPerson = firstPerson;
        Person prePerson = firstPerson;

        while(focusPerson.getPersonName() != personName){

            if(focusPerson.next == null){
                // No match found
                return null;
            }else {
                prePerson = focusPerson;
                focusPerson = focusPerson.next;
            }
        }
        if(focusPerson == firstPerson){

            // If you are here, then there is a match with
            // the firstPerson
            firstPerson = firstPerson.next;
        }else {

            // If you are here, then there is a match with
            // another person other than the firstPerson
            System.out.println("Found a match");
            System.out.println("Focus Person: " + focusPerson);
            System.out.println("First Person: " + firstPerson);

            prePerson.next = focusPerson.next;
        }

        return focusPerson;
    }

    /**
     * Modifies name of a specific person in the addressbook
     * @param personNameBefore the name that wanted to be changed in the addressbook
     * @param personNameAfter the new name for the person
     */
    public void modifyPersonName(String personNameBefore, String personNameAfter){

        Person thePerson = find(personNameBefore);

        thePerson.setPersonName(personNameAfter);

    }


    /**
     * Displays the current addressbook
     */
    public void display(){

        Person thePerson = firstPerson;

        while(thePerson != null){
            thePerson.display();
            System.out.println("Next Person: " + thePerson.next);
            thePerson = thePerson.next;
            System.out.println();
        }
    }
}
