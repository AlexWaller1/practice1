package com.company;

public class DifferenceInt___WushuLizard {
    public int blueLizard(int spaceReptile){
        int difference = 0;
        for(; spaceReptile > 0; spaceReptile = spaceReptile / 10){
            difference = (spaceReptile % 10) - difference;
        }
        return difference;
    }
}
