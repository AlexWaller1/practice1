package com.company;

import java.util.Arrays;
import java.util.LinkedList;

public class crashTeamRacing {
    public String crashString (LinkedList crash2){
        var array3 = crash2.toArray();
        String crash5 = "";
        for(int hh1 = 0; hh1 < array3.length; hh1++){
            String crash4 = Arrays.toString(array3);
            crash5 = crash4 + " races in Crash Team Racing";
        }
        return crash5;
    }
}
