package com.company;

public class PA extends Crew{
    protected double hoursWorked;
    protected double payPerHour;

    //default constructor
    public PA(){};

    //custom constructor: initializes all variables
    public PA(String department, String name, String address, double payPerHour, double hoursWorked){
        //uses super's constructor to set the department, name, address, and pay
        super(department,payPerHour, name, address);
        this.hoursWorked=hoursWorked;
        this.payPerHour=payPerHour;
        this.pay=hoursWorked*payPerHour;//Pay for PAs depend on hours worked and pay per hour
    }

    //Getters and Setters
    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayPerHour() {
        return payPerHour;
    }

    public void setPayPerHour(double payPerHour) {
        this.payPerHour = payPerHour;
    }
}
