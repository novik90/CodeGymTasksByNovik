package com.codegym.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
The end

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        String addWord;
        while (true) {
            addWord = reader.readLine();
            if (addWord.equals("end")) {
                break;
            }
            list.add(addWord);
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}