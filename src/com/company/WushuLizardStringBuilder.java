package com.company;

public class WushuLizardStringBuilder {
    public String samuraiStringBuilder(String reverse){
        StringBuilder wushu = new StringBuilder();
        wushu.append(reverse);
        wushu = wushu.reverse();
        String samurai = String.valueOf(wushu);
        return samurai;
    }

}
