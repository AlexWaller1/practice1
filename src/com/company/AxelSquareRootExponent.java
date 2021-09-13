package com.company;

public class AxelSquareRootExponent {
    public String axelString(int axelInteger){
        String axel1 = "";
        double axel2 = Math.pow(axelInteger, 2);
        if(axelInteger % Math.sqrt(axelInteger) == 0){
            axel1 = axelInteger + " has a whole number for a square root. The integer squared is " + axel2;
        }
        else
            axel1 = axelInteger + " does not have a whole number for a square root, but the integer to the " +
                    "power of 2 is " + axel2;
        return axel1;
    }
}
