package com.bvan.oop.lessons3_4.share.runner;

import com.bvan.oop.lessons3_4.share.Namable;
import com.bvan.oop.lessons3_4.share.NameableShape;
import com.bvan.oop.lessons3_4.share.Rectangle;
import com.bvan.oop.lessons3_4.share.Shape;

/**
 * @author bvanchuhov
 */
public class MultipleInterfacesExample {

    public static void main(String[] args) {
        Rectangle x1 = new Rectangle(10, 20);
        Shape x2 = new Rectangle(10, 20);
        Namable x3 = new Rectangle(10, 20);

        printInfo(new Rectangle(10, 20));
    }

    public static void doSmth(NameableShape nameableShape) {
        Shape s = nameableShape;
        Namable n = nameableShape;
    }

    public static void printInfo(NameableShape nameableShape) {
        System.out.println("Name = " + nameableShape.getName());
        System.out.println("Area = " + nameableShape.getArea());
        System.out.println("Perimeter = " +
                nameableShape.getPerimeter());
    }
}
