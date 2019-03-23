package com.bvan.oop.lessons3_4.share.runner;

import com.bvan.oop.lessons3_4.share.Circle;
import com.bvan.oop.lessons3_4.share.EquilateralTriangle;
import com.bvan.oop.lessons3_4.share.Rectangle;
import com.bvan.oop.lessons3_4.share.Shape;
import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class ShapeRunner {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 20);
        double a1 = r.getArea();
        System.out.println(a1); // 200

        Circle c = new Circle(10);
        double a2 = c.getArea();
        System.out.println(a2); // 314

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(r);
        shapes.add(c);
        shapes.add(new EquilateralTriangle(10));
        double totalSum = totalArea(shapes);
        System.out.println(totalSum); // 557
    }

    private static double totalArea(ArrayList<Shape> shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }
}
