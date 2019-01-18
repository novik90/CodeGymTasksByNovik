package com.codegym.task.task04.task0416;

/* 
Crossing the road blindly

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        String numberInput = scanner.nextLine();
        double number = Double.parseDouble(numberInput);
        double result = number;

        if (number > 4)
            result = number % 5;

        if (result < 3) {
            System.out.println("green");
        } else if (result < 4) {
            System.out.println("yellow");
        } else {
            System.out.println("red");
        }
    }
}