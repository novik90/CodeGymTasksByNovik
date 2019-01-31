package com.codegym.task.task04.task0416;

/* 
Crossing the road blindly

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        String[] s = {"green", "green", "green", "yellow", "red"};
        System.out.println(s[(int)number % 5]);
    }
}