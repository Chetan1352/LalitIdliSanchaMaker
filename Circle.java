package com.mycompany.lalitidlisanchamaker;

public class Circle {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getCircleArea() {
        return 3.14 * radius * radius;
    }

}
