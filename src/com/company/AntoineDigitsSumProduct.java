package com.company;

public class AntoineDigitsSumProduct {
    public String antoineReturnsInteger(int antoineInputInteger){
        int sum = 0;
        int product = 1;
        for(; antoineInputInteger != 0; antoineInputInteger = antoineInputInteger / 10){
            sum = sum + (antoineInputInteger % 10);
            product = product * (antoineInputInteger % 10);
        }
        return "sum is " + sum + " and product is " + product ;
    }
}
