package com.codegym.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
File in a static block

*/

public class Solution {
    public static List<String> lines = new ArrayList<>();

    static {
        try {
            FileReader fileReader = new FileReader(Statics.FILE_NAME);
            BufferedReader reader = new BufferedReader(fileReader);
            String result;
            while ((result = reader.readLine()) != null) {
                lines.add(result);
            }
            fileReader.close();
            reader.close();
        } catch (IOException e) {

        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
