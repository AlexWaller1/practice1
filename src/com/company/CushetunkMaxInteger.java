package com.company;

import java.util.LinkedList;

public class CushetunkMaxInteger {
    public String cushetunkString (LinkedList<Integer> cushetunk){
        int max = cushetunk.get(0);
        String maxString = "";
        for (int hh1 = 1; hh1 < cushetunk.size(); hh1++){
            if (cushetunk.get(hh1) > max){
                max = cushetunk.get(hh1);
                maxString = max + " is the biggest integer in the Linked List";
            }
        }
        return maxString;
    }
}
