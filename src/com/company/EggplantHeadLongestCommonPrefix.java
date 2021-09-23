package com.company;

public class EggplantHeadLongestCommonPrefix {
    String eggPlantString (String[] eggPlantHead){
        if (eggPlantHead.length == 0) return "this is an empty array";
        // edge case in the case that array is empty
        String prefix = eggPlantHead[0];
        // string element we will compare to every other string element
        for(int hh1 = 1; hh1 < eggPlantHead.length; hh1++){
            // start count at 1 since there is no need to compare the prefix to itself
            while(eggPlantHead[hh1].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "There is no common prefix";
            }
        }
        return prefix;
    }
}
