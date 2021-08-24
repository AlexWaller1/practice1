package com.company;

public class PickerelColaStringPalindrome {
    public String pickerelColaIce(String pickerelColaSlushy){
        String pickerelString = "";
        int pickerel1 = 0;
        // first index of string
        int pickerel2 = pickerelColaSlushy.length() - 1;
        // last index of string
        for(; pickerel1 < pickerel2; pickerel1++, pickerel2--){
            if(pickerelColaSlushy.charAt(pickerel1++) != pickerelColaSlushy.charAt(pickerel2--)){
                pickerelString = pickerelColaSlushy + " is not a palindrome.";
            }
            else
                pickerelString = pickerelColaSlushy + " is a palindrome.";
        }
        return pickerelString;
    }
}
