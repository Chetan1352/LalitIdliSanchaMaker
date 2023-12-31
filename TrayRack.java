package com.mycompany.lalitidlisanchamaker;

public class TrayRack {

    private Tray tray;
    private Rack rack;
    private int trayCount;

    public Tray getTray() {
        return tray;
    }

    public void setTray(Tray tray) {
        this.tray = tray;
    }

    public Rack getRack() {
        return rack;
    }

    public void setRack(Rack rack) {
        this.rack = rack;
    }

    public int getTrayCount() {
        return trayCount;
    }

    public void setTrayCount(int trayCount) {
        this.trayCount = trayCount;
    }

    public TrayRack(double trayRadius, double deepRadius, int deepCount, double rackRadius, double rackHeight, int trayCount) {
        tray = new Tray(trayRadius, deepRadius, deepCount);
        rack = new Rack(rackRadius, rackHeight);
        this.trayCount = trayCount;
    }

    public double getTotalAllTrayDeepVolume() {
        return tray.getTotalDeepVolume() * trayCount;
    }

}
