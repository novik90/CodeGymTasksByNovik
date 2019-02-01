package com.codegym.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Going national

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String[] arr = s.trim().split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > 1) {
                arr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
                result.append(" ").append(arr[i]);
            } else {
                result.append(" ").append(arr[i].toUpperCase());
            }
        }
        System.out.println(result.toString().trim());
    }
}
