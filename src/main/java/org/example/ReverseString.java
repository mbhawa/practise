package org.example;/*
 * Author Name: Mridul
 * Date: 18-04-2023
 * Created With: IntelliJ IDEA Community Edition
 */

public class ReverseString {
    public static String reverseString1(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    public static String reverseString2(String str) {
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        while (end > start) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            end--;
            start++;
        }
        return new String(charArray);
    }
    public static String reverseString3(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
            return reverseString3(str.substring(1)) + str.charAt(0);
        }
    }
    public static String reverseString4(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public static String reverseString5(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
