package com.codegym.task.task14.task1421;

public class Singleton {

    private static Singleton instance = null;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
            return instance;
        }
        return instance;
    }
}
