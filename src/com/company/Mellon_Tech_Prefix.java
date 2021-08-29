package com.company;

public class Mellon_Tech_Prefix {
    public String mellonTechPrefix(String[] mellonTech){
        // String[] mellonTech = {"flower", "flow", "flo"};
        if(mellonTech.length == 0) return "";

        String prefix = mellonTech[0];
        // prefix == "flower"
        for(int hh1 = 1; hh1 < mellonTech.length; hh1++){
            // don't need to compare "flower" to "flower" so we start with second element of the array
            // after iterating through mellonTech[1], we came out with the prefix "flow"
            // so now we move on to mellonTech[2]
            while(mellonTech[hh1].indexOf(prefix) != 0){
                // does "flow" contain "flower" at index 0? No it does not, so we enter the loop
                // does "flow" contain "flowe" at index 0? No it does not, so we enter the loop
                // does "flow" contain "flow" at index 0? Yes it does, so our new prefix is "flow"
                // moving on to mellonTech[2]
                // does "flo" contain "flow" at index 0; No it does not, so we enter the loop
                // does "flo" contain "flo" at index 0; Yes it does, so our new prefix is "flo"
                prefix = prefix.substring(0, prefix.length() - 1);
                // the new prefix equals the substring of the old prefix.
                // the new substring equals the old substring minus the last character
                // so the new prefix is "flowe"
                // the new subtring equals the old substring minus the last character
                // so the new prefix == "flow"
                // the new subString equals the old substring mnius the last character
                // so the new prefix == "flo
                if(prefix.isEmpty()) return "There is no common prefix in this array";
            }
        }
        return prefix;
        // the prefix returned is "flo"
    }
}
