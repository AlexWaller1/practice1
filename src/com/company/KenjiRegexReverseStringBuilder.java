package com.company;

public class KenjiRegexReverseStringBuilder {
    public StringBuilder crane(String craneFighter){
        craneFighter = craneFighter.replaceAll("\\s", "==");
        StringBuilder sandHill = new StringBuilder();
        sandHill.append(craneFighter);
        sandHill = sandHill.reverse();
        return sandHill;
    }

}
