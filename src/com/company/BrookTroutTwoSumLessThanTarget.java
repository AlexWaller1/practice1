package com.company;

public class BrookTroutTwoSumLessThanTarget {
    public int brookTroutInteger(int[] brookTrout){
        int sum = 0;
        int answer = 37;
        int target = 37459;
        for(int hh1 = 0; hh1 < brookTrout.length; hh1++){
            for(int hh2 = hh1 + 1; hh2 < brookTrout.length; hh2++){
                sum = brookTrout[hh1] + brookTrout[hh2];
                if(sum < target){
                    answer = Math.max(sum, answer);
                }
            }
        }
        return answer;
    }
}
