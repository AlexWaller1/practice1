package com.company;

public class shiftyMoose {
    public String longestMoosePrefix(String[] carp){
        // String[] carp = {"flower", "flow", "flo");
        if(carp.length == 0) return "";
        // edge case just in case array has no elements
        String moosePrefix = carp[0];
        // moosePrefix equals the first element of the carp array
        // in this case
        for(int hh1 = 1; hh1 < carp.length; hh1++)
            // iterating through each element of carp array
            // intentionally not iterating through the first array element
            // guessing so there's no match on itself
            while(carp[hh1].indexOf(moosePrefix) != 0){
                // while we cannot find the current prefix at the beginning of the current string
                moosePrefix = moosePrefix.substring(0, moosePrefix.length() - 1);
                // reduces the length of the string by 1
                if(moosePrefix.isEmpty()) return "";
                // edgecase in case strings have no letters in common
            }
        return moosePrefix;
    }
}
