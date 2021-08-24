package com.company;

public class HammerheadProductSodaCan {
    public String hammerHeadSodaFountain(int hammerHeadFizz){
        int sum = 0;
        int product = 1;
        for(; hammerHeadFizz != 0; hammerHeadFizz = hammerHeadFizz / 10){
            product = product * (hammerHeadFizz % 10);
            sum = sum + (hammerHeadFizz % 10);
        }
        return sum + " " + product;
    }
}
