package com.codegym.task.task09.task0926;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/* 
List of number arrays

*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        Random random = new Random();

        int[] arr = {5, 2, 4, 7, 0};
        ArrayList<int[]> arrayList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int lengthArray = arr[i];
            int[] newArray = new int[lengthArray];
            for (int j = 0; j < lengthArray; j++) {
                newArray[j] = random.nextInt(9);
            }
            arrayList.add(newArray);
        }
        return arrayList;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
