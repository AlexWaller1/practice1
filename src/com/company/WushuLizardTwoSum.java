package com.company;

public class WushuLizardTwoSum {
    public int wushuInteger(int[] wushuLizard){
        int target = 98675;
        int answer = 0;
        int sum = 0;
        for(int hh1 = 0; hh1 < wushuLizard.length; hh1++){
            for(int hh2 = hh1 + 1; hh2 < wushuLizard.length; hh2++){
                sum = wushuLizard[hh1] + wushuLizard[hh2];
                if (sum < target){
                    answer = Math.max(answer, sum);
                }
            }
        }
        return answer;
    }
}
