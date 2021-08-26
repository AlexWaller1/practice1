package com.company;

public class PaddleFishCarpSodaMachine {
    public int sodaCanCarp(int[] trollMotor){
        int target = 3723;
        int answer = 0;
        int sum = 0;
        for(int hh1 = 0; hh1 < trollMotor.length; hh1++){
            for(int hh2 = hh1 + 1; hh2 < trollMotor.length; hh2++){
                sum = trollMotor[hh1] + trollMotor[hh2];
                if(sum < target){
                    answer = Math.max(answer, sum);
                    // if the sum is greater than the answer, then the sum becomes the new answer
                }
            }
        }
        return answer;
    }
}
