package com.codegym.task.task09.task0922;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
What's today's date?

*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat newDate = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        String sDate = scanner.nextLine();
        Date date = simpleDateFormat.parse(sDate);
        System.out.print(newDate.format(date).toUpperCase());
    }
}
