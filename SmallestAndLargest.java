package com.assignment3;

import java.util.Scanner;

public class SmallestAndLargest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Create an array
        int arr[] = new int[5];

        //Adding Elements to Array
        System.out.println("Enter the Array Elements: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //Printing the Array Elements
        for(int value : arr) {
            System.out.print(value + " ");
        }

        //Logic : Sort in Ascending Order
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        /*
        Printing the sorted array
        System.out.println("\nSorted Array");
        for(int value : arr) {
            System.out.print(value + " ");
        }
        */

        //Finding the Smallest and Largest Element
        System.out.println("\nThe Smallest and Largest Element is: " + arr[0] + " and " + arr[arr.length - 1]);
    }
}
