package com.codegym.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

/* 
Cat relations

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandmotherName = reader.readLine();
        Cat catGrandmother = new Cat(grandmotherName, 'f');

        String grandfatherName = reader.readLine();
        Cat catGrandfather = new Cat(grandfatherName, 'm');

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandmother, 'f');

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, catGrandfather, 'm');

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather, 'f');

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather, 'm');

        System.out.println(catGrandmother);
        System.out.println(catGrandfather);
        System.out.println(catMother);
        System.out.println(catFather);
        System.out.println(catDaughter);
        System.out.println(catSon);
    }

    public static class Cat {
        private String name;
        char type;
        private Cat parentFirst;
        private Cat parentSecond;

        Cat(String name, char type) {
            this.name = name;
            this.type = type;
        }

        Cat(String name, Cat parentFirst, char type) {
            this.name = name;
            this.parentFirst = parentFirst;
            this.type = type;
        }

        public Cat(String name, Cat parentFirst, Cat parentSecond, char type) {
            this.name = name;
            this.parentFirst = parentFirst;
            this.parentSecond = parentSecond;
            this.type = type;
        }

        @Override
        public String toString() {
            if (Objects.isNull(parentFirst) && Objects.isNull(parentSecond)) {
                return "The cat's name is " + name + ", no mother, no father ";
            } else if (Objects.isNull(parentSecond)) {
                if (type == 'm') {
                    return "The cat's name is " + name + ", " + parentFirst.name + " is the mother, no father";
                } else {
                    return "The cat's name is " + name + ", no mother, " + parentFirst.name + " is the father";
                }
            } else {
                return "The cat's name is " + name + ", " + parentSecond.name + " is the mother, " + parentFirst.name + " is the father";
            }
        }
    }

}
