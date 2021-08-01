package com.company;
import javax.swing.*;
import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.Arrays;
import java.util.Locale;

public class HammerheadPickerelCola {

    private int x;

    public static void main(String[] args) {

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
        int[] troutNo = {37, 36, 121, 144};
        String[] hybridString = {"37", "102", "2309", "1992", "44"};

        int result = practiceObject.addDigits(hybridNo[7]);
        System.out.println(result);
        System.out.println("A" + "B");

        if (hammerHead[0] == "Hammerhead") {
            String shark1 = hybridString[0].concat(hybridString[1]);
            System.out.println(shark1);
            int countSoFar = 0;
            // incremental variable
            for (int h1 = 0; h1 < shark1.length(); h1++) {
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

        if (samurai[0] == "Lone Wolf Samurai" && samurai[1] == "Kenji the Crane") {
            String crane1 = hybridString[0].concat(hybridString[3]);
            // concatenating strings
            System.out.println(crane1);
            // printing concatenated string to console
            int countSoFar = 1;
            // incremental variable when we're trying to find a product
            for (int c1 = 0; c1 < crane1.length(); c1++) {
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

        if (samurai[2] == "Laramie") {

            String scrapper1 = hybridString[0].concat(hybridString[4]);
            // concatenating strings
            System.out.println(scrapper1);
            // making sure strings concatenated by printing string to console
            int countSoFar = 1;
            // incremental variable
            for (int l1 = 0; l1 < scrapper1.length(); l1++) {
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

            if (samurai[0] == "Lone Wolf Samurai") {
                for (int s1 = 0; s1 < samurai.length; s1++) {
                    System.out.println(s1 + " " + samurai[s1]);
                }
            }

            if (samurai[3] == "Glynis") {
                StringBuilder glynis = new StringBuilder();
                glynis.append(samurai[3] + " is best friends with Laramie.");
                glynis = glynis.reverse();
                System.out.println(glynis);
                glynis = glynis.reverse();
                System.out.println(glynis);
            }

            if (samurai[6] == "The Wraith") {
                System.out.println(hybridNo[4]);
                String wraith = String.valueOf(hybridNo[4]);
                StringBuilder wraith1 = new StringBuilder();
                wraith1.append(wraith);
                wraith1 = wraith1.reverse();
                System.out.println(wraith1);
            }

            if (samurai[7] == "Wushu Lizard") {
                int w1 = hybridNo[6];
                // assigning int variable
                int reverse = 0;
                // incremental variable
                for (; w1 != 0; w1 = w1 / 10) {
                    // while w1 does not equal 0
                    // new w1 will equal previous w1 divided by 10
                    int remainder = w1 % 10;
                    // taking the remainder off the number
                    reverse = reverse * 10 + remainder;
                }
                System.out.println(reverse);
            }


        }

        System.out.println(hammerHead[0]);

        System.out.println(hybridString[3]);
        System.out.println(hybridString[1]);

        if (samurai[0] == "Lone Wolf Samurai" && samurai[7] == "Wushu Lizard") {
            int lizard = Integer.parseInt(hybridString[3]);
            int loneWolf = Integer.parseInt(hybridString[1]);
            int sum = lizard + loneWolf;
            System.out.println(sum);
        }

        if (robots[2] == "Mellon-Tech") {
            String robo = hybridString[0].concat(hybridString[4]);
            // combining strings
            System.out.println(robo);
            // printing to console to confirm
            int product = 1;
            // incremental variable
            for (int r1 = 0; r1 < robo.length(); r1++) {
                // iterating through each character of the string
                char currentChar = robo.charAt(r1);
                // taking each character of the string 1 by 1
                String currentCharAsString = String.valueOf(currentChar);
                // converting each character to a string 1 by 1
                product = product * Integer.parseInt(currentCharAsString);
                // incremental variable
            }
            System.out.println(product);
            // product of digits of 3744 is 336
        }

        if (dachshunds[2] == "Bodhi" && dachshunds[1] == "Chipper") {
            for (int d1 = 0; d1 < dachshunds.length; d1++) {
                if (dachshunds[d1].chars().count() >= 5) {
                    System.out.println(dachshunds[d1] + " has more than five characters in their name");

                } else
                    System.out.println(dachshunds[d1] + " has less than 5 characters in their name");
            }
        }

        String ab = "A B";
        System.out.println(ab.chars().count());
        // output to console is 3, keep in mind an empty space counts as a character
        System.out.println(pisces.length);
        // output is 7
        System.out.println(hybridNo[9]);
        // number is 9229
        System.out.println(hybridNo[9] % 10);
        // will give us remainder of number

        if (pisces[1] == "Governal") {
            String scrap = String.valueOf(hybridNo[7]);
            // converting integer to string
            scrap.getClass();
            System.out.println(scrap.getClass());
            // getClass() will let you know what type of data it is, in this case it prints String
            double squareRoot = 0;
            double square = 0;
            int countSoFar = 0;
            // incremental variable
            for (int f1 = 0; f1 < scrap.length(); f1++) {
                // iterating through each character of the string
                char currentChar = scrap.charAt(f1);
                // gathering up each character 1 by 1
                String currentCharAsString = String.valueOf(currentChar);
                // converting each character back into a string 1 by 1
                countSoFar = countSoFar + Integer.parseInt(currentCharAsString);
                // incrementing, also turning each string character back into an integer
                squareRoot = Math.sqrt(countSoFar);
                square = Math.pow(countSoFar, 2);

            }
            System.out.println(square);
            // output is 441.0, so this is squaring the integer, not finding the square root of one
            System.out.println(squareRoot);
            // output is 4.58257569495584

        }

        System.out.println(Math.sqrt(36));
        // outputs 6 to console
        System.out.println(Math.sqrt(144));
        // outputs 12 to console
        System.out.println(Math.sqrt(troutNo[0]));

        if (samurai[1] == "Kenji the Crane") {
            for (int k1 = 0; k1 < troutNo.length; k1++) {
                if (Math.sqrt(troutNo[k1]) == 0) {
                    System.out.println(k1);
                }
            }
        }

        System.out.println(hammerHead.length);

        if (hammerHead[5] == "The Cosmic Trout") {
            int h1 = 15;
            if (h1 % 5 == 0 && h1 % 3 == 0) {
                System.out.println("Cosmic Trout");
            } else if (h1 % 5 == 0) {
                System.out.println("Cosmic");
            } else if (h1 % 3 == 0) {
                System.out.println("Trout");
            } else
                System.out.println("Whitefish");
        }
        // remember that we need to use % cause we are ultimately testing for remainder
        // fizzbuzz type algorithm

        if (hammerHead[3] == "Harvey") {
            String beaver = String.valueOf(hybridNo[3]);
            // converting an integer to a string
            int countSoFar = 1;
            // incremental variable for finding a product
            double squareRoot = 0;
            // variable will be used gathering the square root
            double ogSquareRoot = 0;
            // will be used to get square root of original integer
            for (int h1 = 0; h1 < beaver.length(); h1++) {
                // iterate through each character of the beaver string
                char currentChar = beaver.charAt(h1);
                // gathering the characters one at a time
                String currentCharAsString = String.valueOf(currentChar);
                // converting characters to string characters 1 by 1
                countSoFar = countSoFar * Integer.parseInt(currentCharAsString);
                // incrementing and converting string characters to integers
                squareRoot = Math.sqrt(countSoFar);
                // will find square root of product
                ogSquareRoot = Math.sqrt(hybridNo[3]);
                // square root of original integer entered

            }
            System.out.println("The product of the integers is " + countSoFar);
            // printing product of integers to console
            System.out.println("The square root of that product is " + squareRoot);
            // printing square root of that product to the console
            System.out.println("The square root of the orignal integer is " + ogSquareRoot);
            // will print original integer to the console
        }

        System.out.println(hammerHead[0]);

        if (samurai[0] == "Lone Wolf Samurai") {

            // function to reverse integer
            int w1 = hybridNo[4], reverse = 0;
            // reverse is incremental variable

            for (; w1 != 0; w1 = w1 / 10) {

                int remainder = w1 % 10;
                // dividing w1 by 10 and taking the remainder
                reverse = reverse * 10 + remainder;
            }
            System.out.println(reverse);

        }

        if (samurai[1] == "Kenji the Crane") {
            String loneWolf = String.valueOf(hybridNo[4]);
            // converting integer to string
            int countSoFar = 0;
            // incremental variable
            for (int c1 = 0; c1 < loneWolf.length(); c1++) {
                // iterating through each character in the string
                char currentChar = loneWolf.charAt(c1);
                // taking each character one at a time
                String currentCharAsString = String.valueOf(currentChar);
                // changing each character back into string characters 1 by 1
                countSoFar = countSoFar + Integer.parseInt(currentCharAsString);
                // incrementing sum with each converted integer
                // also converting strings to integers 1 by 1
            }
        }

        if (hammerHead[1] == "Taylor") {
            int Laramie = Integer.parseInt(hybridString[1]);
            // converting string to integer
            int Kenji = Integer.parseInt(hybridString[2]);
            // converting string to integer
            int product = Kenji * Laramie;
            System.out.println(product);
        }

        if (robots[2] == "Mellon-Tech") {
            for (int h1 = 0; h1 < hammerHead.length; h1++) {

                System.out.println(h1 + " " + hammerHead[h1]);
            }
        }

        if (hammerHead[4] == "Wibaux") {
            StringBuilder wibaux = new StringBuilder();
            wibaux.append(hammerHead[4] + " really loves Pickerel Cola");
            wibaux = wibaux.reverse();
            System.out.println(wibaux);
            wibaux = wibaux.reverse();
            System.out.println(wibaux);
        }

        if (hammerHead[5] == "The Cosmic Trout") {
            int whiteFish = troutNo[1];
            double seaWeed = Math.sqrt(whiteFish);
            // will find the square root of a number
            double snag = Math.pow(seaWeed, 2);
            // will multiply the number by specified power
            System.out.println(seaWeed);
            System.out.println(snag);
        }

        if (hammerHead.length == 6 && hammerHead[2] == "Geometry Man") {
            for (int h1 = 0; h1 < troutNo.length; h1++) {
                if (troutNo[h1] % Math.sqrt(troutNo[h1]) == 0) {

                    System.out.println(troutNo[h1] + " has a whole number for a square root");

                }
                else
                    System.out.println(troutNo[h1] + " does not have a whole number for a square root");
            }


            }

        if(hammerHead.length == 6){
            String cola = String.valueOf(treeNo[0]);
            // converting integer to string
            int countSoFar = 0;
            // incremental variable
            for(int p1 = 0; p1 < cola.length(); p1++){
                // iterating through each character of the string
                char currentChar = cola.charAt(p1);
                // gathering up each character one by one
                String currentCharAsString = String.valueOf(currentChar);
                // converting each character back into a string character
                countSoFar = countSoFar + Integer.parseInt(currentCharAsString);
            }
            System.out.println(countSoFar);
        }

        if(samurai[0] == "Lone Wolf Samurai"){
            System.out.println(hammerHead[0].chars().count());
            int reverse = 0;
            // incremental variable
            for(int h1 = treeNo[2]; h1 != 0; h1 = h1 / 10){

                int remainder = h1 % 10;
                // taking the remainder
                reverse = reverse * 10 + remainder;
            }
            System.out.println(reverse);
        }

        for(int t1 = 0; t1 < treeNo.length; t1++){
            System.out.println(treeNo[t1]);
        }

        if(samurai[1] == "Kenji the Crane"){
            for(int t1 = 0; t1 < treeNo.length; t1++){
                if(treeNo[t1] % Math.sqrt(treeNo[t1]) == 0){
                    System.out.println(treeNo[t1] + " has a square root that's a whole number");
                }
                else
                    System.out.println(treeNo[t1] + " has a square root that is not a whole number.");
            }
        }

        if(hammerHead[3] == "Harvey"){
            long h1 = hammerHead[4].chars().count();
            long sum = h1 + 9;
            System.out.println(h1);
            System.out.println(sum);
        }

        if(hammerHead[4] == "Wibaux"){
            int sum = Integer.parseInt(hybridString[0]) + Integer.parseInt(hybridString[1]);
            // converting to strings to integers and then adding them
            System.out.println(sum);
        }

        if(samurai[2] == "Laramie"){
            String sum = hammerHead[0] + hammerHead[4];
            // another way to concatenate strings
            System.out.println(sum);
            String scrapper = String.valueOf(sum);
            StringBuilder laramie = new StringBuilder();
            laramie.append(scrapper);
            laramie = laramie.reverse();
            System.out.println(laramie);

        }

        if(samurai[7] == "Wushu Lizard"){

            String lizard = samurai[7];

            lizard = lizard.replaceAll("\\s", "");
            System.out.println(lizard);
            // worked for taking away all the whitespace
            // \\s is code for a single space
        }

        if(samurai[3] == "Glynis"){
            String glynis = samurai[7];

            glynis = glynis.replaceAll("\\s", hammerHead[0]);
            // replacing empty spaces with the string "Hammerhead"
            System.out.println(glynis);
        }

        System.out.println(samurai.length);

        if(samurai.length == 9){
            StringBuilder glynis = new StringBuilder();
            glynis.append(samurai[3] + " is a green dog from the farthest reaches of space");
            glynis = glynis.reverse();
            System.out.println(glynis);
            String glynis1 = String.valueOf(glynis);
            glynis1 = glynis1.replaceAll("\\s", "||");
            System.out.println(glynis1);
            glynis = glynis.reverse();
            System.out.println(glynis);
        }

        if(samurai[2] == "Laramie" && samurai[7] == "Wushu Lizard"){
            String trout1 = hammerHead[5];
            trout1 = trout1.replaceAll("\\s", "___");
            System.out.println(trout1);
        }

        if(robots.length == 4){
            int s1 = 0;
            while(s1 < samurai.length){
                System.out.println(s1 + " " + samurai[s1]);
                s1++;
            }
        }

        if(samurai[6] == "The Wraith"){
            for(int s1 = 0; s1 < samurai.length; s1++){
                String wraith = samurai[s1];
                wraith = wraith.replaceAll("\\s", "!!!");
                // replacing white spaces with "!!!"
                wraith = wraith.toUpperCase();
                // making each string all upper case
                System.out.println(wraith);

            }

        }








        }
    }


