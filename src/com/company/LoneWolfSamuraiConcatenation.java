package com.company;

public class LoneWolfSamuraiConcatenation {
    public String loneWolfKungFu(String[] perch){
        String concat = "";
        // incremental variable
        for(int perch1 = 0; perch1 < perch.length; perch1++){
            concat = concat + " " + perch[perch1];
        }
        return concat;
    }
}
