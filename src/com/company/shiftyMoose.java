package com.company;

public class shiftyMoose {
    public String longestMoosePrefix(String[] carp){
        if(carp.length == 0) return "";
        String moosePrefix = carp[0];
        for(int hh1 = 1; hh1 < carp.length; hh1++)
            while(carp[hh1].indexOf(moosePrefix) != 0){
                moosePrefix = moosePrefix.substring(0, moosePrefix.length() - 1);
                if(moosePrefix.isEmpty()) return "";
            }
        return moosePrefix;
    }
}
