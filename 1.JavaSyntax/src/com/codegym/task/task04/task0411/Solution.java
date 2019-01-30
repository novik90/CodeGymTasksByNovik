package com.codegym.task.task04.task0411;

/* 
Seasons on Terra

*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(1);
        checkSeason(2);
        checkSeason(3);
        checkSeason(4);
        checkSeason(5);
        checkSeason(6);
        checkSeason(7);
        checkSeason(8);
        checkSeason(9);
        checkSeason(10);
        checkSeason(11);
        checkSeason(12);
        checkSeason(13);
        checkSeason(0);
    }

    public static void checkSeason(int month) {
        if (month > 0 && month < 13) {
            if (month < 3) {
                System.out.println("winter");
            } else if (month < 6) {
                System.out.println("spring");
            } else if (month < 9) {
                System.out.println("summer");
            } else if (month < 12) {
                System.out.println("autumn");
            } else {
                System.out.println("winter");
            }
        } else {
            System.out.println("not a month");
        }
    }
}