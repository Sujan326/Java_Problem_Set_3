package com.assignment3;

public class DisjointArray {

    public static void main(String[] args) {

        //Two arrays are said to be disjoint if the intersection of the array is empty.
        //Which both array must have Unique elements.

        int arr1[] = {10, 51, 3, 43, 6};
        int arr2[] = {80, 71, 29, 5};

        boolean isDisjoint = true;
        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j]) {
                    isDisjoint = false;
                    break;
                }
            }
        }
        if(isDisjoint) {
            System.out.print("Yes");
        } else {
            System.out.println("No");
        }
    }
}
