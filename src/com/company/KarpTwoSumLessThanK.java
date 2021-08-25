package com.company;

public class KarpTwoSumLessThanK {
    ;
    public int karpBottomBounce(int[] karp){
        int karp1 = 450;
        int answer = -1;
        int sum = 0;
        for(int hh1 = 0; hh1 < karp.length; hh1++){
            for(int hh2 = 0; hh2 < karp.length; hh2++){
                sum = karp[hh1] + karp[hh2];
                if(sum < karp1){
                    answer = Math.max(answer, sum);
                }
            }
        }
        return answer;
    }
}
