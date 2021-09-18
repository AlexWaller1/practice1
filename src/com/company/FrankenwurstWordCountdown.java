package com.company;

public class FrankenwurstWordCountdown {
    String frankenWurstString2(String frankenWurstString1){
        for(int hh1 = 0; hh1 < frankenWurstString1.length(); hh1++){
            frankenWurstString1 = frankenWurstString1.substring(0, frankenWurstString1.length() - 1);
        }
        return  frankenWurstString1;
    }
}
