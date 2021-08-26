package com.company;

public class ripperRooBoolean {
    public boolean tinyArena(int tinyInteger){

        String tinyString = String.valueOf(tinyInteger);
        int tinyTiger1 = 0;
        // first index of String
        int tinyTiger2 = tinyString.length() - 1;
        // last index of String
        if(Integer.parseInt(tinyString) == 0){
            return false;
        }
        if(tinyString.charAt(tinyTiger1++) != tinyString.charAt(tinyTiger2--)){
            return false;
        }
        return true;
    }
}
