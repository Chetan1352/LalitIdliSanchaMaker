package com.mycompany.lalitidlisanchamaker;

public class Cylinder {

    private double radius;
    private double height;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getCylinderVolume() {
        return 3.14 * radius * radius * height;
    }

}
