package com.codegym.task.task13.task1318;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Reading a file

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();

        FileInputStream fileInputStream = new FileInputStream(fileName);
        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            System.out.print((char) data);
        }
        fileInputStream.close();
        bufferedReader.close();
    }
}