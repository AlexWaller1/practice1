package com.company;

public class practice123 {
    public int addDigits(int number){
        // function takes parameter of number
        String str = String.valueOf(number);
        // switching number to a string
        int countSoFar = 0;
        // declaring countSoFar
        for (int i = 0; i < str.length(); i++) {
            // iterating through each character of the string
            var currentChar = str.charAt(i);
            // is taking string characters one at a time
            var currentCharAsString = String.valueOf(currentChar);
            // switching character to string
            countSoFar = countSoFar + Integer.parseInt(currentCharAsString);
            // adding current digit after switching to integer to countSoFar

        }
         // 0, 0 + 1,
        return countSoFar;
        // return total count



        // 9229
        // ascii code
    }

}
