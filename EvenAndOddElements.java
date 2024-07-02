package com.assignment3;

import java.util.Scanner;

public class EvenAndOddElements {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Create an Array
        int arr[] = new int[6];

        //Adding array elements
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //Logic :
        int countEven = 0;
        System.out.println("Even Elements");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
                countEven++;
            }
        }
        System.out.println("\nCount of Even Elements: " + countEven);

        System.out.println();

        int countOdd = 0;
        System.out.println("\nOdd Elements");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 1) {
                System.out.print(arr[i] + " ");
                countOdd++;
            }
        }
        System.out.println("\nCount of Odd Elements: " + countOdd);
    }
}
