package com.company;

public class BodhiTwoSumTarget {
    public int bodhiInteger (int[] bodhi){
        int target = 675849;
        int answer = 0;
        int sum = 0;
        for (int hh1 = 0; hh1 < bodhi.length; hh1++){
            for (int hh2 = hh1 + 1; hh2 < bodhi.length; hh2++){
                sum = bodhi[hh1] + bodhi[hh2];
                if (sum < target){
                    answer = Math.max(answer, sum);
                }
            }
        }
        return answer;
    }
}
