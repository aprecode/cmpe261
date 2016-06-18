package com.company;

/**
 * Created by emirhankutlu on 07/05/16.
 */
public class Student {

    private int ID;
    private String name;
    private String surname;
    private String gender;
    private int quiz1;
    private int quiz2;

    Student(int ID, String name, String surname, String gender, int quiz1, int quiz2){
        this.ID = ID;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.quiz1 = quiz1;
        this.quiz2 = quiz2;
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getQuiz1() {
        return quiz1;
    }

    public void setQuiz1(int quiz1) {
        this.quiz1 = quiz1;
    }

    public int getQuiz2() {
        return quiz2;
    }

    public void setQuiz2(int quiz2) {
        this.quiz2 = quiz2;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", quiz1=" + quiz1 +
                ", quiz2=" + quiz2 +
                '}';
    }
}
