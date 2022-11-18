package com.company;

public class Actor extends Person{
    protected double totalEarned;
    protected String role;

    //default constructor
    public Actor(){};

    //custom constructor: initializes all variables
    public Actor(String role,double pay, String name, String address){
        //uses super's constructor to set the name, address, and pay
        super(name, address, pay);
        this.role=role;
        this.pay=pay;
        this.totalEarned=0;//start with 0 money
    }

    //Getters and Setters
    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public double getTotalEarned() {
        return totalEarned;
    }

    public void setTotalEarned(double totalEarned) {
        this.totalEarned = totalEarned;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
