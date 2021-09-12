package com.company;

public class ChipperLongestCommonPrefix {
    public String chipperString(String[] chipper){
        if(chipper.length == 0) return "This array is empty.";
        // edge case in case of array has no elements
        String prefix = chipper[0];
        // first element of the array will be compared to other array elements
        for(int hh1 = 1; hh1 < chipper.length; hh1++){
            // start at 1 since there is no reason to compare prefix to itself
            while(chipper[hh1].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}
