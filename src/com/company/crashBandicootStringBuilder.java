package com.company;

public class crashBandicootStringBuilder {
    public StringBuilder nitroCart(String greenNitro){
        StringBuilder dingoDile = new StringBuilder();
        dingoDile.append(greenNitro);
        dingoDile = dingoDile.delete(3, 5);
        dingoDile = dingoDile.replace(4, 6, "===");

        return dingoDile;
    }
}
