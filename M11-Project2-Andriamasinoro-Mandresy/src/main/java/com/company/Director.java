package com.company;

public class Director extends Crew{
    protected double royalty;

    //default constructor
    public Director(){};

    //custom constructor: initializes all variables
    public Director(String department,double pay, String name, String address){
        //uses super's constructor to set the department, name, address, and pay
        super(department, pay, name, address);
        this.royalty=0;//starts with 0 royalty
    }

    //Getters and Setters
    public double getRoyalty() {
        return royalty;
    }

    public void setRoyalty(double royalty) {
        this.royalty = royalty;
    }
}
