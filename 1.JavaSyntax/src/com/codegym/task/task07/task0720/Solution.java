package com.codegym.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Shuffled just in time

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        int numN = Integer.parseInt(reader.readLine());
        int numM = Integer.parseInt(reader.readLine());
        for (int i = 0; i < numN; i++) {
            list.add(reader.readLine());
        }
        int count = 0;
        for (int i = 0; i < numM; i++) {
            list.add(list.get(0));
            list.remove(count);
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}
