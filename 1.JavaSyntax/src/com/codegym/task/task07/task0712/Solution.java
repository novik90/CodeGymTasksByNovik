package com.codegym.task.task07.task0712;

import java.util.ArrayList;
import java.util.Scanner;

/*
Shortest or longest

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strings.add(scanner.nextLine());
        }
        int min = strings.get(0).length();
        int max = strings.get(0).length();
        int minId = 0;
        int maxId = 0;
        for (int i = 0; i < 10; i++) {
            if (min > strings.get(i).length()) {
                min = strings.get(i).length();
                minId = i;
            }
            if (max < strings.get(i).length()) {
                max = strings.get(i).length();
                maxId = i;
            }
        }
        if (minId < maxId) {
            System.out.println(strings.get(minId));
        } else {
            System.out.println(strings.get(maxId));
        }
    }
}
