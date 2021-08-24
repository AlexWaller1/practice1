package com.company;

public class Mellon_Tech_2 {
    public StringBuilder mellonShredder(String mellonAxeMan){
        // algorithm returns a StringBuilder and takes in a String as a parameter
        StringBuilder mellon_tech = new StringBuilder();
        mellon_tech.append(mellonAxeMan);
        mellon_tech = mellon_tech.deleteCharAt(0);
        // deleting the first character in the String
        mellon_tech = mellon_tech.replace(0, 0, "Stratocaster ");
        // inserting a new string to replace the character we replaced
        return  mellon_tech;
    }
}
