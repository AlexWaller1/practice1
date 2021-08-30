package com.company;

public class ThierryIntegerPalindromeBoolean {
    public boolean thierryBoolean(int thierryInteger){

        String thierryString = String.valueOf(thierryInteger);
        int thierry1 = 0;
        // first index of string
        int thierry2 = thierryString.length() - 1;
        // last index of string
        for(; thierry1 < thierry2; thierry1++, thierry2--){
            if(thierryString.charAt(thierry1++) != thierryString.charAt(thierry2--)) return false;
        }

        return true;
    }
}
