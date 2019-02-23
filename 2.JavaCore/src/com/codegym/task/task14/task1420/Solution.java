package com.codegym.task.task14.task1420;

/* 
GCD

*/

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        if (a <= 0) {
            throw new IllegalArgumentException();
        }
        int b = Integer.parseInt(scanner.nextLine());
        if (b <= 0) {
            throw new IllegalArgumentException();
        }

        System.out.println(findGCD(a, b));
    }
    private static int findGCD(int a, int b) {
        return BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue();
    }
}
