package com.codegym.task.task08.task0817;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
We don't need repeats

*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Novikov", "Ivan");
        map.put("Petrov", "Ivan");
        map.put("Kozlov", "Ivan");
        map.put("Simonov", "Ivan");
        map.put("Popov", "Chelik");
        map.put("Polyakov", "Roman");
        map.put("Strelcov", "Roman");
        map.put("Mamedov", "Roman");
        map.put("KEK", "Roman");
        map.put("Smorodin", "Kirill");
        return map;
    }

    public static void removeFirstNameDuplicates(Map<String, String> map) {
        HashMap<String, String> copy = new HashMap<>(map);
        int size = 0;
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            removeItemFromMapByValue(map, pair.getValue());
            if (size - map.size() == 1) {
                map.put(pair.getKey(), pair.getValue());
            }
            size = map.size();
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        removeFirstNameDuplicates(createMap());
    }
}
