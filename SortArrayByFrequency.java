package com.assignment3;

import java.util.*;

public class SortArrayByFrequency {

    public static void main(String[] args) {
        int[] array = {5, 3, 5, 2, 8, 5, 2, 8, 3, 3};
        int[] sortedArray = sortByFrequency(array);

        System.out.println("Sorted array by frequency:");
        System.out.println(Arrays.toString(sortedArray));
    }

    public static int[] sortByFrequency(int[] array) {
        // Step 1: Count the frequencies using a HashMap
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create a list from array and sort based on frequency and value
        List<Integer> list = new ArrayList<>();
        for (int num : array) {
            list.add(num);
        }

        list.sort((a, b) -> {
            int freqCompare = frequencyMap.get(b).compareTo(frequencyMap.get(a));
            if (freqCompare != 0) {
                return freqCompare; // Sort by frequency in descending order
            } else {
                return a - b; // If frequencies are the same, sort by value in ascending order
            }
        });

        // Step 3: Convert the sorted list back to an array
        int[] sortedArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            sortedArray[i] = list.get(i);
        }

        return sortedArray;
    }
}
