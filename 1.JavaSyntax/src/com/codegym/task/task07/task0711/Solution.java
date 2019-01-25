package com.codegym.task.task07.task0711;

import java.util.ArrayList;
import java.util.Scanner;

/* 
Remove and insert

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextLine());
        }
        String temp;
        for (int i = 0; i < 13; i++) {
            temp = list.get(4);
            list.remove(4);
            list.add(0, temp);
        }
        for (String i : list) {
            System.out.println(i);
        }
    }
}
