package com.assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class LongestPalindromeInArray {

    public static boolean isPalindrome(int num) {
        String str = Integer.toString(num);
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Create an Array
        int arr[] = new int[6];

        //Adding Array Elements
        System.out.println("Enter the Array Elements");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //Sort the Array
        Arrays.sort(arr);

        //Logic :
        boolean foundPalindrome = false;
        for(int i = arr.length - 1; i >= 0; i--) {
            if(isPalindrome(arr[i])) {
                System.out.println("Palindrome Found: " + arr[i]);
                foundPalindrome = true;
                break;
            }
        }
        if(!foundPalindrome) {
            System.out.println("Palindrome not Found");
        }
    }
}
