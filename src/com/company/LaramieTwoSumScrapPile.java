package com.company;

public class LaramieTwoSumScrapPile {
    public int laramieTruck(int[] laramieArray){
        int laramieInteger = 4437;
        int product = 1;
        int answer = 1;
        // incremental variable
        for(int hh1 = 0; hh1 < laramieArray.length; hh1++){
            for(int hh2 = hh1 + 1; hh2 < laramieArray.length; hh2++){
                product = laramieArray[hh1] * laramieArray[hh2];
                if(product < laramieInteger){
                    answer = Math.max(answer, product);
                    // for the first iteration we will be comparing 1 with the first product
                    // whichever is greater will become the new answer, and the cycle will continue
                }
            }
        }
        return answer;
    }
}
