package com.codegym.task.task08.task0822;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Minimum of N numbers

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // Find the minimum here
        return Collections.min(array);
    }

    public static List<Integer> getIntegerList() throws IOException {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = scanner.nextInt();
        for (int i = 0; i < Math.abs(n); i++) {
            list.add(scanner.nextInt());
        }
        return list;
    }
}
