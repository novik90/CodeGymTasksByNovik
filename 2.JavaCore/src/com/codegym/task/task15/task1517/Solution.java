package com.codegym.task.task15.task1517;

/* 
Static modifiers and exceptions

*/

public class Solution {
    public static int A = 0;

    static {
        // Throw an exception here
        A = Integer.parseInt(null);
        System.out.println(A);
    }

    public static int B = 5;

    public static void main(String[] args) {
        System.out.println(B);
    }
}
