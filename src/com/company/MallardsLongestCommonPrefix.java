package com.company;

public class MallardsLongestCommonPrefix {
    String mallardPrefix(String[] mallardArray){
        if(mallardArray.length == 0)return "array has no elements";
        // edge case in case array has no elements
        String prefix = mallardArray[0];
        // our prefix will start off as the first element of the array
        for(int hh1 = 1; hh1 < mallardArray.length; hh1++){
            // hh1 1 starts at one since we don't need to compare the prefix to itself
            while(mallardArray[hh1].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty())return "There is no common prefix";
            }
        }
        return prefix;
    }
}
