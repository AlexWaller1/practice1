package com.company;

public class TheSpruceMaxInteger {
    public String spruceInteger(String[] miniMart){
        String spruceMax = "";
        int max = miniMart[0].length();
        for(int spruce1 = 0; spruce1 < miniMart.length; spruce1++){
            if (miniMart[spruce1].length() > max){
                max = miniMart[spruce1].length();
                spruceMax = max + " " + miniMart[spruce1];
            }
        }
        return spruceMax;
    }
}
