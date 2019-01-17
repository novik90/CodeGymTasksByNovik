package com.codegym.task.task04.task0412;

/* 
Positive and negative numbers

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        int num = Integer.parseInt(inputText);
        int result = 0;
        if (num > 0) {
            result = num * 2;
        } else if (num < 0) {
            result = num + 1;
        } else {
            result = 0;
        }
        System.out.println(result);
    }

}