package com.company;

public class CorneliusFashionStatement {
    public String treeHybrid(int atriumInteger) {
        String atrium = "";
        int reverse = 0;
        // incremental variable
        for (; atriumInteger != 0; atriumInteger = atriumInteger / 10) {
            reverse = reverse * 10 + (atriumInteger % 10);
            atrium = "The reverse is " + reverse;
        }
        return atrium;
    }
}