package com.codegym.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/*
Expressing ourselves more concisely

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();
        int length = 0;
        for (int i = 0; i < 5; i++) {
            strings.add(scanner.nextLine());
        }
        length = strings.get(0).length();
        for (String s : strings) {
            if (s.length() < length) {
                length = s.length();
            }
        }
        for (String s : strings) {
            if (s.length() == length) {
                System.out.println(s);
            }
        }
    }
}
