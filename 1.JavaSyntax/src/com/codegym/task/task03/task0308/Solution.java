package com.codegym.task.task03.task0308;

/* 
Product of 10 numbers

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        int result = 1;
        for (int i = 1; i <= 10; i++){
            result *= i;
        }
        System.out.println(result);
    }
}
