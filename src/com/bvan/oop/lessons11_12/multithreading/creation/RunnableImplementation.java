package com.bvan.oop.lessons11_12.multithreading.creation;

import com.bvan.oop.lessons11_12.multithreading.ThreadUtils;

/**
 * @author bvanchuhov
 */
public class RunnableImplementation {

    public static void main(String[] args) {
        ThreadUtils.println("Start");

        new Thread(() -> ThreadUtils.println("Hello")).start();

        ThreadUtils.println("Goodbye");
    }
}
