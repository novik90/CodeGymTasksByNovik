package com.codegym.task.task09.task0927;

import java.util.*;

/*
Ten cats

*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> map = new HashMap<>();
        map.put("cat 1", new Cat("Cat"));
        map.put("cat 2", new Cat("Cat"));
        map.put("cat 3", new Cat("Cat"));
        map.put("cat 4", new Cat("Cat"));
        map.put("cat 5", new Cat("Cat"));
        map.put("cat 6", new Cat("Cat"));
        map.put("cat 7", new Cat("Cat"));
        map.put("cat 8", new Cat("Cat"));
        map.put("cat 9", new Cat("Cat"));
        map.put("cat 10", new Cat("Cat"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> cats = new HashSet<>();
        Iterator<Map.Entry<String, Cat>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Cat> entry = it.next();
            cats.add(entry.getValue());
        }
        return cats;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
