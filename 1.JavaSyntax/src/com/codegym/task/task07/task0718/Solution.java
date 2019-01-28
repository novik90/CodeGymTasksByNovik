package com.codegym.task.task07.task0718;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Checking the order

*/
public class Solution {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextLine());
        }

        int wordLength = list.get(0).length();
        int count = 0;

        for (String s : list) {
            if (s.length() < wordLength) {
                System.out.println(count);
                break;
            }
            wordLength = s.length();
            count++;
        }
    }
}

