package com.codegym.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Only for the rich

*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Novikov", 100);
        map.put("Petrov", 250);
        map.put("Kozlov", 1010);
        map.put("Simonov", 450);
        map.put("Popov", 500);
        map.put("Polyakov", 499);
        map.put("Strelcov", 501);
        map.put("Mamedov", 200);
        map.put("KEK", 999);
        map.put("Smorodin", 0);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getValue() < 500) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        removeItemFromMap(createMap());
    }
}