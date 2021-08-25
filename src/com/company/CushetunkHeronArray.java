package com.company;

public class CushetunkHeronArray {
    public int[] lakeHeron(int[] riverHeron){
        int target = 9;
        int[] newHerons = {};
        for(int hh1 = 0; hh1 < riverHeron.length; hh1++){
            for(int hh2 = hh1 + 1; hh2 < riverHeron.length; hh2++){
                if(target - riverHeron[hh1]  == riverHeron[hh2]){
                    newHerons =  new int[] {hh1, hh2};
                    return newHerons;

                }
            }
        }
        return null;
    }
}
