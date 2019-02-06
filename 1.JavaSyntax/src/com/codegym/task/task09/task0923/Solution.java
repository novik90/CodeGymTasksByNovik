package com.codegym.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Vowels and consonants

*/

public class Solution {
    public static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        char[] chars = scanner.nextLine().replace(" ", "").toCharArray();

        ArrayList<Character> vowel = new ArrayList<>();
        ArrayList<Character> consonant = new ArrayList<>();

        for (int i = 0; i < chars.length; i++) {
            if (isVowel(chars[i])) {
                vowel.add(chars[i]);
            } else {
                consonant.add(chars[i]);
            }
        }

        vowel.forEach(character -> System.out.print(character + " "));
        System.out.println();
        consonant.forEach(character -> System.out.print(character + " "));
    }

    // The method checks whether a letter is a vowel
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // Convert to lowercase

        for (char d : vowels)   // Look for vowels in the array
        {
            if (c == d)
                return true;
        }
        return false;
    }
}