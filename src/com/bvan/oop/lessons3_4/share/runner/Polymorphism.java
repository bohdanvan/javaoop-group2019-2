package com.bvan.oop.lessons3_4.share.runner;

import com.bvan.oop.lessons3_4.share.Circle;
import com.bvan.oop.lessons3_4.share.Rectangle;
import com.bvan.oop.lessons3_4.share.Shape;

/**
 * @author bvanchuhov
 */
public class Polymorphism {

    public static void main(String[] args) {
        Rectangle x1 = new Rectangle(10, 20);
        Shape x2 = new Rectangle(10, 20);

        System.out.println(x1.getWidth());

        // System.out.println(x2.getWidth()); // do not work
        System.out.println(x2.getArea());

        //-------

        Shape s1 = new Rectangle(10, 20);
        Shape s2 = new Circle(10);
//        Shape s3 = new Shape();

//        Rectangle x3 = new Circle(10);

        printInfo(new Rectangle(10, 20));
        printInfo(new Circle(10));
        printInfo(x1);
        printInfo(x2);
        printInfo(s1);
        printInfo(s2);
//        printInfo("Hello");
    }

    public static void printInfo(Shape s) {
        System.out.println("Area = " + s.getArea());
        System.out.println("Perimeter = " + s.getPerimeter());
        System.out.println();
    }
}
