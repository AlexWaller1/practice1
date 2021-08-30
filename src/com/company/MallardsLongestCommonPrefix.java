package com.company;

public class MallardsLongestCommonPrefix {
    String mallardPrefix(String[] mallardArray){
        // String[] mallardArray = {"ducks", "duck");
        if(mallardArray.length == 0)return "array has no elements";
        // edge case in case array has no elements
        String prefix = mallardArray[0];
        // our prefix will start off as the first element of the array
        // prefix == "ducks";
        for(int hh1 = 1; hh1 < mallardArray.length; hh1++){
            // hh1 1 starts at one since we don't need to compare the prefix to itself
            while(mallardArray[hh1].indexOf(prefix) != 0){
                // does "duck" contain "ducks" at the first index of the string?
                // No it does not, so we enter the while loop.
                // does "duck" contain "duck" at the first index of the string?
                // yes it does, and since this is last element of the array, we can now return our prefix
                prefix = prefix.substring(0, prefix.length() - 1);
                // the new prefix equals the old prefix minus the last character of the string.
                // therefore, the new prefix is "duck"
                if(prefix.isEmpty())return "There is no common prefix";
            }
        }
        return prefix;
        // prefix = "duck";
    }
}
