package com.codegym.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set of cats

*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //write your code here. step 3
        Iterator value = cats.iterator();
        int count = 0;
        while (value.hasNext()) {
            value.next();
            if (count == 0) {
                value.remove();
            }
            count++;
        }

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //write your code here. step 2
        Set<Cat> cats = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            cats.add(new Cat());
        }
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

    //step 1
    public static class Cat {

    }
}
