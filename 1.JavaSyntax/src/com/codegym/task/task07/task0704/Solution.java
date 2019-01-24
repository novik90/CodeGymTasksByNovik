package com.codegym.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
Flip the array

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = arr.length; i > 0; i--) {
            System.out.println(arr[i-1]);
        }
    }
}

