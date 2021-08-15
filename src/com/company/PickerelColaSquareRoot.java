package com.company;

public class PickerelColaSquareRoot {
    public String pickerelColaLemon(int pickerelColaLime){
        String stCroix = "";
        if(pickerelColaLime % Math.sqrt(pickerelColaLime) == 0){
            stCroix = pickerelColaLime + " has a whole number square root.";
        }
        else
            stCroix = pickerelColaLime + " does not have a whole number for a square root.";

        return stCroix;
    }
}
