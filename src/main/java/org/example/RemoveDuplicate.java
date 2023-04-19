package org.example;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 4, 5};
        int[] result = removeDuplicates(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        // Count the number of unique elements in the array
        int uniqueElements = 0;
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueElements++;
            }
        }

        // Create a new array with unique elements
        int[] result = new int[uniqueElements];
        int index = 0;
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                result[index++] = arr[i];
            }
        }

        return result;
    }
}