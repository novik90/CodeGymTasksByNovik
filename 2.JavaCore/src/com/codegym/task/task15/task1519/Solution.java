package com.codegym.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
Different methods for different types

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = reader.readLine();
            if (s.equals("exit")) {
                break;
            }
            try {
                int i = Integer.parseInt(s);
                if (i < 128 && i > 0) {
                    short sh = (short) i;
                    print(sh);
                } else {
                    Integer integer = (Integer) i;
                    print(integer);
                }
            } catch (Exception e) {

                try {
                    double d = Double.parseDouble(s);
                    print(d);
                } catch (Exception ex) {
                    print(s);

                }
            }

        }
    }

    public static void print(Double value) {
        System.out.println("This is a Double. Value: " + value);
    }

    public static void print(String value) {
        System.out.println("This is a String. Value: " + value);
    }

    public static void print(short value) {
        System.out.println("This is a short. Value: " + value);
    }

    public static void print(Integer value) {
        System.out.println("This is an Integer. Value: " + value);
    }
}
