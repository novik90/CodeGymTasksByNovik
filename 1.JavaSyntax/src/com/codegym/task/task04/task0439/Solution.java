package com.codegym.task.task04.task0439;

/* 
Chain letter

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        for (int i = 0; i < 10; i++) {
            System.out.println(name + " loves me.");
        }
    }
}
