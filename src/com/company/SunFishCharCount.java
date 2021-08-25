package com.company;

public class SunFishCharCount {
    public long sunFish(String[] sunFish){
        long charCount;
        long product = 1;
        // incremental variable
        for(int hh1 = 0; hh1 < sunFish.length; hh1++){
            charCount = sunFish[hh1].chars().count();
            product = product * charCount;
        }
        return product;
    }
}
