package com.codegym.task.task02.task0216;

/* 
Minimum of three numbers

*/
public class Solution {
    public static int min(int a, int b, int c) {
        int i = a < b ? a : b;
        return i < c ? i : c;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }

}