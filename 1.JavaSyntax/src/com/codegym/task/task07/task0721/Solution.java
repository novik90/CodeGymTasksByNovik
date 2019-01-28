package com.codegym.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Min and max in arrays

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        ArrayList<Integer> numbers = new ArrayList<>();
        int[] num = new int[20];
        int maximum;
        int minimum;

        for (int i = 0; i < 20; i++) {
            num[i] = Integer.parseInt(reader.readLine());
        }
        maximum = num[0];
        minimum = num[0];
        for (int i : num) {
            if (i > maximum) {
                maximum = i;
            }
            if (i < minimum) {
                minimum = i;
            }
        }

        System.out.print(maximum + " " + minimum);
    }
}
