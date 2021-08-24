package com.company;

public class Eggplant_Head_Exponent {
    public String eggplantHeadExponent(int eggplantHeadInteger){
        String eggPlantString = "";
        if(eggplantHeadInteger % Math.sqrt(eggplantHeadInteger) == 0){
            eggPlantString = eggplantHeadInteger + " has a whole number for a square root";
        }
        else
            eggPlantString = eggplantHeadInteger + " does not have a whole number for a square root";
        return eggPlantString;
    }

}
