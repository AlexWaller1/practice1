package com.company;

public class PizzaRanchRegexReverse {
    public StringBuilder pizzaRanchStringBuilder(String pizzaRanchString){
        pizzaRanchString = pizzaRanchString.replaceAll("\\s", "!!!!");
        StringBuilder mitchellSD = new StringBuilder();
        mitchellSD.append(pizzaRanchString);
        mitchellSD = mitchellSD.reverse();
        return mitchellSD;
    }
}
