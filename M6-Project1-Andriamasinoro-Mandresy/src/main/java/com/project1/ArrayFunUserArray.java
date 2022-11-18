package com.project1;

import java.util.Scanner;

public class ArrayFunUserArray {

    public static void main(String[] args) {
        int[] funArray= new int[5]; //declare the array type and size (integer and size of 5)
        Scanner scan = new Scanner(System.in); //Create scanner object to take user input
        System.out.println("Enter 5 integers:");

        //store integers
        for (int count=0;count<5;count++){ //loop 5 times to receive the 5 integers
            funArray[count]= Integer.parseInt(scan.next()); //the input is directly stored in the array
        }

        //print array
        System.out.println("The array is:");
        for (int current : funArray){ //print each element in array
            System.out.print(current+" ");
        }
    }
}
