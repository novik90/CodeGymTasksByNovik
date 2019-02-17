package com.codegym.task.task13.task1319;

import java.io.*;

/* 
Writing to a file from the console

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writeToFile = new BufferedWriter(new FileWriter(reader.readLine()));

        while (true) {
            String text = reader.readLine();
            if (text.equals("exit")) {
                writeToFile.write(text);
                break;
            }
            writeToFile.write(text);
            writeToFile.newLine();
        }
        reader.close();
        writeToFile.close();
    }
}
