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

        if (num > 99 && num < 1000)
            System.out.println(result.append("three-digit number"));
        else if (num > 9 && num < 100)
            System.out.println(result.append("two-digit number"));
        else if (num > 0 && num < 10)
            System.out.println(result.append("single-digit number"));
    }
}
