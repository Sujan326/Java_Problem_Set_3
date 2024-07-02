package com.assignment3;

import java.util.Scanner;

public class LargestElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Creating an Array
        int arr[] = new int[5];

        //Adding Array Elements
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //Printing the array elements
        for(int value : arr) {
            System.out.print(value + " ");
        }

        //Logic : Sort in Ascending Order
        for(int i = 0; i <= arr.length - 1; i++) {
            for(int j = i+1; j <= arr.length - 1; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        /*
        Printing sorted array
        System.out.println("\nSorted Array");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        */

        //Finding Largest Element
        System.out.println("\nThe Largest Element is: " + arr[arr.length - 1]);
    }
}
