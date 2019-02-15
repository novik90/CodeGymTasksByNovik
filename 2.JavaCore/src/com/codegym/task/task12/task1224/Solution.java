package com.codegym.task.task12.task1224;

/* 
Unknown animal

*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        ArrayList<Object> list = new ArrayList<>(Arrays.asList(Solution.class.getClasses()));
        if (list.contains(o.getClass()) && o.getClass() != Pig.class) {
            return o.getClass().getSimpleName();
        }
        return "Animal";
    }

    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}
