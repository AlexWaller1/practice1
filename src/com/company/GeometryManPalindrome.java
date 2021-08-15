package com.company;

public class GeometryManPalindrome {
    String geometryMan(String isosceles){
        String scalene = "";
        int triangle1 = 0;
        // first index of string
        int triangle2 = isosceles.length() - 1;
        // last index of string
        for(; triangle1 < triangle2; triangle1++, triangle2--){
            if(isosceles.charAt(triangle1++) != isosceles.charAt(triangle2--)){
                scalene =  isosceles + " is not a palindrome.";
            }
            else
                scalene =  isosceles + " is a palindrome.";
        }
        return scalene;
    }
}
