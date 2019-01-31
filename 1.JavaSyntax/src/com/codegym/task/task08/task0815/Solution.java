package com.codegym.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Census

*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Novikov", "Ivan");
        map.put("Novikov", "Evgeni");
        map.put("Novikov", "Gennadi");
        map.put("Simonov", "Konstantin");
        map.put("Popov", "Ivan");
        map.put("Polyakov", "Roman");
        map.put("Popov", "Mihail");
        map.put("Mamedov", "Ramin");
        map.put("KEK", "Roman");
        map.put("Smorodin", "Kirill");
        return map;
    }

    public static int getSameFirstNameCount(HashMap<String, String> map, String name) {
        int count = 0;
        for (Map.Entry<String, String> list : map.entrySet()) {
            if (list.getValue().equals(name)) {
                count++;
            }
        }
        return count;
    }

    public static int getSameLastNameCount(HashMap<String, String> map, String lastName) {
        int count = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey().equals(lastName)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
    }
}
