package com.codegym.task.task10.task1005;

/* 
Task No. 5 about integer type conversions

*/

public class Solution {
    public static void main(String[] args) {
        int a = (byte) 44;
        int b = (short) 300;
        short c = (short) (b - a);
        System.out.println(c);
    }
}