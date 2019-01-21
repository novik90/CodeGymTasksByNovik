package com.codegym.task.task04.task0442;


/* 
Adding

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        while (true) {
            int num = scanner.nextInt();

            result += num;

            if (num == -1)
                break;
        }
        System.out.println(result);
    }
}
