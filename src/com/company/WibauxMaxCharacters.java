package com.company;

public class WibauxMaxCharacters {
    public String wibauxRoboLegs(String[] wibauxHardin){
        int max = wibauxHardin[0].length();
        String maxName = "";
        for(int hh1 = 0; hh1 < wibauxHardin.length; hh1++){
            if(wibauxHardin[hh1].length() > max){
                max = wibauxHardin[hh1].length();
                maxName = wibauxHardin[hh1] + " has " + max + " characters.";
            }
        }
     return maxName;
    }
}
