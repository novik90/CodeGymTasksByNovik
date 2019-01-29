package com.codegym.task.task07.task0724;

/* 
Family census

*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> humans = new ArrayList<>();
        Human grandFatherJhon = new Human("Jhon", true, 68); // 1
        humans.add(grandFatherJhon);
        Human grandFatherJake = new Human("Jake", true, 69); // 2
        humans.add(grandFatherJake);
        Human grandMotherMissy = new Human("Missy", false, 72); // 3
        humans.add(grandMotherMissy);
        Human grandMotherKate = new Human("Kate", false, 65); // 4
        humans.add(grandMotherKate);
        Human fatherIvan = new Human("Ivan", true, 32, grandFatherJhon, grandMotherMissy); // 5
        humans.add(fatherIvan);
        Human motherLolly = new Human("Lolly", false, 30, grandFatherJake, grandMotherKate); // 6
        humans.add(motherLolly);
        Human Kurt = new Human("Kurt", true, 10, fatherIvan, motherLolly); // 7
        humans.add(Kurt);
        Human Polly = new Human("Polly", false, 8, fatherIvan, motherLolly); // 8
        humans.add(Polly);
        Human Jessy = new Human("Jessy", false, 6, fatherIvan, motherLolly); // 9
        humans.add(Jessy);

        humans.forEach(human -> System.out.println(human.toString()));
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            if (this.father != null)
                text += ", father: " + this.father.name;

            if (this.mother != null)
                text += ", mother: " + this.mother.name;

            return text;
        }
    }
}