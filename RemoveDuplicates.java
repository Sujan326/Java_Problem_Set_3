package com.assignment3;

import java.util.Scanner;

public class RemoveDuplicates { //Duplicates --> Repeating elements

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
        System.out.println("Array after removing Duplicates");
        for(int i = 0; i < arr.length; i++) {
            boolean duplicates = false;
            for(int j = 0; j < i; j++) {
                if(arr[i] == arr[j]) {
                    duplicates = true;
                }
            }
            if(duplicates == false) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
