package com.company;

public class CrashBandicootMaxInteger {
    public String crashString(int[] bandicoot){
        if(bandicoot.length == 0) return "The Array is Empty!";
        // edge case in the event that the array is empty
        int max = bandicoot[0];
        // max integer will start off as the first integer in the array
        String maxString = "";
        for(int hh1 = 0; hh1 < bandicoot.length; hh1++){
            if(bandicoot[hh1] >= max){
                max = bandicoot[hh1];
                maxString = "The max integer is " + max;
            }
        }
        return maxString;
    }
}
