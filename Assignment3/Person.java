package com.company;

/**
 * Created by emirhankutlu on 28/02/16.
 */
public class Person {

    private String personName;
    private int personNumber;

    // Holds reference to the person that was added before
    public Person next;

    /**
     * Constructs a person with a name and
     * phone number
     * @param personName the name of the person
     * @param personNumber the number of the person
     */
    public Person(String personName, int personNumber){
        this.personName = personName;
        this.personNumber = personNumber;
    }


    public void setPersonName(String personName){
        this.personName = personName;
    }

    public String getPersonName(){
        return personName;
    }

    public void setPersonNumber(int personNumber){
        this.personNumber = personNumber;
    }

    public int getPersonNumber(){
        return personNumber;
    }

    public void display(){
        System.out.println(personName + ": " + personNumber);
    }

    public String toString(){
        return personName;
    }


}

