package com.codegym.task.task05.task0504;


/* 
The Three "Muscateers"

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Cat cat1 = new Cat("Cat 1", 4, 4, 5);
        Cat cat2 = new Cat("Cat 2", 5, 5, 7);
        Cat cat3 = new Cat("Cat 3", 8, 5, 2);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}