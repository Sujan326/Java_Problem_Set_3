package com.assignment3;

import java.util.Scanner;

public class SortArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Create an Array
        int arr[] = new int[8];  //Input : 3, 2, 4, 1, 10, 30, 40, 20

        //Adding the Array Elements
        System.out.println("Enter the Array Elements: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //Logic : Sort the Array in Ascending and Descending Separately wrt to "mid"

        int mid = arr.length / 2;

        //Sorting in Ascending
        for(int i = 0; i < mid; i++) {
            for(int j = i+1; j < mid; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        //Sorted in Descending Order
        for(int i = mid; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("First half sorted in ascending and second half sorted in descending");
        for(int i = 0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
