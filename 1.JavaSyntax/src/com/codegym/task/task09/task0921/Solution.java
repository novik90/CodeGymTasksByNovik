package com.codegym.task.task09.task0921;

import java.util.ArrayList;
import java.util.Scanner;

/*
Method in a try-catch

*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();
        try {
            while (true) {
                num.add(scanner.nextInt());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (Integer i : num) {
            System.out.println(i);
        }
    }
}
