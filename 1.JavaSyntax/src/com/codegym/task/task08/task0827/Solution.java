package com.codegym.task.task08.task0827;

import java.util.Date;

/* 
Working with dates

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date dateNow = new Date(date);
        Date dateF = new Date(dateNow.getYear(), 0, 1);
        return ((dateNow.getTime() - dateF.getTime()) / 1000 / 60 / 60 / 24) % 2 == 0;
    }
}
