package com.company;

public class BodhiFizzBuzz {
    public String fizz (int buzz){
        if(buzz % 5 == 0 && buzz % 3 == 0) return "FizzBuzz";
        else if(buzz % 5 == 0) return "Fizz";
        else if(buzz % 3 == 0) return "Buzz";
        return "Not a FizzBuzz";
    }
}
