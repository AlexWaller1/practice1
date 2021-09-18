package com.company;

import java.util.Locale;

public class CubsPalindrome {
    public String cubsString1(String cubsString2){
        cubsString2 = cubsString2.toLowerCase();
        String returnCub = "";
        int cubsIndex1 = 0;
        // first index of string
        int cubsIndex2 = cubsString2.length() - 1;
        // last index of string
        while(cubsIndex1 < cubsIndex2){
            // two indexes will eventually meet in the middle
            if(cubsString2.charAt(cubsIndex1++) != cubsString2.charAt(cubsIndex2--)){
                returnCub = cubsString2 + " is not a palindrome.";
            }
            else
                returnCub = cubsString2 + " is a palindrome";
        }
        return  returnCub;
    }
}
