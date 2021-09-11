package com.company;

public class BlueJayReverseInteger {
    public String blueJayString(int blueJayInteger){

        int reverse = 0;
        // incremental variable
        String returnString = "";
        for(; blueJayInteger != 0; blueJayInteger = blueJayInteger / 10){
            // 37
            // 37 / 10 = 3
            // 3
            reverse = reverse * 10 + (blueJayInteger % 10);
            // 0 * 10 + (37 % 10) = 7
            // 7 * 10 + (3 % 10) = 73
            // reverse = 73

            returnString = reverse + " is the reverse integer.";
        }
        return returnString;
        // "73 is the reverse integer."
    }
}
