package com.company;

public class PickerelRegex {
    public String pickerelReplacement(String pickerelWeeds){
        pickerelWeeds = pickerelWeeds.replaceAll("\\s", "==");
        return  pickerelWeeds;
    }
}
