package com.assignment3;

public class MinimumScalarProduct {

    public static void main(String[] args) {

        int arr1[] = {10, 30, 40, 20};
        int arr2[] = {2, 4, 5, 1};

        //Sort in Ascending
        for(int i = 0; i < arr1.length; i++) {
            for(int j = i+1; j < arr1.length; j++) {
                if(arr1[i] > arr1[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }

        /*Printing Ascending Order
        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        */

        //Sort in Descending
        for(int i = 0; i < arr2.length; i++) {
            for(int j = i+1; j < arr2.length; j++) {
                if(arr2[i] < arr2[j]) {
                    int temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }

        /*Printing Descending Order
        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        */


        //Loop for multiplication of ( arr1[i] * arr2[i] )
        int product = 0;
        for(int i = 0; i < arr1.length; i++) {
                product = product + arr1[i] * arr2[i];

        }
        System.out.println("\nThe product of two array is: " + product);


    }
}
