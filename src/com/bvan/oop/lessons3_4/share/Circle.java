package com.bvan.oop.lessons3_4.share;

/**
 * @author bvanchuhov
 */
public class Circle implements Shape {

    private final double radius;

    public Circle(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException(
                    "negative radius: " + radius);
        }
        this.radius = radius;
    }

    @Override
    public double getArea() {
         return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
