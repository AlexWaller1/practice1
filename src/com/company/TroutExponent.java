package com.company;

public class TroutExponent {
    public String troutString (int troutInteger) {
        if (troutInteger % Math.sqrt(troutInteger) == 0) return troutInteger + " has a whole number for a square root";
        return troutInteger + " does not have a whole number for a square root.";
    }
}
