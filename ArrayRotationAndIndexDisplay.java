package com.assignment3;
import java.util.Scanner;

public class ArrayRotationAndIndexDisplay {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Step 2: Enter number of elements of array
            System.out.println("Enter number of elements of array:");
            int elements = sc.nextInt();

            // Step 3: Enter number of rotations of array
            System.out.println("Enter number of rotations of array:");
            int rotations = sc.nextInt();

            // Step 5: Input array elements
            int[] array = new int[elements];
            System.out.println("Enter array elements:");
            for (int i = 0; i < elements; i++) {
                array[i] = sc.nextInt();
            }

            // Step 6: Run a for loop, i=0; i< elements; , i++.
            for (int i = 0; i < elements; i++) {
                // Step 7: Then modulo your rotations with elements
                    /*
                        After 2 Rotations:
                        Index 0 (original index 0 + 2) % 5 = 2 % 5 = 2 → Element: 3
                        Index 1 (original index 1 + 2) % 5 = 3 % 5 = 3 → Element: 4
                        Index 2 (original index 2 + 2) % 5 = 4 % 5 = 4 → Element: 5
                        Index 3 (original index 3 + 2) % 5 = 5 % 5 = 0 → Element: 1
                        Index 4 (original index 4 + 2) % 5 = 6 % 5 = 1 → Element: 2
                    */
                int index = (i + rotations) % elements;
                System.out.println("Index " + i + ": " + array[index]);
            }
            System.out.println();

            // Step 9: Print number of indexes and rotations
            System.out.println("Number of indexes: " + elements);
            System.out.println("Number of rotations: " + rotations);
        }
    }



