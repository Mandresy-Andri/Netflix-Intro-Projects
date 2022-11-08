package com.project1;

import java.util.Scanner;

public class MonthConverterSwitch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  //Create scanner object to take user input
        System.out.println("Enter a number between 1 and 12:");
        int month = Integer.parseInt(scan.next());  //input is stored in int variable

        //The switch variable to be compared is the month number
        switch (month) {
            case 1://if case is 1 then the month is January (and so on)
                System.out.println("The month is January");
                break;
            case 2:
                System.out.println("The month is February");
                break;
            case 3:
                System.out.println("The month is March");
                break;
            case 4:
                System.out.println("The month is April");
                break;
            case 5:
                System.out.println("The month is May");
                break;
            case 6:
                System.out.println("The month is June");
                break;
            case 7:
                System.out.println("The month is July");
                break;
            case 8:
                System.out.println("The month is August");
                break;
            case 9:
                System.out.println("The month is September");
                break;
            case 10:
                System.out.println("The month is October");
                break;
            case 11:
                System.out.println("The month is November");
                break;
            case 12:
                System.out.println("The month is December");
                break;
            default:    //if none of the cases work, then the input is invalid
                System.out.println("You have entered an invalid number. You must enter a number between 1 and 12. Goodbye.");
                break;
        }
    }
}
