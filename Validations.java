package com.mycompany.lalitidlisanchamaker;

public class Validations {

    public static boolean validateTrayCount(int trayCount) {
        if (trayCount <= Limitations.MAXIMUMTRAYCOUNT && trayCount >= Limitations.MINIMUMTRAYCOUNT) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean deepTrayRadius(double deepRadius, double trayRadius, int deepCount) {
        double trayArea = 3.14 * trayRadius * trayRadius;
        double deepTopArea = 3.14 * deepRadius * deepRadius;
        double totalDeepArea = deepTopArea * deepCount;
        double minimumTrayArea = (trayArea * 70) / 100;
        double maximumTrayArea = (trayArea * 85) / 100;

        if (totalDeepArea >= minimumTrayArea && totalDeepArea <= maximumTrayArea) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean validateTrayRackRadius(double trayRadius, double rackRadius) {
        double minimumTrayRadius = (rackRadius * 70) / 100;
        double maximumTrayRadius = (rackRadius * 80) / 100;
 

        if (trayRadius >= minimumTrayRadius && trayRadius <= maximumTrayRadius) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean validateTrayRackHeight(double deepRadius, double rackHeight, int trayCount) {
        double trayHeight = deepRadius * 2;
        double totalTrayHeight = trayHeight * trayCount;
        if (totalTrayHeight <= rackHeight) {
            return true;
        } else {
            return false;
        }
    }

}
