package com.codegym.task.task08.task0828;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/*
Month number

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        HashMap<String, Integer> map = new HashMap<>();
        map.put("June", 6);
        map.put("October", 10);
        map.put("December", 12);
        map.put("May", 5);
        map.put("September", 9);
        map.put("March", 3);
        map.put("July", 7);
        map.put("January", 1);
        map.put("February", 2);
        map.put("April", 4);
        map.put("August", 8);
        map.put("November", 11);
        System.out.println(month + " is month " + map.get(month));
    }
}
