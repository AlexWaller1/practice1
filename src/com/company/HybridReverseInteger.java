package com.company;

public class HybridReverseInteger {
    public int reverseHybridInteger(int num){
        int reverse = 0;
        int remainder = 0;
        for(; num > 0; num = num /10){
            remainder = num % 10;
            reverse = reverse * 10 + remainder;
        }
        return reverse;
    }
}
