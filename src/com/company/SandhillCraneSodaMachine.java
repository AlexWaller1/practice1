package com.company;

public class SandhillCraneSodaMachine {
    public String craneString(double craneInteger){
        if(craneInteger == .50) return "2 more quarters please.";
        else if(craneInteger == .75) return "1 more quarter please.";
        else if(craneInteger == 1.00) return "Enjoy your Pickerel Cola!";
        else
            return "Want Some Pickerel Cola!?";
    }
}
