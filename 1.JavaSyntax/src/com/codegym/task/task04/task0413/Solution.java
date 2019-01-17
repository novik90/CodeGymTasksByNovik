package com.codegym.task.task04.task0413;

/* 
Day of the week

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        if (input >= 1 && input <= 7) {
            System.out.println(week[input-1]);
        } else {
            System.out.println("No such day of the week");
        }
    }
}