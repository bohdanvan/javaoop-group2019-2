package com.bvan.oop.lessons11_12.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BarWithExecutorService {

    public static void main(String[] args) {
        ThreadUtils.println("Bar is opened");

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        for (int drinkerId = 1; drinkerId <= 5; drinkerId++) {
            executorService.submit(new Drinker(drinkerId));
        }

        executorService.shutdown();

        ThreadUtils.println("Bar is closed");
    }
}
