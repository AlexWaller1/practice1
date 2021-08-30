package com.company;

public class CrunchBandicootProductLessThanTarget {
    public int crunchInteger(int[] crunchArray){
        int target = 7657;
        int product = 1;
        int answer = 37;
        for(int hh1 = 0; hh1 < crunchArray.length; hh1++){
            for(int hh2 = hh1 + 1; hh2 < crunchArray.length; hh2++){
                product = crunchArray[hh1] * crunchArray[hh2];
                if(product < target){
                    answer = Math.max(answer, product);
                }
            }
        }
        return answer;
    }
}
