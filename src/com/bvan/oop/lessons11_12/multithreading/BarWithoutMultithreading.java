package com.bvan.oop.lessons11_12.multithreading;

public class BarWithoutMultithreading {

    public static void main(String[] args) {
        ThreadUtils.println("Bar is opened");

        new Drinker(1).run();
        new Drinker(2).run();
        new Drinker(3).run();
        new Drinker(4).run();
        new Drinker(5).run();

        ThreadUtils.println("Bar is closed");
    }
}
