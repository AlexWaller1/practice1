package com.company;

public class BeezerTwoIntegersMidPoint {
    public double beezerDouble (double beezer1, double beezer2) {
        double returnDouble = 0.0;
        for(; beezer1 <= beezer2; beezer1++, beezer2--) {
            if (beezer1 == beezer2){
                returnDouble = beezer1;
            }
        }
        return returnDouble;
    }
}
