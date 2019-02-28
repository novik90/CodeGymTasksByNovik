package com.codegym.task.task15.task1507;

/* 
OOP: Method overloading

*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
        printMatrix(2, 3, 'c');
        printMatrix(2, 3, 0);
        printMatrix(2, 3, (Integer) 1);
        printMatrix(2, 3, true);
        printMatrix(2, 3, 0.27456d);
        printMatrix(2, 3, 0.29847f);
        printMatrix(2, 3, (short) 5);
        printMatrix(2, 3, (byte) 5);
        printMatrix(2, 3, 753364757463537L);
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Filling with String objects");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(int m, int n, char c) {
        System.out.println("Filling with char objects");
        printMatrix(m, n, (Object) c);
    }

    public static void printMatrix(int m, int n, int i) {
        System.out.println("Filling with int objects");
        printMatrix(m, n, (Object) i);
    }

    public static void printMatrix(int m, int n, boolean b) {
        System.out.println("Filling with boolean objects");
        printMatrix(m, n, (Object) b);
    }

    public static void printMatrix(int m, int n, double d) {
        System.out.println("Filling with double objects");
        printMatrix(m, n, (Object) d);
    }

    public static void printMatrix(int m, int n, float f) {
        System.out.println("Filling with float objects");
        printMatrix(m, n, (Object) f);
    }

    public static void printMatrix(int m, int n, Integer iC) {
        System.out.println("Filling with Integer objects");
        printMatrix(m, n, (Object) iC);
    }

    public static void printMatrix(int m, int n, short sh) {
        System.out.println("Filling with short objects");
        printMatrix(m, n, (Object) sh);
    }

    public static void printMatrix(int m, int n, byte bt) {
        System.out.println("Filling with byte objects");
        printMatrix(m, n, (Object) bt);
    }
}
