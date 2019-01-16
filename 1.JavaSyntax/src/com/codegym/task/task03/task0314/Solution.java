package com.codegym.task.task03.task0314;

/* 
Multiplication table

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        int output = 1;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(output + " ");
                output += i;
            }
            output = i+1;
            System.out.println();
        }
    }
}
