package com.company;

public class Warren_21_ReverseInteger {
    public int warrenReverseInteger(int warrenInputInteger){
        int reverse = 0;
        for(; warrenInputInteger != 0; warrenInputInteger = warrenInputInteger / 10){
            // 37
            // 37 / 10 = 3
            // 3
            reverse = reverse * 10 + (warrenInputInteger % 10);
            // 0 * 10 + (37 % 10) = 7
            // 7 * 10 + (3 % 10) = 73
            // 73

        }
        return reverse;
        // 73
    }
}
