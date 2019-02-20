package com.codegym.task.task14.task1408;

public class AfricanHen extends Hen {
    @Override
    int getMonthlyEggCount() {
        return 472;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " I come from " + Continent.AFRICA + ". I lay " + getMonthlyEggCount() + " eggs a month.";
    }
}
