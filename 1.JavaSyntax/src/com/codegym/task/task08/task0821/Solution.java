package com.codegym.task.task08.task0821;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Shared last names and first names

*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //write your code here
        Map<String, String> map = new HashMap<>();
        map.put("Novikov", "Ivan");
        map.put("Novikov", "Ivan");
        map.put("Kozlov", "Ivan");
        map.put("Novikov", "Ivan");
        map.put("Popov", "Chelik");
        map.put("Polyakov", "Roman");
        map.put("Kozlov", "Roman");
        map.put("Mamedov", "Roman");
        map.put("KEK", "Roman");
        map.put("Smorodin", "Ivan");
        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
