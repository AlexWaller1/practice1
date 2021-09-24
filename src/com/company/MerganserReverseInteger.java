package com.company;

public class MerganserReverseInteger {
    public int merganser2 (int merganser1){
        int reverse = 0;
        for (; merganser1 != 0; merganser1 = merganser1 / 10){
            // 10
            // 1
             reverse = reverse * 10 + (merganser1 % 10);
             // 0 * 10 + (10 % 10) = 0
            //  0 * 10 + (1 % 10) = 1
        }
        return reverse;
        // 1
    }
}
