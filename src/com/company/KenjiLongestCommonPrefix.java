package com.company;

public class KenjiLongestCommonPrefix {
    public String kenjiString(String[] kenjiArray){
        if(kenjiArray.length == 0){
            return "";
        }

        String prefix = kenjiArray[0];
        for(int hh1 = 1; hh1 < kenjiArray.length; hh1++){
            while(!kenjiArray[hh1].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}
