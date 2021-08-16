package com.company;

public class HammerheadConcatenation {
    public String hammerHeadBlue(String[] stXJerky){
        String pickerelCola = "";
        String dietPickerelCola = "";
        String lemonPickerelCola = "";
        for(int hh1 = 0; hh1 < stXJerky.length; hh1++){
            if(hh1 == 0){
                pickerelCola = stXJerky[hh1];
            }
            if(hh1 == 1){
                dietPickerelCola = stXJerky[hh1];
            }
            lemonPickerelCola = pickerelCola + " and " + dietPickerelCola;
        }
        return lemonPickerelCola;
    }
}
