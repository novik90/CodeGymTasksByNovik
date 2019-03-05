package com.codegym.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/*
Request parser

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String URL = reader.readLine();
        ArrayList<Object> param = new ArrayList<>();
        URL = URL.substring(URL.indexOf("?") + 1);
        String[] str = URL.split("&");

        for (int i = 0; i < str.length; i++) {
            if (str[i].contains("=")) {
                String temp = str[i].substring(0, str[i].indexOf("="));
                System.out.print(temp + " ");
                if (temp.equals("obj")) {
                    param.add(str[i].substring(str[i].indexOf("=") + 1));
                }
            } else {
                System.out.print(str[i] + " ");
            }
        }
        System.out.println();
        for (Object o : param) {
            try {
                double d = Double.parseDouble(o.toString());
                alert(d);
            } catch (Exception e) {
                alert(o.toString());
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
