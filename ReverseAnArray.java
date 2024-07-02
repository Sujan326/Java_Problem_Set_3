package com.assignment3;

import java.util.Scanner;

public class ReverseAnArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Create an array
        int arr[] = new int[5];

        //Adding Elements
        System.out.println("Enter the Array Elements");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //Printing Original Array
        System.out.println("Original Array");
        for(int value : arr) {
            System.out.print(value + " ");
        }

        System.out.println();

        //Logic : Reverse an Array (Using Decrementing for loop)
        System.out.println("\nReverse Array");
        for(int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
