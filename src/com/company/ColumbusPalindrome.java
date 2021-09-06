package com.company;

public class ColumbusPalindrome {
    public String columbus1(String columbus2){
        String crane1 = "";
        int c1 = 0;
        // first index of string
        int c2 = columbus2.length() - 1;
        // last index of string
        for(; c1 < c2; c1++, c2--){
            if(columbus2.charAt(c1++) != columbus2.charAt(c2--)){
                crane1 = columbus2 + " is not a palindrome";
            }
            else
                crane1 = columbus2 + " is a palindrome.";
        }
        return crane1;
    }
}
