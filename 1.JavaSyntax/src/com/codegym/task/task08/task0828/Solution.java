package com.codegym.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
Month number

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        ArrayList<String> arrMonth = new ArrayList<>();
        arrMonth.add("January");
        arrMonth.add("February");
        arrMonth.add("March");
        arrMonth.add("April");
        arrMonth.add("May");
        arrMonth.add("June");
        arrMonth.add("July");
        arrMonth.add("August");
        arrMonth.add("September");
        arrMonth.add("October");
        arrMonth.add("November");
        arrMonth.add("December");
        int count = 1;
        for (String s : arrMonth) {
            if (Objects.equals(month, s)) {
                System.out.println(month + " is month " + count);
            }
            count++;
        }
    }
}
