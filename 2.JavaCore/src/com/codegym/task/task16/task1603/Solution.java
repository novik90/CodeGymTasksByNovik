package com.codegym.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
A list and some threads

*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<>(5);

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            SpecialThread specialThread = new SpecialThread();
            Thread thread = new Thread(specialThread);
            list.add(thread);
        }

    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("This is the run method inside SpecialThread");
        }
    }
}
