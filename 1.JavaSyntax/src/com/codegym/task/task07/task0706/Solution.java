package com.codegym.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
Streets and houses

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int max;
        int odd = 0, even = 0;
        int[] houses = new int[15];
        for (int i = 0; i < houses.length; i++) {
            houses[i] = scanner.nextInt();
        }

        max = houses[0];
        for (int i = 0; i < houses.length; i++) {
            if (houses[i]>max) {
                max = houses[i];
            }
            if (i%2==0){
                even += houses[i];
            } else {
                odd += houses[i];
            }
        }

        if (even > odd){
            System.out.println("Even-numbered houses have more residents.");
        } else {
            System.out.println("Odd-numbered houses have more residents.");
        }
    }
}
