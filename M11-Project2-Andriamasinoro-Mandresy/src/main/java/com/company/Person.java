package com.company;

public class Person {
    protected double pay;
    protected String name;
    protected String address;

    //default constructor
    public Person(){};

    //custom constructor: initializes all variables
    public Person(String name, String address, double pay){
        this.name=name;
        this.address=address;
    }


    //Getters and setters
    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
