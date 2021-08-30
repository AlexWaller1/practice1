package com.company;

public class FortwindArrayMaxCharacters {
    public String forthwindString(String[] forthwindArray){
        String returnString = "";
        String maxName = "";
        int max = forthwindArray[0].length();
        for(int hh1 = 0; hh1 < forthwindArray.length; hh1++){
            if(forthwindArray[hh1].length() > max){
                max = forthwindArray[hh1].length();
                maxName = forthwindArray[hh1] + " has " + max + " characters.";
            }
        }
        return maxName;
    }
}
