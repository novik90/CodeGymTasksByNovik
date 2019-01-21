package com.codegym.task.task05.task0520;

/* 
Create a Rectangle class

*/


public class Rectangle {
    //write your code here
    int top, left, width, height;

    public Rectangle(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
    }

    public Rectangle(int top, int left) {
        this.top = top;
        this.left = left;
    }

    public Rectangle(int top) {
        this.top = top;
    }

    public static void main(String[] args) {

    }
}
