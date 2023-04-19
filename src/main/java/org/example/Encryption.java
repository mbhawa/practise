/*
 * Author Name: Mridul
 * Date: 19-04-2023
 * Created With: IntelliJ IDEA Community Edition
 */
package org.example;

import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Input the string : ");
        String input= scanner.next();
        Encryption.encryption(input);
    }
    public static void encryption(String input) {
        char[] charArray = input.toCharArray();
        for (char c : charArray) {
            int temp= (int)c+4;
            if (Character.isUpperCase(c)) {
                if (temp>90){
                    temp=temp-90+64;
                }
            } else if (Character.isLowerCase(c)) {
                if (temp>122){
                    temp=temp-122+97;
                }
            }
            c=(char)temp;
            System.out.print(c);
        }
    }
}