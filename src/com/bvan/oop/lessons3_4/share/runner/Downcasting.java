package com.bvan.oop.lessons3_4.share.runner;

import com.bvan.oop.lessons3_4.share.Circle;
import com.bvan.oop.lessons3_4.share.Rectangle;
import com.bvan.oop.lessons3_4.share.Shape;

/**
 * @author bvanchuhov
 */
public class Downcasting {

    public static void main(String[] args) {
        printInfo(new Circle(10));
        printInfo(new Rectangle(10, 20));
    }

    private static void printInfo(Shape s) {
        if (s instanceof Rectangle) { // better, but bad practice
            Rectangle r = (Rectangle) s; // bad practice
            System.out.println(r.getWidth());
        }
    }
}
