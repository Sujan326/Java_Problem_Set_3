package com.assignment3;

import java.util.Scanner;

public class RepeatingElements {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Create an Array
        int arr[] = new int[5];

        //Adding array elements
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //Logic :
        System.out.println("Repeated Elements");
        for(int i = 0; i <arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
