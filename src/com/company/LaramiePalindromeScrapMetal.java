package com.company;

public class LaramiePalindromeScrapMetal {
    public String laramiePalindrome(String laramieString){
        String laramieSoda = "";
        int laramieString1 = 0;
        // first index of string
        int laramieString2 = laramieString.length() - 1;
        // last index of string
        for(; laramieString1 < laramieString2; laramieString1++, laramieString2++){
            if(laramieString.charAt(laramieString1++) != laramieString.charAt(laramieString2--)){
                laramieSoda = laramieString + " is not a palindrome.";
            }
            else
                laramieSoda = laramieString + " is a palindrome.";
        }
        return laramieSoda;
    }
}
