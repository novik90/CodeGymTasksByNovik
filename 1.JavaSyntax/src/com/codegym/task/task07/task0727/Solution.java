package com.codegym.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Changing functionality

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        ArrayList<String> listUpperCase = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.length() % 2 == 0) {
                listUpperCase.add(s);
                listUpperCase.add(s);
            } else {
                listUpperCase.add(s);
                listUpperCase.add(s);
                listUpperCase.add(s);
            }
        }

        for (int i = 0; i < listUpperCase.size(); i++) {
            if (i == 0){
                System.out.print(listUpperCase.get(i) + " ");
            } else {
                if (listUpperCase.get(i).equals(listUpperCase.get(i - 1))) {
                    System.out.print(listUpperCase.get(i) + " ");
                } else {
                    System.out.println();
                    System.out.print(listUpperCase.get(i) + " ");
                }
            }
        }
    }
}
