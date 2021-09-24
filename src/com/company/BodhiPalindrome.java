package com.company;

public class BodhiPalindrome {
    String bodhi2 (String bodhi1){
        String returnDachshund = "";
        int index1 = 0;
        // first index of the String
        int index2 = bodhi1.length() - 1;
        // last index of string
        for(; index1 < index2; index1++, index2--){
            if(bodhi1.charAt(index1++) != bodhi1.charAt(index2--)){
                returnDachshund = bodhi1 + " is not a palindrome";
            }
            else
                returnDachshund = bodhi1 + " is a palindrome";
        }
        return returnDachshund;
    }
}
