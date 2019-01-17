package com.codegym.task.task01.task0132;

/* 
Sum of the digits of a three-digit number

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //write your code here
        int result = 0;
        String s = String.valueOf(number);
        for (int i = 0; i < 3; i++){
            int temp = (int) Integer.parseInt(String.valueOf(s.charAt(i)));
            result = result + temp;
        }
        return result;
    }
}