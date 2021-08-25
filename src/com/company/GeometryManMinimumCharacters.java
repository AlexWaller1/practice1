package com.company;

import java.util.Locale;

public class GeometryManMinimumCharacters {
    public String geometryMan1(String[] parallelograms){
        int min = parallelograms[0].length();
        String minName = "";
        for(int hh1 = 0; hh1 < parallelograms.length; hh1++){
            if(parallelograms[hh1].length() <= min){
                // for finding minimum or maximum it should always be <= or >=, cause if the first element turns out
                // to be the max or the min, then nothing will return with just > and <
                min = parallelograms[hh1].length();
                minName = parallelograms[hh1] + " has " + min + " characters.";
            }
        }
        return minName;
    }
}
