package com.company;

public class OtterIntegers {
    public String otterString1 (int otterInteger){
        int sum = 0;
        int product = 1;
        int reverse = 0;
        String returnOtter = "";
        for (; otterInteger != 0; otterInteger = otterInteger / 10){

            reverse = reverse * 10 + (otterInteger % 10);

            sum = sum + (otterInteger % 10);

            product = product * (otterInteger % 10);

            returnOtter = "The reverse integer is " + reverse + ". The sum of the of the digits is " + sum + ". The product" +
                    " of the integers is " + product + ".";
        }
        return returnOtter;
    }
}
