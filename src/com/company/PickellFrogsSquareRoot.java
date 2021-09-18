package com.company;

public class PickellFrogsSquareRoot {
    String frogString(int frogInteger){
        if(frogInteger % Math.sqrt(frogInteger) == 0) return frogInteger + " has a whole number for a square root.";
        else
            return frogInteger + " does not have a whole number for a square root";
    }
}
