package com.project1;

import java.util.Scanner;

public class ArrayFun5Words {

    public static void main(String[] args) {
        String[] wordArray = new String[5]; //declare String array with size 5
        Scanner scan = new Scanner(System.in); //Create scanner object to take user input
        System.out.println("Enter 5 words:");

        //store inputs in array
        for (int count=0;count<5;count++){ //loop five times for 5 inputs
            wordArray[count]= scan.nextLine(); //store input directly in array starting from index 0
        }

        //print array
        System.out.println("The array is:");
        for (String word:wordArray){ //print each word in array
            System.out.print(word+" ");
        }
    }
}

