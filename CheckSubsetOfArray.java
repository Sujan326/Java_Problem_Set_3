package com.assignment3;

public class CheckSubsetOfArray {

    public static boolean isSubset(int arr1[], int arr2[]) {

       int j = 0;
        for(int i = 0; i < arr2.length; i++) {
           for(j = 0; j < arr1.length; j++) {
               if(arr2[i] == arr1[j]) {
                   break;
               }
           }
           if(j == arr1.length) {
               return false;
           }
       }
        return true;
    }


    public static void main(String[] args) {

        int arr1[] = { 11, 10, 13, 21, 30, 70 };
        int arr2[] = { 11, 30, 70, 10 };

        if(isSubset(arr1, arr2)) {
            System.out.println("arr2[] is sub-string of arr1[]");
        } else {
            System.out.println("arr2[] is not a sub-string of arr1[]");
        }
    }
}
