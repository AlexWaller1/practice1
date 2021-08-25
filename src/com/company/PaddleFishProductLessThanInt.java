package com.company;

public class PaddleFishProductLessThanInt {
    public int paddleFishRiver(int[] paddleFish){
        int product = 1;
        int answer = -1;
        int troutInt = 537;
        for(int hh1 = 0; hh1 < paddleFish.length; hh1++){
            for(int hh2 = hh1 + 1; hh2 < paddleFish.length; hh2++){
                product = paddleFish[hh1] * paddleFish[hh2];
                if(product < troutInt){
                    answer = Math.max(answer, product);
                }
            }
        }
        return answer;
    }
}
