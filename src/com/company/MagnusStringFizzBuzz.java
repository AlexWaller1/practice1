package com.company;

public class MagnusStringFizzBuzz {
    public String magnusString(String magnusString2){
        if(magnusString2.length() == 15) return "FizzBuzz";

        else if (magnusString2.length() == 5) return "Fizz";
        else if(magnusString2.length() == 3) return "Buzz";
        return "No FizzBuzz";
    }
}
