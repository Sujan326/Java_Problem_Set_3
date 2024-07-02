package com.assignment3;

import java.util.Scanner;

public class SumOfElements {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Creating an Array
        int arr[] = new int[5];

        //Adding Elements to Array
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //Logic : Add each array element to sum
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
        }

        //Printing the Sum
        System.out.println("The Sum of Array Elements is: " + sum);
    }
}
