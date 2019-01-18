package com.codegym.task.task04.task0427;

/* 
Describing numbers

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        StringBuilder result = new StringBuilder();

        if (num%2==0)
            result.append("even ");
        else
            result.append("odd ");

        if (num > 99)
            result.append("three-digit number");
        else if (num > 9)
            result.append("two-digit number");
        else
            result.append("single-digit number");

        System.out.println(result.toString());
    }
}
