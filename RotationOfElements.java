package com.assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class RotationOfElements {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Original Array" + Arrays.toString(array));

        System.out.println("Enter the number of elements to shift: ");
        int k = sc.nextInt();

        int temp[] = new int[k];

        // Store the first k elements in temp[]
        for (int i = 0; i < k; i++) {
            temp[i] = array[i];
        }

        // Shift the remaining elements to the left
        for (int i = k; i < array.length; i++) {
            array[i - k] = array[i];
        }

        // Add elements from temp[] at the end of the array
        for (int i = 0; i < k; i++) {
            array[array.length - k + i] = temp[i];
        }

        System.out.println("Array after shifting");
        System.out.println(Arrays.toString(array));
    }
}
