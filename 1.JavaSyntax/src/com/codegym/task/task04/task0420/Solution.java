package com.codegym.task.task04.task0420;

/* 
Sorting three numbers

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);

        int temp = 0;
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if (number1 < number2) {
            temp = number1;
            number1 = number2;
            number2 = temp;
        }
        if (number2 < number3) {
            temp = number2;
            number2 = number3;
            number3 = temp;
        }
        if (number1 < number2) {
            temp = number1;
            number1 = number2;
            number2 = temp;
        }
        System.out.println(number1 + " " + number2 + " " + number3 + " ");
    }
}
