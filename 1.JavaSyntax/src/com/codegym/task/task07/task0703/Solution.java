package com.codegym.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
Lonely arrays interact

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        String[] strArray = new String[10];
        int[] intArray = new int[10];
        for (int i = 0; i < intArray.length; i ++) {
            strArray[i] = scanner.nextLine();
            intArray[i] = strArray[i].length();
            System.out.println(intArray[i]);
        }

    }
}
