package com.codegym.task.task04.task0426;

/* 
Labels and numbers

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        StringBuilder result = new StringBuilder();

        if (a == 0) {
            result.append("Zero");
        } else {
            if (a > 0)
                result.append("Positive ");
            else
                result.append("Negative ");
            if (a % 2 == 0)
                result.append("even number");
            else
                result.append("odd number");
        }
        System.out.println(result.toString());
    }
}
