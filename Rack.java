package com.mycompany.lalitidlisanchamaker;

public class Rack {

    private Cylinder rack;

    public Rack(double radius, double height) {
        rack = new Cylinder(radius, height);
    }

    public Cylinder getRack() {
        return rack;
    }

    public void setRack(Cylinder rack) {
        this.rack = rack;
    }

    public double getRackVolume() {
        return rack.getCylinderVolume();
    }

}
