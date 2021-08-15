package com.company;

public class HadrianStringToInteger {
    public int hadrianPisces(String hadal){
        int product = 1;
        int waterBottle = Integer.parseInt(hadal);
        // lets say waterBottle = 37
        for(; waterBottle > 0; waterBottle = waterBottle / 10 ){
            // 37
            // 3

            product = product * (waterBottle % 10);
            // 1 * (37 % 10) = 7
            // 7 * (3 % 10) = 21
            // product = 21
        }
        return product;
    }
}
