package com.codegym.task.task06.task0613;

/* 
Cat and statics

*/

public class Solution {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();
        Cat cat6 = new Cat();
        Cat cat7 = new Cat();
        Cat cat8 = new Cat();
        Cat cat9 = new Cat();


        System.out.println(Cat.catCount);
    }

    public static class Cat {
        static public int catCount = 0;

        public Cat() {
            catCount++;
        }
    }
}
