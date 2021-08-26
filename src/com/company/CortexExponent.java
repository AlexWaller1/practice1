package com.company;

public class CortexExponent {
    public boolean roboCortex(int cortexInteger){
        if(cortexInteger % Math.sqrt(cortexInteger) == 0) return true;
        return false;
    }
}
