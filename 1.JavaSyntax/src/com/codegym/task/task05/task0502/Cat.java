package com.codegym.task.task05.task0502;

/* 
Implement the fight method

*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //write your code here
        return this.age > anotherCat.age && this.weight > anotherCat.weight && this.strength > anotherCat.strength;
    }

    public static void main(String[] args) {

    }
}
