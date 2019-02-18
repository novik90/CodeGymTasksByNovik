package com.codegym.task.task13.task1326;

/* 
Sorting even numbers from a file

*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        reader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayList<Integer> list = new ArrayList<>();
        String temp;

        while ((temp = reader.readLine()) != null) {
            int i = Integer.parseInt(temp);
            if (i % 2 == 0) {
                list.add(i);
            }
        }

        Collections.sort(list);

        for (Integer i : list) {
            System.out.println(i);
        }

        inputStream.close();
    }
}
