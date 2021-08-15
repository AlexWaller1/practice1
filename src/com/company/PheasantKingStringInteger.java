package com.company;

public class PheasantKingStringInteger {
    public int pheasantGravel(String greenRed){
       int product = 1;
       for(int pk1 = 0; pk1 < greenRed.length(); pk1++){
           // iterating through each character of string
           char currentChar = greenRed.charAt(pk1);
           // gathering up each character 1 by 1
           String currentCharAsString = String.valueOf(currentChar);
           // converting each character bakc to string
           product = product * Integer.parseInt(currentCharAsString);
       }
       return product;
    }
}
