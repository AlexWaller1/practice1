package com.company;

public class lemonPickerelColaStringBuilder {
    public StringBuilder lemonCola(String colaLemonPickerel){

        colaLemonPickerel = colaLemonPickerel.replaceAll("\\s", "==");
        StringBuilder pickerelColaMachine = new StringBuilder();
        pickerelColaMachine.append(colaLemonPickerel);
        return pickerelColaMachine;
    }
}
