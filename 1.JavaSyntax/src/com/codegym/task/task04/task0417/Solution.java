package com.codegym.task.task04.task0417;

/* 
Do we have a pair?

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        String number1 = scanner.nextLine();
        String number2 = scanner.nextLine();
        String number3 = scanner.nextLine();

        String result = "";
        if (number1.equals(number2) && number1.equals(number3)) {
            result = number1 + " " + number2 + " " + number3;
            System.out.println(result);
        } else if (number1.equals(number2)) {
            result = number1 + " " + number2;
            System.out.println(result);
        } else if (number2.equals(number3)) {
            result = number2 + " " + number3;
            System.out.println(result);
        } else if (number3.equals(number1)) {
            result = number3 + " " + number1;
            System.out.println(result);
        } else {
            result = "";
        }
    }
}