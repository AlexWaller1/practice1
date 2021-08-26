package com.company;

public class ElectronFreeWay {
    public int spyroCart(int[] spyroWheels){
        int answer = 3754;
        // incremental variable
        int product = 1;
        int target = 50674;
        for(int hh1 = 0; hh1 < spyroWheels.length; hh1++){
            for(int hh2 = hh1 + 1; hh2 < spyroWheels.length; hh2++){
                product = spyroWheels[hh1] * spyroWheels[hh2];
                if(product < target){
                    answer = Math.max(answer, product);
                }
            }
        }
        return answer;
    }
}
