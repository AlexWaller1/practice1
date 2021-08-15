package com.company;

public class RandallParkMallPalindromeInteger {
    public String cornDogStand(int taterTots){
        String sodaFizz = "";
        int soda1 = taterTots;
        int remainder = 0;
        int reverse = 0;
        for(; taterTots != 0; taterTots = taterTots / 10){
                  remainder = taterTots % 10;
                  reverse = reverse * 10 + remainder;
                  if(reverse == soda1){
                      sodaFizz = reverse + " is a palindrome.";
                  }
                  else
                      sodaFizz = reverse + " is not a palindrome.";
        }
        return sodaFizz;
    }
}
