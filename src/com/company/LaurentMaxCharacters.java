package com.company;

public class LaurentMaxCharacters {
    public String laurentString(String[] laurent){
        int max = laurent[0].length();
        String laurent1 = "";
        for(int hh1 = 0; hh1 < laurent.length; hh1++){
            if(laurent[hh1].length() >= max){
                max = laurent[hh1].length();
                laurent1 = laurent[hh1] + " has " + max + " characters.";
            }
        }
        return laurent1;
    }
}
