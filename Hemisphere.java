package com.mycompany.lalitidlisanchamaker;

public class Hemisphere {

    public double radius;

    public Hemisphere(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHemispherVolume() {
        return 0.66 * 3.14 * radius * radius * radius;
    }
}
