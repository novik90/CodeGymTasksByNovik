package com.codegym.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Longest string

*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        strings = new ArrayList<>();
        int length = 0;
        for (int i = 0; i < 5; i++) {
            strings.add(scanner.nextLine());
            if (strings.get(i).length() > length) {
                length = strings.get(i).length();
            }
        }
        for (String s : strings) {
            if (s.length() == length) {
                System.out.println(s);
            }
        }

    }
}
