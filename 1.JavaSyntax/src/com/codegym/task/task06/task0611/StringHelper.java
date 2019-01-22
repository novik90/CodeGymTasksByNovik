package com.codegym.task.task06.task0611;

/* 
StringHelper class

*/

public class StringHelper {
    public static String multiply(String s) {
        return String.format("%s%s%s%s%s", s, s, s, s, s);
    }

    public static String multiply(String s, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(s);
        }
        return result.toString();
    }

    public static void main(String[] args) {
    }
}
