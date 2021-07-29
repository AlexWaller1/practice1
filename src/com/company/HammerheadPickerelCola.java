package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.Arrays;
import java.util.Locale;

public class HammerheadPickerelCola {

    private int x;

    public static void main(String[] args){

        practice123 practiceObject = new practice123();
        // can implement a function from another class by doing this

        String ramHybrid1 = "Tony";
        String ramHybrid2 = "Otto";
        String ramHybrid3 = "Jay";
        String ramHybrid4 = "Stacey";

        String treeHybrid1 = "Cornelius";
        String treeHybrid2 = "Magnus";
        String treeHybrid3 = "Owen";
        String treeHybrid4 = "Everett";
        String treeHybrid5 = "Jasper";

        String troutHybrid1 = "Rainbow";
        String troutHybrid2 = "Brown";

        String robot1 = "Hank-44";
        String robot2 = "Warren-21";
        String robot3 = "Mellon-Tech";
        String robot4 = "Eggplant-Head";

        double ramHybridNo = 4;
        double treeHybridNo = 5;
        double troutHybridNo = 2;
        double robotNo = 4;
        double dachshundNo = 5;

        String[] rams = {"Tony", "Otto", "Jay", "Stacey"};
        String[] trees = {"Cornelius", "Magnus", "Owen", "Everett", "Jasper"};
        String[] trout = {"Rainbow", "Brown"};
        String[] robots = {"Hank-44", "Warren-21", "Mellon-Tech", "Eggplant-Head"};
        String[] dachshunds = {"Beezer", "Chipper", "Bodhi", "Jake", "Star"};
        String[] samurai = {"Lone Wolf Samurai", "Kenji the Crane", "Laramie", "Glynis", "Zeno", "Samos",
        "The Wraith", "Wushu Lizard", "Citrine Dragons"};
        String[] bigHornCrew = {"Ace", "Columbus", "Marek", "Radek", "Axel"};
        String[] hammerHead = {"Hammerhead", "Taylor", "Geometry Man", "Harvey", "Wibaux", "The Cosmic Trout"};
        String[] pisces = {"Galahad", "Governal", "Berinon", "Forthwind", "Hadrian", "Aetius", "Urbicus"};
        String[] petroleum = {"Thierry", "Laurent", "Antoine", "Hunzuu", "Gilgamesh"};
        int[] hybridNo = {37, 9, 44, 23, 21, 102, 2309, 1992, 2002, 9229};
        int[] roboNo = {1, 2, 3, 4};
        int[] treeNo = {2, 4, 6, 9, 12};
        String[] hybridString = {"37", "102", "2309", "1992", "44"};

        int result = practiceObject.addDigits(hybridNo[7]);
        System.out.println(result);
        System.out.println("A" + "B");

        if(hammerHead[0] == "Hammerhead"){
            String shark1 = hybridString[0].concat(hybridString[1]);
            System.out.println(shark1);
            int countSoFar = 0;
            // incremental variable
            for (int h1 = 0; h1 < shark1.length(); h1++){
                // iterating through each character 1 by 1
                char currrentChar = shark1.charAt(h1);
                // gathering each character 1 by 1
                String currentCharAsString = String.valueOf(currrentChar);
                // converting each character back into a string character 1 by one
                countSoFar = countSoFar + Integer.parseInt(currentCharAsString);
                // converting string characters to integers

            }
            System.out.println(countSoFar);
            // print total sum of the integers
        }

        System.out.println(samurai[1]);
        System.out.println(samurai[0]);

        if(samurai[0] == "Lone Wolf Samurai" && samurai[1] == "Kenji the Crane"){
            String crane1 = hybridString[0].concat(hybridString[3]);
            // concatenating strings
            System.out.println(crane1);
            // printing concatenated string to console
            int countSoFar = 1;
            // incremental variable when we're trying to find a product
            for (int c1 = 0; c1 < crane1.length(); c1++){
                // iterating through each character of the string
                char currentChar = crane1.charAt(c1);
                // gathering each character 1 by 1
                String currentCharAsString = String.valueOf(currentChar);
                // converting each character back to a string 1 by 1
                countSoFar = countSoFar * Integer.parseInt(currentCharAsString);
                // incremental variable starts at 1 since this is multiplication
                // converting string character to an integer
            }
            System.out.println(countSoFar + " is the product of digits in this integer.");
        }

        System.out.println(samurai[2]);

        if(samurai[2] == "Laramie"){

            String scrapper1 = hybridString[0].concat(hybridString[4]);
            // concatenating strings
            System.out.println(scrapper1);
            // making sure strings concatenated by printing string to console
            int countSoFar = 1;
            // incremental variable
            for(int l1 = 0; l1 < scrapper1.length(); l1++){
                // iterating through each character of the string
                char currentChar = scrapper1.charAt(l1);
                // gathering each character 1 by 1
                String currentCharAsString = String.valueOf(currentChar);
                // converting each character to a string 1 by 1
                countSoFar = Integer.parseInt(currentCharAsString) / countSoFar;
                // incremental variable
            }
            System.out.println(countSoFar + " is the quotient of the digits of the integer.");
            // function works


        }









    }



}
