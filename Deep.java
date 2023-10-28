package com.mycompany.lalitidlisanchamaker;

public class Deep {

    private Hemisphere deep;

    public Deep(double radius) {
        deep = new Hemisphere(radius);
    }

    public Hemisphere getDeep() {
        return deep;
    }

    public void setDeep(Hemisphere deep) {
        this.deep = deep;
    }

    public double getDeepVolume() {
        return deep.getHemispherVolume();
    }

}
