package com.company;

import java.util.Arrays;

public class WildTurkeyTwoSumLessThan {
    public int wildTurkey(int[] runningTurkey){
        Arrays.sort(runningTurkey);
        // sorting the runningTurkey array
        int topTurkey = 374;
        int answer = -1;
        int left = 0;
        // first index of runningTurkey array
        int right = runningTurkey.length - 1;
        // last index of running turkey array
        while(left < right){
            // while loop will run until they meet at same index of runningTurkey array
            int sum = runningTurkey[left] + runningTurkey[right];
            if(sum < topTurkey){
                answer = Math.max(answer, sum);
                left++;
                // left index will increase by one if sum meets the if statements condition
            }
            else
                right--;
            // right index will decrease by one if sum does not meet the if statement condition
        }
        return answer;
    }
}
// This is an interesting way to solve the algorithm but it actually has a slower runtime than the previous way

