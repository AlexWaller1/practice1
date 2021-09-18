package com.company;

public class FrankenWurstWordCountdown_2 {
    public String frankenWurstString2(String frankenWurstString2){
        for(int hh1 = 0; hh1 < frankenWurstString2.length(); hh1++){
            frankenWurstString2 = frankenWurstString2.replaceAll("\\s", "==");
        }
        return frankenWurstString2;
    }
}
