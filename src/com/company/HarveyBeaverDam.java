package com.company;

public class HarveyBeaverDam {
    public StringBuilder harveyPisces(String[] beaverArray){
        StringBuilder stXavier = new StringBuilder();
        for(int hh1 = 0; hh1 < beaverArray.length; hh1++){
            String harvey37 = beaverArray[hh1];
            harvey37 = harvey37.replaceAll("\\s", "||");

            stXavier.append(harvey37);
            stXavier = stXavier.insert(5, "==");

        }
        return stXavier;
    }
}
