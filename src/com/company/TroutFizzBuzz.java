package com.company;

public class TroutFizzBuzz {
    String troutString(int troutInteger){
        String fizzBuzz = "";
        if(troutInteger % 5 == 0 && troutInteger % 3 == 0){
            fizzBuzz = troutInteger + " is fizzbuzz.";
        }
        else if(troutInteger % 5 == 0){
            fizzBuzz = troutInteger + " is fizz.";
        }
        else if(troutInteger % 3 == 0){
            fizzBuzz = troutInteger + " is buzz";
        }
        else
            fizzBuzz = troutInteger + " has no fizzbuzz";
        return fizzBuzz;
    }
}
