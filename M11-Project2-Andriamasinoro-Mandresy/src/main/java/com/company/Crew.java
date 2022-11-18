package com.company;

public class Crew extends Person{
    protected double totalEarned;
    protected String department;

    //default constructor
    public Crew(){};

    //custom constructor: initializes all variables
    public Crew(String department,double pay, String name,String address){
        //uses super's constructor to set the name, address, and pay
        super(name, address, pay);
        this.department=department;
        this.pay=pay;
        this.totalEarned=0;//starts with 0 money
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
