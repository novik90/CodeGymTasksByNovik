package com.codegym.task.task10.task1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

/* 
Functionality is not enough!

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            try {
                int id = Integer.parseInt(reader.readLine());
                String name = reader.readLine();
                if (name.isEmpty()) {
                    map.put(name, id);
                    list.add(name);
                    break;
                }
                map.put(name, id);
                list.add(name);
            } catch (Exception e) {
                break;
            }
        }

        for (String str : list) {
            System.out.println(map.get(str) + " " + str);
        }
    }
}
