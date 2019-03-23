package com.bvan.oop.lessons3_4;

/**
 * @author bvanchuhov
 */
public class Overloading {

    public static void main(String[] args) {
        double res = sum(10.0, 20);
        System.out.println(res);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }
}
