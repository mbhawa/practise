/*
 * Author Name: Mridul
 * Date: 18-04-2023
 * Created With: IntelliJ IDEA Community Edition
 */
package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        System.out.println("Enter the String Value");
        Scanner scanner = new Scanner(System.in);
        String input= scanner.next();
        System.out.println("Character Count : ");
        CharacterCount.characterCount(input);
    }

    public static void characterCount(String string) {
        char[] charArray = string.toCharArray();
        Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        for (char c : charArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() +" : "+entry.getValue());
        }
    }


}
