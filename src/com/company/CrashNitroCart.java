package com.company;

import java.util.LinkedList;

public class CrashNitroCart {
    String bandicootString (LinkedList bandicootList){
        String crashReturn = "";
        for (int hh1 = 0; hh1 < bandicootList.size(); hh1++){
             crashReturn = bandicootList.get(hh1) + " races in Crash Team Racing";
        }
        return crashReturn;
    }
}
