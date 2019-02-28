package com.codegym.task.task15.task1506;

/* 
Something superfluous

*/

public class Solution {
    public static void main(String[] args) {
        print((short) 1);
        print((Number) 1);
        print(1);
        print((Integer) 1);
        print((int) 1);
    }

    public static void print(Integer i) {
        System.out.println("This is an Integer");
    }

//    public static void print(int i) {
//        System.out.println("This is an Integer");
//    }

//    public static void print(Short i) {
//        System.out.println("This is an Object");
//    }

    public static void print(Object i) {
        System.out.println("This is an Object");
    }

    public static void print(double i) {
        System.out.println("This is a double");
    }

//    public static void print(Double i) {
//        System.out.println("This is a double");
//    }

//    public static void print(float i) {
//        System.out.println("This is a Double");
//    }
}
