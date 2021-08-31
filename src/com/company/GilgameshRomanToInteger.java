package com.company;
import java.util.*;
/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D, and M.
I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000

For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply
X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII.
Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same
principle applies to nine, which is written as IX. There are instances where subtraction is used:

-   I can placed before V(5) and X(10) to make 4 and 9.
-   X can be placed before L(50) and C(100) to make 40 and 90.
-   C can be placed before D(500) and M(1000) to make 400 and 900.

Given a roman numeral, convert it to an integer.

Input: s = "III"
Output: 3

Input: s = "IX"
Output: 4

Input: s = "IX"
Output: 9


 */

public class GilgameshRomanToInteger {

    static Map<String, Integer> values = new HashMap<>();
    /*
    HashMap<Key, Value> is a part of Java's collection since Java 1.2. This class is found in java.util package. It
    provides the basic implementation of the Map interface of Java. It stores the data in (Key, Value) pairs, and you
    can access them by an index of another type (e.g. an integer). One object is used as a key(index) to another object
    (value). If you try to insert the duplicate key, it will replace the element of the corresponding key..

    */

    static {
        values.put("M", 1000);
        values.put("D", 500);
        values.put("C", 100);
        values.put("L", 50);
        values.put("X", 10);
        values.put("V", 5);
        values.put("I", 1);
    }


    public int gilgameshInteger(String gilgameshString){
        // let's say string is "V"
        int sum = 0;
        int hh1 = 0;
        while(hh1 < gilgameshString.length()){
        // length of "V" is 1, so while hh1 < 1
            String currentSymbol = gilgameshString.substring(hh1, hh1 + 1);
            // the substring of "V" at coordinates between coordinates 0 and 1 is "V"
            //
            int currentValue = values.get(currentSymbol);
            // values.get("V") will equal 5
            int nextValue = 0;
            // nextValue assigned to zero
            if(hh1 + 1 < gilgameshString.length()){
                // since 1 is not less than 1, we'll skip this if condition for "V"
                String nextSymbol = gilgameshString.substring(hh1 + 1, hh1 + 2);
                //
                nextValue = values.get(nextSymbol);
            }

            if(currentValue < nextValue){
                sum += (nextValue - currentValue);
                hh1 += 2;
            }
            else{
                sum += currentValue;
                hh1 += 1;
            }


        }
     return sum;
    }
}
