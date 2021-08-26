package com.company;

public class OxideWheels {
    public boolean nitrousOxide(int oxideInteger){
        String oxideString = String.valueOf(oxideInteger);
        int oxide1 = 0;
        // first index of string
        int oxide2 = oxideString.length() - 1;
        // last index of string
        for(; oxide1 < oxide2; oxide1++, oxide2--){
            if(oxideString.charAt(oxide1++) != oxideString.charAt(oxide2--)) return false;
        }
        return true;
    }
}
