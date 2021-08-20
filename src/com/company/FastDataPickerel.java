package com.company;

public class FastDataPickerel {
    public int reverseIntegerPickerel(int lineSnag){
        long reverse = 0;
        for(; lineSnag != 0; lineSnag = lineSnag / 10){
            reverse = reverse * 10 + lineSnag % 10;
            // can combine the following lines of code with the above line
            // remainder = lineSnag % 10;
            // reverse = reverse * 10 + remainder;
        }
        if(reverse < Integer.MIN_VALUE || reverse > Integer.MAX_VALUE){
            return 0;
        }
        else
            return (int)reverse;
    }
}
