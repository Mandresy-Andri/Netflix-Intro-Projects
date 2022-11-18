package com.project1;

import java.util.Scanner;

public class MonthConverterIf {

    //main method to run program
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Create scanner object to take user input
        System.out.println("Enter a number between 1 and 12:");
        int month = Integer.parseInt(scan.next()); //input is stored in int variable

        //if-else logic that writes month based on the number
        if(month==1) //if variable is equal to 1 then the month is January (and so on)
            System.out.println("The month is January");
        else if(month==2)
            System.out.println("The month is February");
        else if(month==3)
            System.out.println("The month is March");
        else if(month==4)
            System.out.println("The month is April");
        else if(month==5)
            System.out.println("The month is May");
        else if(month==6)
            System.out.println("The month is June");
        else if(month==7)
            System.out.println("The month is July");
        else if(month==8)
            System.out.println("The month is August");
        else if(month==9)
            System.out.println("The month is September");
        else if(month==10)
            System.out.println("The month is October");
        else if(month==11)
            System.out.println("The month is November");
        else if(month==12)
            System.out.println("The month is December");
        else    //if none of the conditions work, it means the input is wrong
            System.out.println("You have entered an invalid number. You must enter a number between 1 and 12. Goodbye.");
    }
}
