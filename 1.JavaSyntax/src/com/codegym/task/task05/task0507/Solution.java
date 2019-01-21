package com.codegym.task.task05.task0507;

/* 
Arithmetic mean

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double result = 0;
        int n;

        while (true) {
            n = scanner.nextInt();
            if (n == -1) {
                result = result / count;
                System.out.println(result);
                break;
            }
            result = result + n;
            count++;
        }
    }
}

