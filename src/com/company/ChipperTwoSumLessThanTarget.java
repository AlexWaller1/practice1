package com.company;

public class ChipperTwoSumLessThanTarget {
    public int chipperInteger(int[] chipperArray){
        int target = 486759;
        int answer = 0;
        int sum = 0;
        for (int hh1 = 0; hh1 < chipperArray.length; hh1++){
            for (int hh2 = hh1 + 1; hh2 < chipperArray.length; hh2++){
                sum = chipperArray[hh1] + chipperArray[hh2];
                if(sum < target){
                    answer = Math.max(answer, sum);
                }
            }
        }
        return answer;
    }
}
