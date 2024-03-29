package com.company;

public class PickerelColaPremiumCustomer {
    String pickerelCustomerString(String pickerelCustomerType, double pickerelPrice){
        String pickerelCustomerType1 = pickerelCustomerType.toLowerCase();
        String returnString = "";
        // so it can read entry even there are uppercase characters
        // Customer Types are Surface, Seaweed, and Snag
        // Surface gets 10% off
        if (pickerelCustomerType1 == "surface"){
            pickerelPrice = pickerelPrice - (pickerelPrice * .10);
            returnString = "The price is " + pickerelPrice;
        }
        // Seaweed gets 15% off
        else if (pickerelCustomerType1 == "seaweed"){
            pickerelPrice = pickerelPrice - (pickerelPrice * .15);
            returnString = "The price is " + pickerelPrice;
        }
        // Snag gets 20% off
        else if (pickerelCustomerType1 == "snag"){
            pickerelPrice = pickerelPrice - (pickerelPrice * .20);
            returnString = "The price is " + pickerelPrice;
        }
        else
            returnString = "Sorry, that is not a customer category.";

        return returnString;
    }
}
