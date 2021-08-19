package com.company;

public class ForthwindStringIntegerPalindrome {
    public String forthWindInteger(String forthWindString){
        int piscesInteger = Integer.parseInt(forthWindString);
        int piscesInteger2 = piscesInteger;
        int reverse = 0;
        int remainder = 0;
        String piscesString = "";
        for(; piscesInteger > 0; piscesInteger = piscesInteger / 10){
                  remainder = piscesInteger % 10;
                  reverse = reverse * 10 + remainder;
                  if(piscesInteger == piscesInteger2){
                      piscesString = piscesInteger + " is a palindrome";
                  }
                  else
                      piscesString = piscesInteger + " is not a palindrome";
        }
        return piscesString;
    }
}
