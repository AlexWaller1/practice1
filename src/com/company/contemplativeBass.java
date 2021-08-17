package com.company;

public class contemplativeBass {
    public String lureSnag(String tangledLines){
        char lastChar = tangledLines.charAt(tangledLines.length() - 1);
        String lastCharString = String.valueOf(lastChar);
        tangledLines = tangledLines.replaceFirst(lastCharString, "7");
        return tangledLines;
    }
}
