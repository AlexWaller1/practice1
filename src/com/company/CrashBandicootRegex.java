package com.company;

import java.util.Locale;

public class CrashBandicootRegex {
    public String bandicootString2 (String bandicootString1){
        bandicootString1 = bandicootString1.replaceAll("\\s", "==");
        bandicootString1 = bandicootString1.toUpperCase();
        return bandicootString1;
    }
}
