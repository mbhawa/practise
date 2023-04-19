/*
 * Author Name: Mridul
 * Date: 18-04-2023
 * Created With: IntelliJ IDEA Community Edition
 */
package org.example;

import java.util.Scanner;

public class SwapCases {
    public static void main(String[] args) {
        System.out.println("Enter the string for swap cases:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.print("Swapped Cases : ");
        SwapCases.swapCases(input);
    }

    public static void swapCases(String string) {
        char[] charArray = string.toCharArray();
        for (char c : charArray) {
            if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
            } else {
                c = Character.toUpperCase(c);
            }
            System.out.print(c);
        }

    }
}
