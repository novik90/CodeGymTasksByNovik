package com.codegym.task.task09.task0912;

/* 
Exception when working with numbers

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
}
