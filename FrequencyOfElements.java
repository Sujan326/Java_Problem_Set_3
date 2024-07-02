package com.assignment3;

import java.util.Scanner;

public class FrequencyOfElements {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Create an Array
        int arr[] = new int[5];

        //Adding Array Elements
        System.out.println("Enter the Array Elements");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the value of X to know its frequency: ");
        int freq = sc.nextInt();

        int count = 0;

        //Finding the Frequency of Array Elements
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == freq) {
                count++;
            }
        }

        System.out.printf("The frequency of %d is %d: ", freq, count);


    }
}

