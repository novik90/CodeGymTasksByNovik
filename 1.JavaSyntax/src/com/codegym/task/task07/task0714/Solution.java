package com.codegym.task.task07.task0714;

import java.util.ArrayList;
import java.util.Scanner;

/* 
Words in reverse
javadoc comment.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> str = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            str.add(scanner.nextLine());
        }
        str.remove(2);
        for (int i = str.size(); i > 0; i--) {
            System.out.println(str.get(i-1));
        }
    }
}


