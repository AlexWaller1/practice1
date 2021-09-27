package com.company;

import java.util.Stack;

public class Hank_44LongestCommonPrefix {
    public String hankString (Stack<String> hankStack){
        if (hankStack.empty()) return "This is an empty stack.";
        // edge case in the event that the stack is empty
        String prefix = hankStack.get(0) ;
        // first element in the stack will be compared to the other elements in the stack
        for(int hh1 = 1; hh1 < hankStack.size(); hh1++){
            // no need to compare first element in the stack to itself
            while(hankStack.get(hh1).indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}
