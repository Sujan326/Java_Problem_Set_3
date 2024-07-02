package com.assignment3;

import java.util.Scanner;

public class DistinctElements { //Non-Repeating Element

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Create an array
        int arr[] = {10, 30, 40, 20, 10, 20, 50, 10};

        //Array to keep a track of visited elements
        int visited[] = new int[arr.length];
        int countDistinct = 0;

        for(int i = 0; i < arr.length; i++) { //Comparing the First Element

            if(visited[i] == 1) { //If number visited, then skip that number
                continue;
            }

            boolean isDistinct = true;
            for (int j = i + 1; j < arr.length; j++) {//Comparing the second element

                if (arr[i] == arr[j]) { //If arr[i] and arr[j] is same then, not unique numbers
                    visited[j] = 1;
                    isDistinct = false; //Which results in false
                }
            }

            //Increment the count if the number is Unique
            if (isDistinct) {
                countDistinct++;
            }
        }
        System.out.println("Distinct Element count is: " + countDistinct);


    }
}
