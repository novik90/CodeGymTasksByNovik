package com.codegym.task.task07.task0715;

import java.util.ArrayList;

/* 
More Sam-I-Am

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> str = new ArrayList<>();
        str.add("Sam");
        str.add("I");
        str.add("Am");
        for (int i = 0; i < str.size(); i ++) {
            i++;
            str.add(i, "Ham");
        }
        for (String s : str) {
            System.out.println(s);
        }
    }
}
