/*
 * Author Name: Mridul
 * Date: 18-04-2023
 * Created With: IntelliJ IDEA Community Edition
 */
package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string");
        String string1 = scanner.next();
        System.out.println("Enter the second string");
        String string2 = scanner.next();

        char[] charArray1=string1.toCharArray();
        char[] charArray2= string2.toCharArray();

        if (charArray1.length==charArray2.length){
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            boolean result=Arrays.equals(charArray1,charArray2);
            if (result==true){
                System.out.println(string1+" is equal to "+ string2);
            }else {
                System.out.println(string1+ " is not equal to "+ string2);
            }

        }else {
            System.out.println(string1+" is not equal to "+ string2);
        }
    }
}
