package com.codegym.task.task08.task0824;

/* 
Make a family

*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //write your code here
        ArrayList<Human> childrenOne = new ArrayList<>();
        ArrayList<Human> childrenTwo = new ArrayList<>();
        ArrayList<Human> childrenThree = new ArrayList<>();
        ArrayList<Human> childrenFour = new ArrayList<>();

        Human childOne = new Human("Bill", true, 25, childrenFour);
        Human childTwo = new Human("Steve", true, 22, childrenFour);
        Human childThree = new Human("Melissa", false, 18, childrenFour);
        childrenThree.add(childOne);
        childrenThree.add(childTwo);
        childrenThree.add(childThree);
        System.out.println(childOne);
        System.out.println(childTwo);
        System.out.println(childThree);

        Human father = new Human("Jack", true, 40, childrenThree);
        childrenOne.add(father);
        System.out.println(father);

        Human mother = new Human("Mary", false, 38, childrenThree);
        childrenTwo.add(mother);
        System.out.println(mother);

        Human grandFatherOne = new Human("Jhon", true, 72, childrenOne);
        System.out.println(grandFatherOne);

        Human grandFatherTwo = new Human("Ben", true, 71, childrenTwo);
        System.out.println(grandFatherTwo);

        Human grandMotherOne = new Human("Missy", false, 70, childrenOne);
        System.out.println(grandMotherOne);

        Human grandMotherTwo = new Human("Linda", false, 69, childrenTwo);
        System.out.println(grandMotherTwo);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        //write your code here

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", children: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
