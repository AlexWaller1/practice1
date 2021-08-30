package com.company;

public class SpyroFizzBuzz {
    public String spyroString(int[] spyroArray){
        String fizzBuzz = "";
        for(int hh1 = 0; hh1 < spyroArray.length; hh1++){
            int spyroInteger = spyroArray[hh1];
            if(spyroInteger % 5 == 0 && spyroInteger % 3 == 0){
                fizzBuzz = spyroInteger + " is fizzbuzz.";
            }
            else if(spyroInteger % 5 == 0){
                fizzBuzz = spyroInteger + " is fizz.";
            }
            else
                fizzBuzz = spyroInteger + " is buzz.";
        }
        return fizzBuzz;
    }
}
