package com.codegym.task.task04.task0429;

/*
Positive and negative numbers

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        positiveNumCount(num1, num2, num3);
    }
    public static void positiveNumCount(int a, int b, int c){
        int negativeCount = 0;
        int positiveCount = 0;

        if (a > 0)
            positiveCount += 1;
        else if (a < 0)
            negativeCount += 1;

        if (b > 0)
            positiveCount += 1;
        else if (b < 0)
            negativeCount += 1;

        if (c > 0)
            positiveCount += 1;
        else if (c < 0)
            negativeCount += 1;

        System.out.println("Number of negative numbers: " + negativeCount);
        System.out.println("Number of positive numbers: " + positiveCount);
    }
}
