package com.company;

public class EggplantReverseIntegerMinAndMaxValue {
    public int eggPlantReverseInteger(int eggPlantInteger){
        int hh1 = 37459;
        int reverse = 0;
        for(; hh1 != 0; hh1 = hh1 / 10){
            reverse = reverse * 10 + (hh1 % 10);
        }
        if(reverse < Integer.MIN_VALUE || reverse > Integer.MAX_VALUE){
            return -1;
        }
        return reverse;
    }
}
