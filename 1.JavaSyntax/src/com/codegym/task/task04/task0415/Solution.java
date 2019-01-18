package com.codegym.task.task04.task0415;

/* 
Rule of the triangle

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        String sideA = scanner.nextLine();
        String sideB = scanner.nextLine();
        String sideC = scanner.nextLine();

        int a = Integer.parseInt(sideA);
        int b = Integer.parseInt(sideB);
        int c = Integer.parseInt(sideC);

        if(a < (b + c) && b < (a + c) && c < (a + b)) {
            System.out.println("The triangle is possible.");
        } else {
            System.out.println("The triangle is not possible.");
        }
    }
}