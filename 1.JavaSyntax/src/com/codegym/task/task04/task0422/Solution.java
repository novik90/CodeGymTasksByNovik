package com.codegym.task.task04.task0422;

/* 
18+

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();

        if (age < 18)
            System.out.println("Grow up a little more");
    }
}
