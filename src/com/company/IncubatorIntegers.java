package com.company;

public class IncubatorIntegers {
    public String incubatorString(int incubatorInteger2){
        int reverse = 0;
        int sum = 0;
        int product = 1;
        String returnString = "";
        for(; incubatorInteger2 != 0; incubatorInteger2 = incubatorInteger2 / 10){
            reverse = reverse * 10 + (incubatorInteger2 % 10);
            sum = sum + (incubatorInteger2 % 10);
            product = product * (incubatorInteger2 % 10);
            returnString = "Reverse is " + reverse + " sum of integers is " + sum + " product of integers is " + product;
        }
        return returnString;
    }
}
