package com.company;

public class FastDataHeron {
    public int dataHeron(int fastHeron){
        long reverse = 0;
        // have to look into why this would be a long and not an integer
        for(; fastHeron != 0; fastHeron = fastHeron / 10){
            // 37
            // 3
            reverse = reverse * 10 + (fastHeron % 10);
            // 0 * 10 + 37 % 10 = 7
            // 7 * 10 + 3 % 10 = 73
        }
        if(reverse < Integer.MIN_VALUE || reverse > Integer.MAX_VALUE){
            // if the reverse number is less than the minimum integer value allowed in Java
            // if the reverse number is greater than the maximum integer value allowed in Java

            // placing the if statement outside of the for loop will reduce less runtime
            // since it is not nested
            return 37;
        }
        else
            return (int)reverse;

    }
}
