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

        if(samurai[7] == "Wushu Lizard"){
            int s1 = 8;
            do{
                StringBuilder wraith = new StringBuilder();
                wraith.append(samurai[s1]);
                wraith = wraith.reverse();
                System.out.println(wraith);
                s1--;
            }while(s1 >= 0);
        }
        // reversing each string in the array using a do while loop

        System.out.println(pisces.length);

        if(pisces[1] == "Governal"){
            int fish1 = 6;
            while(fish1 >= 0){
                String fish2 = pisces[fish1];
                fish2 = fish2.toUpperCase(Locale.ROOT);
                System.out.println(fish2);
                fish1--;
            }
        }
        // outputting each element in the array with all uppercase letters

        if(pisces[4] == "Hadrian"){
            int fish1 = 0;
            for (; fish1 < pisces.length; fish1++){
                String fish2 = pisces[fish1];
                fish2 = fish2.toUpperCase();
                System.out.println(fish2);
                fish2 = fish2.toLowerCase();
                System.out.println(fish2);
            }
            // prints string in uppercase and then string in lowercase to console

        }

        System.out.println(bigHornCrew.length);

        if(bigHornCrew.length == 5){
            for(int bh1 = 0; bh1 < bigHornCrew.length; bh1++){
                System.out.println(bigHornCrew[bh1]);
            }
        }

        if(bigHornCrew[0] == "Ace"){
            int bh1 = 0;
            for(; bh1 < bigHornCrew.length; bh1++){
                String bighorn = bigHornCrew[bh1];
                bighorn = bighorn.toUpperCase();
                System.out.println(bighorn);
            }
        }

        if(bigHornCrew[4] == "Axel"){
            int bh1 = 0;
            for(; bh1 < bigHornCrew.length; bh1++){
                if(bh1 == 4){
                    String bighorn = bigHornCrew[bh1];
                    bighorn = bighorn.toUpperCase();
                    System.out.println(bighorn);
                }
            }
        }

        if(bigHornCrew[1] == "Columbus"){
            int bh1 = hybridNo[3];
            int reverse = 0;
            // incremental variable
            for(; bh1 != 0; bh1 = bh1 / 10){
                int remainder = bh1 % 10;

                reverse = reverse * 10 + remainder;

            }
            System.out.println(reverse);
        }

        if(bigHornCrew[2] == "Marek"){
            int bh1 = 0;
            for(; bh1 < bigHornCrew.length; bh1++){
                if(bh1 == 0){

                    System.out.println(bigHornCrew[bh1].toUpperCase());
                    // best to do in one line
                }
            }
        }

        if(bigHornCrew[3] == "Radek"){
            String trout1 = hammerHead[5];
            trout1 = trout1.replaceAll("\\s", "Raibow");
            System.out.println(trout1);
            System.out.println(trout1.toUpperCase());
        }

        System.out.println(pisces[4]);

        if(pisces[4] == "Hadrian"){
            String fish = pisces[4] + " is the general of the Hadal Army";
            System.out.println(fish);
            fish = fish.replaceAll("\\s", "||");
            System.out.println(fish);
            System.out.println(fish.toUpperCase());
        }

        System.out.println(pisces[6]);

        if(pisces[5] == "Aetius"){
            int bh1 = hybridNo[7];
            int reverse = 0;
            // incremental variable
            for(; bh1 != 0; bh1 = bh1 / 10){

                int remainder = bh1 % 10;
                reverse = reverse * 10 + remainder;
                System.out.println(reverse);
            }
        }

        if(pisces[6] == "Urbicus"){
            String fish = String.valueOf(hybridNo[7]);
            int countSoFar = 0, difference = 0, quotient = 1, product = 1, pgf1 = 0;
            // incremental variables and for loop variable

            for(; pgf1 < fish.length(); pgf1++){
                // iterating through each character of the string
                char currentChar = fish.charAt(pgf1);
                // gathering up each character one by one
                String currentCharAsString = String.valueOf(currentChar);
                countSoFar = countSoFar + Integer.parseInt(currentCharAsString);
                product = product * Integer.parseInt(currentCharAsString);
                quotient = Integer.parseInt(currentCharAsString) / quotient;
                difference = Integer.parseInt(currentCharAsString) - difference;

            }
            System.out.println("The sum of the digits is " + countSoFar);
            System.out.println("The product of the digits is " + product);
            System.out.println("The quotient of the digits is " + quotient);
            System.out.println("The difference of the digits is " + difference);
        }

        if(pisces[0] == "Galahad" && pisces[4] == "Hadrian"){
            String hadal = pisces[0] + " was once a general in the Hadal Empire.";
            System.out.println(hadal);
            hadal = hadal.replaceAll("\\s", "[#}");
            System.out.println(hadal);
            System.out.println(hadal.toUpperCase());
        }

        if(samurai[7] == "Wushu Lizard"){
            int pgf1 = hybridNo[5], reverse = 0;
            // reverse is an incremental variable
            for(; pgf1 != 0; pgf1 = pgf1 / 10){
               int remainder = pgf1 % 10;
               reverse = reverse * 10 +remainder;
            }
            System.out.println(reverse);
        }

        if(samurai[8] == "Citrine Dragons"){
            String wushu = String.valueOf(hybridNo[5]);
            int countSoFar = 1;
            // converting integer to string
            int W_L = 0;
            for(; W_L < wushu.length(); W_L++){
                // iterating through each character of string
                char currentChar = wushu.charAt(W_L);
                // gathering each character 1 by 1
                String currentCharAsString = String.valueOf(currentChar);
                // converting each character back to a string
                countSoFar = countSoFar * Integer.parseInt(currentCharAsString);

            }
            System.out.println(countSoFar);
        }

        if(samurai[0] == "Lone Wolf Samurai"){
            int LSW = 0;
            for(; LSW < hybridNo.length; LSW++){
                System.out.println( LSW + " " + hybridNo[LSW]);
            }
        }

        if(samurai[0] == "Lone Wolf Samurai" && samurai[7] == "Wushu Lizard"){
            int targetKick = 35;
            for(int LSW = 0; LSW < hybridNo.length; LSW++){
                for(int WL = LSW + 1; WL < hybridNo.length; WL++){
                    if(hybridNo[WL] - hybridNo[LSW] == targetKick ){
                        System.out.println(hybridNo[WL] + " - " + hybridNo[LSW] + " = " + targetKick);
                    }
                }
            }
        }

        if(pisces[1] == "Governal"){
            int bullsEyePunch = 2411;
            for(int LSW = 0; LSW < hybridNo.length; LSW++){
                for (int WL = LSW + 1; WL < hybridNo.length; WL++){
                    if(hybridNo[LSW] + hybridNo[WL] == bullsEyePunch){
                        System.out.println(hybridNo[LSW] + " + " + hybridNo[WL] + " = " + bullsEyePunch);
                    }
                }
            }
        }

        if(robots[0] == "Hank-44"){
            int r1 = 3;
            do{
                System.out.println(robots[r1] + " is an awesome robot!");
                r1--;
            }while(r1 >= 0);
        }

        if(robots.length == 4){
            int r1 = 3;
            for(; r1 >=0; r1--){
                if (r1 == 3){
                    System.out.println(robots[r1] + " can fix any telecaster!!!");
                }
            }
        }

        if(trees[0] == "Cornelius"){
            int t1 = hybridNo[4], reverse = 0;
            for(; t1 != 0; t1 = t1 / 10){
                int remainder = t1 % 10;
                reverse = reverse * 10 + remainder;
            }
            System.out.println(reverse);
        }

        if(rams[3] == "Stacey"){
            String hybrid = hybridString[0];
            int countSoFar = 1;
            // incremental variable
            for(int h1 = 0; h1 < hybrid.length(); h1++){
                // iterate through each character of the string
                char currentChar = hybrid.charAt(h1);
                // gathering each character 1 by 1
                String currentCharAsString = String.valueOf(currentChar);
                // converting each character back to a string character
                countSoFar = countSoFar * Integer.parseInt(currentCharAsString);
                // incrementing and converting the strings to integers
            }
            System.out.println(countSoFar);
        }

        if(samurai[0] == "Lone Wolf Samurai"){
            for(int LSW = 0; LSW < samurai.length; LSW++){
                String loneWolf = samurai[LSW];
                loneWolf = loneWolf.replaceAll("a", "!");
                System.out.println(loneWolf);
            }
        }








        }
    }


