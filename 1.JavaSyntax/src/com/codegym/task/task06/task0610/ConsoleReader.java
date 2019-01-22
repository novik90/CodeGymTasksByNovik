package com.codegym.task.task06.task0610;

import java.util.Scanner;

/* 
ConsoleReader class

*/

public class ConsoleReader {
    public static String readString() throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static int readInt() throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static double readDouble() throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static boolean readBoolean() throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        return scanner.nextBoolean();
    }

    public static void main(String[] args) {

    }
}
