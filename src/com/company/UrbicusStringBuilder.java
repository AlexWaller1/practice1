package com.company;

public class UrbicusStringBuilder {
    public StringBuilder urbicusBuilder(String urbicusString){
         urbicusString = urbicusString.replaceAll("\\s", "==");
         StringBuilder uBuilder = new StringBuilder();
         uBuilder.append(urbicusString);
         uBuilder = uBuilder.deleteCharAt(5);
         uBuilder = uBuilder.replace(5, 7, "##");
         return  uBuilder;
    }
}
