package com.bvan.oop.lessons11_12.multithreading;

public class CurrentThreadExample {

    public static void main(String[] args) {
        new Thread(() -> printCurrentThreadName()).start();
        new Thread(new MyTask()).start();
    }

    public static void printCurrentThreadName() {
        Thread currentTread = Thread.currentThread();
        System.out.println(currentTread.getName());
    }
}

class MyTask implements Runnable {

    @Override
    public void run() {
        CurrentThreadExample.printCurrentThreadName();
    }
}
