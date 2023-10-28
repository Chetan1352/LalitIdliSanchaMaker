package com.mycompany.lalitidlisanchamaker;

public class Tray {

    private Circle tray;
    private Deep deep;
    private int deepCount;

    public Tray(double trayRadius, double deepRadius, int deepCount) {
        this.deepCount = deepCount;
        tray = new Circle(trayRadius);
        deep = new Deep(deepRadius);
    }

    public Circle getTray() {
        return tray;
    }

    public void setTray(Circle tray) {
        this.tray = tray;
    }

    public Deep getDeep() {
        return deep;
    }

    public void setDeep(Deep deep) {
        this.deep = deep;
    }

    public int getDeepCount() {
        return deepCount;
    }

    public void setDeepCount(int deepCount) {
        this.deepCount = deepCount;
    }

    public double getIndividualDeepVolume() {
        return deep.getDeepVolume();
    }

    public double getTotalDeepVolume() {
        return deep.getDeepVolume() * deepCount;
    }
}
