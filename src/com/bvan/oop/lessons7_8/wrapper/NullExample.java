package com.bvan.oop.lessons7_8.wrapper;

public class NullExample {

    public static void main(String[] args) {
//        int x = null;
        Integer x = null;
        x++; // x = Integer.valueOf(x.intValue() + 1);
        System.out.println(x);
    }
}
