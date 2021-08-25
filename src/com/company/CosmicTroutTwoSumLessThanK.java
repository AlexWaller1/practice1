package com.company;

// Given an array nums of integers and integer k, return the maximum sum such that there exists i < j
// with nums[i] + nums[j] and sum < k. If no i, j exist in this equation, return -1.

public class CosmicTroutTwoSumLessThanK {
    public int bigHornSum(int[] troutSum){
        int troutMax = 56;
        int answer = -1;
        // incremental variable, however if every sum is greater than troutMax, then -1 will be returned
        int sum = 0;
        for(int hh1 = 0; hh1 < troutSum.length; hh1++){
            for(int hh2 = hh1 + 1; hh2 < troutSum.length; hh2++){
                sum = troutSum[hh1] + troutSum[hh2];
                // adding the two array elements
                if(sum < troutMax){
                    // if the sum is than troutMax, it is allowed to enter the if statement
                    answer = Math.max(answer, sum);
                    // -1 will be compared with the sum, and the sum will become the new answer
                    // then all eligible sums will be compared to the previous sum
                    // when the for loop is done, the greatest eligible sum will outputted
                }
            }
        }
        return answer;
    }
}
