package com.company;

public class MellonTechPalindrome {
    String mellonTech2 (String mellonTech1){
        if (mellonTech1.isEmpty()) return "This is an empty string";
        String mellonReturn = "";
        int mellonIndex1 = 0;
        // first index of string
        int mellonIndex2 = mellonTech1.length() - 1;
        // last index of string
        for(;mellonIndex1 < mellonIndex2; mellonIndex1++, mellonIndex2--){
            if (mellonTech1.charAt(mellonIndex1++) != mellonTech1.charAt(mellonIndex2--)){
                mellonReturn = mellonTech1 + " is not a palindrome.";
            }
            else
               mellonReturn = mellonTech1 + " is a palindrome";
        }
        return mellonReturn;
    }
}
