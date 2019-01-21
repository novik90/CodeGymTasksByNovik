package com.codegym.task.task04.task0428;

/* 
Positive number

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    private int count;
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        positiveNumCount(num1, num2, num3);
    }

    public static void positiveNumCount(int a, int b, int c){
        int count = 0;

        if (a < 1 && b < 1 && c < 1)
            System.out.print(0);
        else {
            if (a > 0)
                count += 1;
            if (b > 0)
                count += 1;
            if (c > 0)
                count += 1;
            System.out.println(count);
        }
    }
}
