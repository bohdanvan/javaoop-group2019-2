package com.bvan.oop.lessons11_12.multithreading;

/**
 * @author bvanchuhov
 */
public class ThreadUtils {

    public static void println(String message) {
        Thread currentThread = Thread.currentThread();
        System.out.println(String.format("%-20s: %s", currentThread.getName(), message));
    }
}
