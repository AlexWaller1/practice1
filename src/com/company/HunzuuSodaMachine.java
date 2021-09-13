package com.company;

public class HunzuuSodaMachine {
    public String hunzuuString(double hunzuuDouble){
        double pickerelColaPrice = 1.25;
        String pickerelColaString = "";
        double exactChange = hunzuuDouble - pickerelColaPrice;

        if(hunzuuDouble < pickerelColaPrice) return "Please insert some more quarters";
        else if(hunzuuDouble == pickerelColaPrice) return "Awesome! Exact Change!";
        else if(hunzuuDouble > pickerelColaPrice){
            pickerelColaString = "Thank You!, your change is " + exactChange;
        }
       return pickerelColaString;
    }
}
