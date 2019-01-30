package com.codegym.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Greater than 10? You're not a good fit for us

*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> numbers = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            numbers.add(i+1);
        }
        return numbers;
    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        Iterator j = set.iterator();
        for (int i = 0; i < set.size(); i++) {
            if ((Integer)j.next() > 10) {
                j.remove();
                i--;
            }
        }
        return set;
    }

    public static void main(String[] args) {
    }
}
