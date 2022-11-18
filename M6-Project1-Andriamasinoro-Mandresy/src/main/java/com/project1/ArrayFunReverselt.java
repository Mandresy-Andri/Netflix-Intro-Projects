package com.project1;

import java.util.Scanner;

public class ArrayFunReverselt {

    public static void main(String[] args) {
        int[] funArray= {1,2,3,4,5}; //declare and initialize the array with the values 1 to 5
        int[] funArrayReverse= new int[5]; //declare the array type and size (integer and size of 5)

        //for loop with two pointers
        // One pointer starts at the end of the initialized array to take its values from the end
        //One pointer starts at the beginning of the declared array to store the values
        for (int count=0,index=4;count<5;count++,index--){
            funArrayReverse[count]=funArray[index];
        }

        //print array
        System.out.println("Normal Array:");
        for (int value: funArray){//print each element in array
            System.out.print(value+" ");
        }

        //print reverse array
        System.out.println("\nReverse Array:");
        for (int value: funArrayReverse){//print each element in array
            System.out.print(value+" ");
        }
    }
}