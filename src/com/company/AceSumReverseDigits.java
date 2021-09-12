package com.company;

public class AceSumReverseDigits {
    public String aceString(int aceInteger){
        int reverse = 0;
        // incremental variable
        int sum = 0;
        // incremental variable
        String returnString = "";
        for(; aceInteger != 0; aceInteger = aceInteger / 10){
            // 37
            // 37 / 10 = 3
            // 3
            reverse = reverse * 10 + (aceInteger % 10);
            // 0 * 10 + (37 % 10) = 7
            // 7 * 10 + (3 % 10) = 73
            // reverse is 73

            sum = sum + (aceInteger % 10);
            // 0 + (37 % 10) = 7
            // 7 + (3 % 10) = 10
            // the sum of the digits is 10

            returnString = reverse + " is the reverse integer and " + sum + " is the sum of the digits.";

        }
        return returnString;
    }
}
