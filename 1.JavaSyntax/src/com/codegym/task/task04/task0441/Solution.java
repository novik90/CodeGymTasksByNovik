package com.codegym.task.task04.task0441;


/* 
Somehow average

*/
import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ((a >= b && a <= c) || (a <= b && a >= c))
            System.out.println(a);
        else if ((b >= a && b <= c) || (b <= a && b >= c))
            System.out.println(b);
        else
            System.out.println(c);
    }
}
