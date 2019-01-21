package com.codegym.task.task05.task0526;

/* 
Man and woman

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Man man = new Man("Man", 28, "Saint-Petersburg");
        Man man2 = new Man("each Man", 28, "Saint-Petersburg");
        Woman woman = new Woman("Woman", 28, "Saint-Petersburg");
        Woman woman2 = new Woman("each Woman", 28, "Saint-Petersburg");
        System.out.println(man.toString());
        System.out.println(man2.toString());
        System.out.println(woman.toString());
        System.out.println(woman2.toString());
    }

    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return this.name + " " + this.age + " " + this.address;
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return this.name + " " + this.age + " " + this.address;
        }
    }
}
