package com.codegym.task.task04.task0437;


/* 
Triangle of eights

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        int eight = 8;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(eight);
            }
            System.out.println();
        }
    }
}
