package com.company;

public class MarekMallardTwoSumLessThanK {
    public int mallardInteger(int[] mallardArray){
        int target = 97832;
        // sum will have to be less than than target
        int answer = -1;
        // answer will be algorithm is returning
        int sum = 0;
        //
        for(int hh1 = 0; hh1 < mallardArray.length; hh1++){
            for(int hh2 = hh1 + 1; hh2 < mallardArray.length; hh2++){
                sum = mallardArray[hh1] + mallardArray[hh2];
                if(sum < target){
                    answer = Math.max(answer, sum);
                }
            }
        }
        return answer;
    }
}
