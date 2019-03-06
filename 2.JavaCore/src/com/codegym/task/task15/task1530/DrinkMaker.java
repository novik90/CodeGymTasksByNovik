package com.codegym.task.task15.task1530;

public abstract class DrinkMaker {

    abstract void getRightCup();

    abstract void addIngredients();

    abstract void pour();

    void makeDrink() {
        getRightCup();
        addIngredients();
        pour();
    }
}
