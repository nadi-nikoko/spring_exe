package com.luv2code.demo.entity;

public class Student {

    private String name;
    private String surname;

    public Student() {
    }

    public Student(String name, String surname) {
        this.surname = surname;
        this.name = name;
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


}
