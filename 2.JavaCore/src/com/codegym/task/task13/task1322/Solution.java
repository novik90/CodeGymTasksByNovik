package com.codegym.task.task13.task1322;

/* 
SimpleObject interface

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        SimpleObject<String> stringObject = new StringObject<Object>();
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    static class StringObject<T> implements SimpleObject<String> {

        @Override
        public SimpleObject<String> getInstance() {
            return new StringObject<String>();
        }
    }

}
