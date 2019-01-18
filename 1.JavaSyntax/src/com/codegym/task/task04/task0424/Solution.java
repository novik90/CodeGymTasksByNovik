package com.codegym.task.task04.task0424;

/* 
Three numbers

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

        if (num1 == num2)
            System.out.println(3);
        else if (num1 == num3)
            System.out.println(2);
        else if (num2 == num3)
            System.out.println(1);
    }
}
