package com.codegym.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/*
Longest sequence

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextInt());
        }
        result.add(list.get(0));
        int size = 1;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).equals(result.get(0))) {
                result.add(list.get(i));
                if (size < result.size()) {
                    size = result.size();
                }
            } else {
                result.removeAll(list);
                result.add(list.get(i));
            }
        }
        System.out.println(size);
    }
}