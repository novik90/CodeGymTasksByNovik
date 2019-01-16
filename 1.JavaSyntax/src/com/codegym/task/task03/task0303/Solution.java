package com.codegym.task.task03.task0303;

/* 
Currency exchange

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        System.out.println(convertEurToUsd(2, 2));
        System.out.println(convertEurToUsd(2341, 232));
    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        //write your code here
        return eur * exchangeRate;
    }
}
