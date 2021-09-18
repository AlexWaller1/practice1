package com.company;

public class TimberTronLongestCommonPrefix {
    public String timberString(String[] timberArray){
        if(timberArray.length == 0) return "Array is empty.";
        // edge case in case array is empty
        String prefix = timberArray[0];
        // string will compare to the rest of the array elements
        for(int hh1 = 1; hh1 < timberArray.length; hh1++){
            // we can start at one since there's no need to compare an element to itself
            while(timberArray[hh1].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty()) return "There is no common prefix";
            }
        }
        return prefix;
    }
}
