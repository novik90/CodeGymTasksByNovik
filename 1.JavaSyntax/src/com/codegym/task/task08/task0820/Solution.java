package com.codegym.task.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Animal set

*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();

        //write your code here
        for (int i = 0; i < 4; i++) {
            result.add(new Cat());
        }

        return result;
    }

    public static Set<Dog> createDogs() {
        //write your code here
        HashSet<Dog> result = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            result.add(new Dog());
        }
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //write your code here
        Set<Object> animals = new HashSet<>();
        animals.addAll(cats);
        animals.addAll(dogs);
        return animals;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //write your code here
        HashSet<Object> copy = new HashSet<>(pets);
        Iterator it = copy.iterator();
        while (it.hasNext()) {
            it.next();
            pets.removeAll(cats);
        }
    }

    public static void printPets(Set<Object> pets) {
        //write your code here
        for (Object o : pets) {
            System.out.println(o);
        }
    }

    //write your code here
    public static class Cat {

    }

    public static class Dog {

    }
}
