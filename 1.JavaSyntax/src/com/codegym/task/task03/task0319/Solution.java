package com.codegym.task.task03.task0319;

/* 
Predictions

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String number1 = scanner.nextLine();
        String number2 = scanner.nextLine();

        System.out.println(name + " will receive " + number1 + " in " + number2 + " years.");
    }
}
