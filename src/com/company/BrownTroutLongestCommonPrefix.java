package com.company;

public class BrownTroutLongestCommonPrefix {
    public String brownTroutString(String[] brownTrout){
        // String[] brownTrout = {"trouts", "trout"}
        if(brownTrout.length == 0)return "this array is empty";
        // edge case in the circumstance that the array is empty
        String prefix = brownTrout[0];
        // we will compare first element of the brownTrout array to rest of the array elements
        for(int hh1 = 1; hh1 < brownTrout.length; hh1++){
            // starting at since there's no use comparing the prefix to itself
            String brownTrout1 = brownTrout[hh1];
            while(brownTrout1.indexOf(prefix) != 0){
                // does "trout" contain "trouts" at index 0? no it does not
                // does "trout" contain "trout" at index 0? yes it does, so we return the prefix
                prefix = prefix.substring(0, prefix.length() - 1);
                // we drop the last letter of the "trouts"
                // now the string is "trout"
                if(prefix.isEmpty()) return "There is no common prefix for this array";
            }
        }
        return prefix;
    }
}
