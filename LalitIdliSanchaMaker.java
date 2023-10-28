package com.mycompany.lalitidlisanchamaker;

public class LalitIdliSanchaMaker {
    
    public static void main(String[] args) {
        
        double deepRadius = 3.5;
        int deepCount = 5;
        int trayCount = 3;
        double rackRadius = 12;
        double rackHeight = 60;
        double trayRadius = Operations.getTrayRadius(deepCount);
        
        boolean validateTrayCount = Validations.validateTrayCount(trayCount);
        boolean deepTrayRadius = Validations.deepTrayRadius(deepRadius, trayRadius, deepCount);
        boolean validateTrayRackRadius = Validations.validateTrayRackRadius(trayRadius, rackRadius);
        boolean validateTrayRackHeight = Validations.validateTrayRackHeight(trayRadius, rackHeight, trayCount);
        if (validateTrayCount == true && deepTrayRadius == true && validateTrayRackRadius == true && validateTrayRackHeight == true) {
            TrayRack trayRack = new TrayRack(trayRadius, deepRadius, deepCount, rackRadius, rackHeight, trayCount);
            
            Operations.getTrayRackEstimate(trayRack);
            
        }
        
    }
    
}
