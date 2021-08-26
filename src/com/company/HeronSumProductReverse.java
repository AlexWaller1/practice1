package com.company;

public class HeronSumProductReverse {
    public String blueHeronString(int heronInteger){
        int sum = 0;
        int product = 1;
        int reverse = 0;
        String heronString = "";
        for(; heronInteger != 0; heronInteger = heronInteger / 10){
            // 372
            // 37
            // 3
            sum = sum + (heronInteger % 10);
            // 0 + (372 % 10) = 2
            // 2 + (37 % 10) = 9
            // 9 + (3 % 10) = 12
            // sum = 12

            product = product * (heronInteger % 10);
            // 1 * (372 % 10) = 2
            // 2 * (37 % 10) = 14
            // 14 * (3 % 10) = 42
            // product = 42

            reverse = reverse * 10 + (heronInteger % 10);
            // 0 * 10 + (372 % 10) = 2
            // 2 * 10 + (37 % 10) = 27
            // 27 * 10 + (3 % 10) = 273
            // reverse = 273

            heronString = "The sum of the digits is " + sum + " The product of the digits is " + product + " The reverse of the digits is " + reverse;
        }
        return heronString;
    }
}
