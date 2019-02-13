package com.codegym.task.task11.task1123;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }

        //write your code here
        int minimum = array[0];
        int maximum = array[0];
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            if (minimum > temp) {
                minimum = temp;
            }
            if (maximum < temp) {
                maximum = temp;
            }
        }

        return new Pair<Integer, Integer>(minimum, maximum);
    }


    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
