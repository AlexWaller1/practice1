package com.company;

public class BeezerIntegerPalindrome {
    public String beezerString(int beezerInteger){
        String beezer1 = String.valueOf(beezerInteger);
        int beezer2 = 0;
        // first index of string
        int beezer3 = beezer1.length() - 1;
        // last index of string
        String returnString = "";
        for(; beezer2 < beezer3; beezer2++, beezer3--){
            if(beezer1.charAt(beezer2++) != beezer1.charAt(beezer3--)){
                returnString = beezer1 + " is not a palindrome.";
            }
            else
                returnString = beezer1 + " is a palindrome";
        }
        return returnString;
    }
}
