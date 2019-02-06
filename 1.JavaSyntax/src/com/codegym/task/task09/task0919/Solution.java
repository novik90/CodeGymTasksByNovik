package com.codegym.task.task09.task0919;

/* 
Dividing by zero

*/

import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void divideByZero() {
        System.out.println("O_o");
        Random random = new Random();
        int i = random.nextInt() * 9;
        int result = i / 0;
    }
}
