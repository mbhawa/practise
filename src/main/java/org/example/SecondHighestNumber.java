/*
 * Author Name: Mridul
 * Date: 18-04-2023
 * Created With: IntelliJ IDEA Community Edition
 */
package org.example;

import java.util.Scanner;

public class SecondHighestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        SecondHighestNumber.secondHighestNumber(arr);

    }

    public static void secondHighestNumber(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(array[1]);
    }
}