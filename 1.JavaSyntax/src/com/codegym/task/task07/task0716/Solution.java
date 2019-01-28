package com.codegym.task.task07.task0716;

import java.util.ArrayList;

/* 
R or L

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("rose"); // 0
        list.add("love"); // 1
        list.add("lyre"); // 2
        list.add("bark"); // 2
        list.add("wade"); // 2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        int coutnR = 0;
        int coutnL = 0;
        ArrayList<String> result = new ArrayList<>();
        for (String s : list) {
            for (int j = 0; j < s.length(); j++) {
                if (s.substring(j).startsWith("r")) {
                    coutnR++;
                }
                if (s.substring(j).startsWith("l")) {
                    coutnL++;
                }
            }
            if (((coutnL & coutnR) > 0)) {
                result.add(s);
            }
            if (coutnL > 0 && coutnR == 0) {
                result.add(s);
                result.add(s);
            }
            if (coutnL == 0 && coutnR == 0){
                result.add(s);
            }
            coutnR = 0;
            coutnL = 0;
        }
        return result;
    }
}