package com.company;

public class AxelReverseInteger {
    int axelInteger2 (int axelInteger1){
        int reverse = 0;
        for (; axelInteger1 != 0; axelInteger1 = axelInteger1 / 10){
            // 37
            // 37 / 10 = 3
            // 3
            reverse = reverse * 10 + (axelInteger1 % 10);
            // 0 * 10 + (37 % 10) = 7
            // 7 * 10 + (3 % 10) = 73
        }
        return reverse;
        // 73
    }
}
