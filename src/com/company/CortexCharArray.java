package com.company;

public class CortexCharArray {
    public char cortexChar (String cortexString){
        char cortexChar3 = 1;
        char[] cortexChar2 = cortexString.toCharArray();
        for (int hh1 = 0; hh1 < cortexChar2.length; hh1++){
             cortexChar3 = cortexChar2[hh1];
        }
        return cortexChar3;
    }
}
