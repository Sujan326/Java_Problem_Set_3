package com.assignment3;

import java.util.Scanner;

public class NonRepeatingElements {

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
        System.out.println("Non-Repeated Elements");
        for(int i = 0; i <arr.length; i++) { //Iterates over each element of the array.
            boolean isRepeated = false;
            for(int j = 0; j < arr.length; j++) { //Checks if the current element is repeated by comparing it with every other element.
                if(i!=j && arr[i] == arr[j]) {
                    isRepeated = true;
                    break;
                }
            }
            if(!isRepeated) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
