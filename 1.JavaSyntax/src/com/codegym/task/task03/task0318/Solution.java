package com.codegym.task.task03.task0318;

/* 
Plan to conquer the world

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        String name;
        String age;

        Scanner scanner = new Scanner(System.in);

        age = scanner.nextLine();
        name = scanner.nextLine();

        System.out.println(name + " will take over the world in " + age + " years. Mwa-ha-ha!");
    }
}
