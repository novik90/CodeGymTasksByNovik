package com.codegym.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Software update

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // List of addresses
        List<String> addresses = new ArrayList<>();
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) break;

            addresses.add(family);
        }

        // Read the house number
        String houseFamily = reader.readLine();
        int count = 0;
        for (String s : addresses) {
            if (s.equals(houseFamily)) {
                System.out.println(addresses.get(count + 1));
            }
            count++;
        }
    }
}
