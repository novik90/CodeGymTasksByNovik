package com.codegym.task.task06.task0606;

import java.io.*;
import java.util.Scanner;

/* 
Even and odd digits

*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int numLenght = String.valueOf(num).length();
        int count = 10;
        int temp = 0;

        for (int i = 0; i < numLenght; i++) {
            temp = Integer.parseInt(String.valueOf(num%count).substring(0, 1));
            if (temp%2==0){
                even++;
            } else {
                odd++;
            }
            count *= 10;
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
