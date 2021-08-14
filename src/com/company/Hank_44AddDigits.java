package com.company;

public class Hank_44AddDigits {
    public int Warren_21(int warren){
        int sum = 0;
        for(; warren > 0; warren = warren / 10){
            sum = sum + (warren % 10);
        }
        return sum;
    }
}
