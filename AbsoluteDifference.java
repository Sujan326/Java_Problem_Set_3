package com.assignment3;

public class AbsoluteDifference {

    public static int sumOfMinAbsDifferences(int arr[]) {
        int result = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++) {
            int sum = 0;
            for(int j = 0; j < arr.length; j++) {
                sum += Math.abs(arr[i]-arr[j]);
            }
            result = Math.min(result, sum);
        }
        return result;
    }

    public static void main(String[] args) {

        int arr[] = {2, 4, 5, 3};

        System.out.println("Required Minimum Sum is: " + sumOfMinAbsDifferences(arr));

    }
}
