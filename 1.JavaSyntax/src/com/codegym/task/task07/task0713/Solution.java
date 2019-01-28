package com.codegym.task.task07.task0713;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 Playing Javarella.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();
        ArrayList<Integer> divisibleByThree = new ArrayList<>();
        ArrayList<Integer> divisibleByTwo = new ArrayList<>();
        ArrayList<Integer> otherNum = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            num.add(scanner.nextInt());
            if (num.get(i) % 3 == 0) {
                divisibleByThree.add(num.get(i));
            }
            if (num.get(i) % 2 == 0) {
                divisibleByTwo.add(num.get(i));
            }
            if (!(num.get(i) % 3 == 0) && !(num.get(i) % 2 == 0)) {
                otherNum.add(num.get(i));
            }
        }

        printList(divisibleByThree);
        printList(divisibleByTwo);
        printList(otherNum);
    }

    public static void printList(List<Integer> list) {
        for (int i : list) {
            System.out.println(i);
        }
    }
}
