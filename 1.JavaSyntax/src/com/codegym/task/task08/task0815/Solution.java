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
        map.put("1 Novikov", "Ivan");
        map.put("2 Novikov", "Evgeni");
        map.put("3 Novikov", "Gennadi");
        map.put("4 Simonov", "Konstantin");
        map.put("5 Popov", "Ivan");
        map.put("6 Polyakov", "Roman");
        map.put("7 Popov", "Mihail");
        map.put("8 Mamedov", "Ramin");
        map.put("9 Novikov", "Roman");
        map.put("10 Smorodin", "Kirill");
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
