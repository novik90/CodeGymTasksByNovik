package com.codegym.task.task04.task0434;


/* 
Multiplication table

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        int h = 1;
        int v = 1;

        while (v < 11) {
            while (h < 11) {
                System.out.print(h * v + " ");
                h++;
            }
            System.out.println();
            h = 1;
            v++;
        }
    }
}
