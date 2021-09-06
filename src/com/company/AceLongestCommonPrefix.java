package com.company;

public class AceLongestCommonPrefix {
    public String aceS(String[] ace){
        String ace1 = "";
        if(ace.length == 0) return "";
        // edge case
        String prefix = ace[0];
        // prefix will start as the first element of the ace array
        for(int hh1 = 1; hh1 < ace.length; hh1++){

            while(ace[hh1].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty()) return "There is no common prefix";
            }
        }
        return prefix;
    }
}
