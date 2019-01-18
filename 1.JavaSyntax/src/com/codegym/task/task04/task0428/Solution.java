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



    }

    public static int positiveNum(int count){

        if (count > 0)
            count += 1;
        return count;
    }
}
