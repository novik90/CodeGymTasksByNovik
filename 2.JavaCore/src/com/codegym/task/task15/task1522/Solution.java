package com.codegym.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Reinforce the singleton pattern

*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    // Add static block here
    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        // Implement step #5 here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = reader.readLine();
            switch (s) {
                case ("sun"):
                    thePlanet = Sun.getInstance();
                    break;
                case ("earth"):
                    thePlanet = Earth.getInstance();
                    break;
                case ("moon"):
                    thePlanet = Moon.getInstance();
                    break;
                default:
                    thePlanet = null;
                    break;
            }
        } catch (Exception e) {
            thePlanet = null;
        }
    }
}
