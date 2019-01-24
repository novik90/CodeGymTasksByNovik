package com.codegym.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
One large array and two small ones

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int[] arrLarge = new int[20];
        int[] arrFirst = new int[10];
        int[] arrSecond = new int[10];

        for (int i = 0; i < arrLarge.length; i++) {
            arrLarge[i] = scanner.nextInt();
        }
        for (int i = 0; i < arrFirst.length; i++) {
            arrFirst[i] = arrLarge[i];
        }
        for (int i = 0; i < arrSecond.length; i++) {
            arrSecond[i] = arrLarge[i+10];
            System.out.println(arrSecond[i]);
        }
    }
}
