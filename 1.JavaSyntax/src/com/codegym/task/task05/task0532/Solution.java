package com.codegym.task.task05.task0532;

import java.io.*;

/* 
Task about algorithms

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum;
        int count = 0;
        int i = 0;
        int j = Integer.parseInt(reader.readLine());

        while (i < j){
            if (i == 0) {
                maximum = Integer.parseInt(reader.readLine());
                count = maximum;
            } else {
                maximum = Integer.parseInt(reader.readLine());
                if (maximum > count) {
                    count = maximum;
                }
            }
            i++;
        }

        System.out.println(count);
    }
}
