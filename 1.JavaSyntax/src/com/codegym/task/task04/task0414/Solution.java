package com.codegym.task.task04.task0414;

/*
Number of days in the year

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        String yearText = scanner.nextLine();
        int year = Integer.parseInt(yearText);
        int days = 0;

        if (year%400==0) {
            days = 366;
        } else if (year%100==0) {
            days = 365;
        } else if (year%4==0) {
            days = 366;
        } else {
            days = 365;
        }
        System.out.println("Number of days in the year: " + days);
    }
}