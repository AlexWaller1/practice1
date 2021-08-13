package com.company;

public class RoboPalindrome {
    public String robotPalindrome(String mellon_tech){
        String hank = "";
        // will use in for loop but call outside of it
        int tech1 = 0;
        // first index of string
        int tech2 = mellon_tech.length() - 1;
        // last index of string
        for(; tech1 < tech2; tech1++, tech2--){
            if(mellon_tech.charAt(tech1++) != mellon_tech.charAt(tech2--)){
                hank = mellon_tech + " is not a palindrome";
            }
            else
                hank = mellon_tech + " is a palindrome";
        }
        return hank;
    }
}
