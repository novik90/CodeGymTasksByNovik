package com.codegym.task.task05.task0532;

import java.io.*;

/* 
Task about algorithms

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum = 0;
        int result = 0;
        while (true) {
            if(maximum == -1) {
                break;
            }

            maximum = Integer.parseInt(reader.readLine());
            if (maximum > result){
                result = maximum;
            }
        }
        //write your code here

        System.out.println(result);
    }
}
