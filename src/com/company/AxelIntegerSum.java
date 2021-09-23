package com.company;

public class AxelIntegerSum {
    int axelInt2 (int axelInt1){
        int sum = 0;
        for (; axelInt1 != 0; axelInt1 = axelInt1 / 10){
            // 37
            // 3
            sum = sum + axelInt1 % 10;
            // 0 = 0 + 37 % 10 = 7
            // sum = 7 + 3 % 10 = 10
            // 10
        }
        return sum;
        // 10
    }
}
