package com.company;

public class PickerelColaFizzBuzz {
    public String pickerelFizz(int pickerelBuzz){
        String fizzBuzz = "";
        if(pickerelBuzz % 5 == 0 && pickerelBuzz % 3 == 0){
            fizzBuzz = pickerelBuzz + " is FizzBuzz";
        }
        else if(pickerelBuzz % 5 == 0){
            fizzBuzz = pickerelBuzz + " is Fizz";
        }
        else if(pickerelBuzz % 3 == 0){
            fizzBuzz = pickerelBuzz + " is Buzz";
        }
        else
            fizzBuzz = pickerelBuzz + " is not a FizzBuzz";
        return fizzBuzz;
    }
}
