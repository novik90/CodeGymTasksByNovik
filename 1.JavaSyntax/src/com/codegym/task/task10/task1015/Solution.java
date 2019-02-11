package com.codegym.task.task10.task1015;

import java.util.ArrayList;
import java.util.Random;

/* 
Array of string lists

*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        Random random = new Random();
        ArrayList<String>[] arrayLists = new ArrayList[10];
        for (int i = 0; i < arrayLists.length; i++) {
            ArrayList<String> list = new ArrayList<>();
            for (int j = 0; j < 11; j++) {
                list.add(String.valueOf(random.nextInt(100)));
            }
            arrayLists[i] = list;
        }
        return arrayLists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}