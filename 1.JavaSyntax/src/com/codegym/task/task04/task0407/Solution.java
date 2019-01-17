package com.codegym.task.task04.task0407;

/* 
Cats in the Universe

*/

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        //write your code here
        Cat.count += 1;
        Cat cat2 = new Cat();
        //write your code here
        Cat.count += 1;
        System.out.println("The cat count is " + Cat.count);
    }

    public static class Cat {
        public static int count = 0;
    }
}