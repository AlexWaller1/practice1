package com.company;

public class shiftyMoose {
    public String longestMoosePrefix(String[] carp){
        if(carp.length == 0) return "";
        // edge case just in case array has no elements
        String moosePrefix = carp[0];
        // moosePrefix equals the first element of the carp array
        for(int hh1 = 1; hh1 < carp.length; hh1++)
            // iterating through each element of carp array
            // intentionally not iterating through the first array element
            // guessing so there's no match on itself
            while(carp[hh1].indexOf(moosePrefix) != 0){
                // while the element of the carp array's
                // indexOf(moosePrefix) does not equal 0
                moosePrefix = moosePrefix.substring(0, moosePrefix.length() - 1);
                // this is taking the substring
                if(moosePrefix.isEmpty()) return "";
                // edgecase in case strings have no words in common
            }
        return moosePrefix;
    }
}
