package com.codegym.task.task10.task1013;

/* 
Human class constructors

*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private char sex;
        private short weight;
        private ArrayList<Human> child;
        private boolean dead;

        public Human() {

        }

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, char sex) {
            this.name = name;
            this.sex = sex;
        }

        public Human(String name, short weight) {
            this.name = name;
            this.weight = weight;
        }

        public Human(String name, int age, char sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, int age, char sex, short weight) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
        }

        public Human(String name, int age, char sex, short weight, ArrayList<Human> child) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
            this.child = child;
        }

        public Human(String name, int age, char sex, short weight, boolean dead) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
            this.dead = dead;
        }

        public Human(String name, int age, char sex, short weight, ArrayList<Human> child, boolean dead) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
            this.child = child;
            this.dead = dead;
        }


    }
}
