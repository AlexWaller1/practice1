package com.company;

public class GreenDogGlynis {
    public String glynisPisces(String laramie){
        String geometryMan = "";
        int laramie1 = 0;
        // first index of string
        int laramie2 = laramie.length() - 1;
        // last index of string
        for(; laramie1 < laramie2; laramie1++, laramie2--){
            if(laramie.charAt(laramie1++) != laramie.charAt(laramie2--)){
                geometryMan = laramie + " is not a palindrome.";
            }
            else
                geometryMan = laramie + " is a palindrome.";
        }
        return geometryMan;
    }
}
