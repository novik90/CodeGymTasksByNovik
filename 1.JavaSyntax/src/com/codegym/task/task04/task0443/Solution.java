package com.codegym.task.task04.task0443;


/* 
A name is a name

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        System.out.println("My name is " + name + ".");
        System.out.println("I was born on " + month + "/" + day + "/" + year);
    }
}
