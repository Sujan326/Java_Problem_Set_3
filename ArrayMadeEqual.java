package com.assignment3;

public class ArrayMadeEqual {

    public static boolean makeEqual(int arr[]) {

        for(int i = 0; i < arr.length; i++) {

            // Divide number by 2
            while (arr[i] % 2 == 0) {
                arr[i] /= 2;
            }

            // Divide number by 3
            while (arr[i] % 3 == 0) {
                arr[i] /= 3;
            }
        }

        // Remaining numbers
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != arr[0]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int arr[] = { 50, 100, 75 };

        //This is an Equal Array
        //Ex: arr[0] = 25
        //Ex: arr[1] = 25
        //Ex: arr[2] = 25

        if(makeEqual(arr)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
