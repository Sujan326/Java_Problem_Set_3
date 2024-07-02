package com.assignment3;

public class SymmetricPairs {

    public static void main(String[] args) {

        int arr[][] = { {1, 2}, {3, 4}, {5, 1}, {4, 3}, {1, 5} };

        for(int i = 0; i < 5; i++) {
            for(int j = i+1; j < 5; j++) {
                if(arr[i][0] == arr[j][1] && arr[i][1] == arr[j][0]) {
                    System.out.println(arr[i][0] + " " + arr[j][0]);
                }
            }
        }
    }
}
