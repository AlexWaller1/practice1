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
        int robotNo = 4;
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
        String[] ePetroleum = {"Thierry", "Laurent", "Antoine", "Hunzuu", "Gilgamesh"};
        int[] hybridNo = {37, 9, 44, 23, 21, 102, 2309, 1992, 2002, 9229};
        int[] roboNo = {1, 2, 3, 4};
        int[] treeNo = {2, 4, 6, 9, 12};
        int[] troutNo = {37, 36, 121, 144};
        String[] hybridString = {"37", "102", "2309", "1992", "44"};
        String[] troutString = {"racecar", "dachshund", "pickerel", "kayak", "level", "redivider", "sandhill"};

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

        if(robots[2] == "Mellon-Tech"){
            for(int mellon1 = 0; mellon1 < robots.length; mellon1++){
                for(int ram1 = 3; ram1 >= 0; ram1--){
                    System.out.println(mellon1 + " " + robots[mellon1] + " " + ram1 + " " + rams[ram1]);
                }
            }
        }

        System.out.println(pisces[0]);
        System.out.println(pisces[1]);
        System.out.println(pisces[4]);

        if(pisces[4] == "Hadrian"){
            int mellon1 = 0, ram1 = 3;
            String robo = "", ram = "";
            for(; mellon1 < robots.length; mellon1++){
                 robo = mellon1 + " " + robots[mellon1];
            }
            for(; ram1 >= 0; ram1--){
                 ram = ram1 + " " + rams[ram1];
            }
            System.out.println(robo + " " + ram);
        }

        if(pisces[0] == "Galahad"){
            int fish1 = hybridNo[6], countSoFar = 0, pgf1 = 0;
            String fish = String.valueOf(fish1);
            for(; pgf1 < fish.length(); pgf1++){
                // iterating through each character of the string
                char currentChar = fish.charAt(pgf1);
                // gathering up each character one by one
                String currentCharAsString = String.valueOf(currentChar);
                // converting each character back to string characters
                countSoFar = countSoFar + Integer.parseInt(currentCharAsString);
                // incremental variable   // changing string characters back to integers

            }
            System.out.println(countSoFar);
        }

        if(samurai[7] == "Wushu Lizard"){
            for(int WL = 0; WL < troutNo.length; WL++){
                if (troutNo[WL] % Math.sqrt(troutNo[WL]) == 0){
                    System.out.println(troutNo[WL] + " has a square root that is a whole number");
                }
                else
                    System.out.println(troutNo[WL] + " has a square root that is not a whole number");
            }
        }

        if(samurai[1] == "Kenji the Crane"){
            int KTC1 = 0;
            String crane = "";
            for (; KTC1 < samurai.length; KTC1++){
                crane = samurai[KTC1].replaceAll("e", "@@@");
                System.out.println(crane);
            }
        }

        if(bigHornCrew[0] == "Ace" && bigHornCrew[4] == "Axel"){
            int reverse = 0;

        }

        System.out.println(ePetroleum[0]);

        if(ePetroleum[0] == "Thierry"){
            for(int ep2 = 0; ep2 < ePetroleum.length; ep2++){
                System.out.println(ep2 + " " + ePetroleum[ep2]);
            }
        }

        if(ePetroleum[4] == "Gilgamesh"){
            int ep2 = troutNo[1], reverse = 0;
            // reverse is an incremental variable
            for(; ep2 != 0; ep2 = ep2 / 10){
                int remainder = ep2 % 10;

                reverse = reverse * 10 +remainder;
            }
            if(reverse % 2 == 0){
                System.out.println(reverse + " is an even number.");
            }
            else
                System.out.println(reverse + " is an odd number");
        }

        if(ePetroleum[1] == "Laurent"){
            int ep1 = 4;
            do{
                System.out.println(ePetroleum[ep1] + " is an employee of Emirati Petroleum.");
                ep1--;
            }while(ep1 >= 0);
        }

        if(ePetroleum[2] == "Antoine"){
            int ep1 = 4;
            while(ep1 >= 0){
                System.out.println(ePetroleum[ep1] + " is in Pisces Go Fish");
                ep1--;
            }
        }

        if(ePetroleum[3] == "Hunzuu"){
            String thierry = ePetroleum[3] + " is Laurent's longtime friend from Paris";
            System.out.println(thierry);
            thierry = thierry.replaceAll( ePetroleum[3], ePetroleum[0]);
            System.out.println(thierry);

        }

        // prime number is a number only divisible by 1 and itself
        // 3 is an example of a prime number

        if(ePetroleum[2] == "Antoine"){
            int ep1 = hybridNo[4], reverse = 0;
                                  // incremental variable
            for(; ep1 != 0; ep1 = ep1 / 10){
                int remainder = ep1 % 10;
                reverse = reverse * 10 + remainder;
            }
            System.out.println(reverse);
        }

        System.out.println(pisces.length);

        if(pisces.length == 7){
            for(int ep1 = 0; ep1 < pisces.length; ep1++){
                String fish = pisces[ep1] + " is battling in the Hadal Empire.";
                fish = fish.replaceAll("\\s", "###");
                System.out.println(fish);
            }
        }

        if(robots[2] == "Mellon-Tech"){
            String robot = String.valueOf(robotNo);
            int r1 = 0, sum = 0, difference = 0, product = 1, quotient = 1, remainder = 0;
            // variable for For loop  // incremental variable
            for(; r1 < robot.length(); r1++){
                // iterating through each character in the string
                char currentChar = robot.charAt(r1);
                // gathering each character 1 by 1
                String currentCharAsString = String.valueOf(currentChar);
                // converting each character ack into strings
                sum = sum + Integer.parseInt(currentCharAsString);
                difference = Integer.parseInt(currentCharAsString) - difference;
                product = product * Integer.parseInt(currentCharAsString);
                quotient = Integer.parseInt(currentCharAsString) / quotient;
                remainder = Integer.parseInt(currentCharAsString) % 10;
            }
            System.out.println(sum + difference + product + quotient + remainder);

            // will add these all together for output
            System.out.println(remainder);
        }

        System.out.println(9 % 10);
        System.out.println(ePetroleum.length);

        if(ePetroleum[2] == "Antoine"){
            int pgf1 = 4;
            while(pgf1 >= 0){
                System.out.println(ePetroleum[pgf1] + " works for Emirati Petroleum.");
                pgf1--;
            }

        }

        if(ePetroleum[0] == "Thierry" && ePetroleum[1] == "Laurent"){
            int ep1 = 0;
            for(; ep1 < ePetroleum.length; ep1++){
                if(ep1 == 0){
                    System.out.println(ePetroleum[ep1] + " is an Oryx");
                }
            }
        }

        if(samurai[1] == "Kenji the Crane"){
            String trout1 = troutString[0];

            // Pointers pointing to the beginning
            // and the end of the string
            int t3 = 0, t4 = trout1.length() - 1;

            String fish1 = "";

            // While there are characters to compare
            while(t3 < t4){

                // If there is a mismatch
                if(trout1.charAt(t3) != trout1.charAt(t4)){
                   fish1 = trout1 + " is not a palindrome.";

                    // Increment first pointer and decrement the other
                    t3++;
                    t4--;
                }
                else
                   fish1 = trout1 + " is a palindrome";
                    t3++;
                    t4--;
            }
            System.out.println(fish1);
        }

        if(hammerHead[4] == "Wibaux"){
            String cola = String.valueOf(hybridNo[7]);
            // converting integer to a string
            int sum = 0, product = 1, difference = 0, quotient = 1, remainder = 0;
            for(int h1 = 0; h1 < cola.length(); h1++){
                // iterating through each character of the string
                char currentChar = cola.charAt(h1);
                // gathering up each character 1 by 1
                String currentCharAsString = String.valueOf(currentChar);
                int h2 = Integer.parseInt(currentCharAsString);
                sum = sum + h2;
                difference = h2 - difference;
                product = product * h2;
                quotient = h2 / quotient;
                remainder = h2 % 10;
            }
            System.out.println(sum);
            System.out.println(product);
            System.out.println(difference);
            System.out.println(quotient);
            System.out.println(remainder);
        }

        System.out.println(hammerHead[2]);

        if(hammerHead[2] == "Geometry Man"){
            // function to reverse a number
            int h1 = hybridNo[6], reverse = 0;
            // assigning variable // incremental variable
            for(; h1 != 0; h1 = h1 / 10){

                int remainder = h1 % 10;

                reverse = reverse * 10 + remainder;
            }
            System.out.println(reverse);
        }

        if(samurai[7] == "Wushu Lizard" && hammerHead[0] == "Hammerhead"){
            for(int h1 = 0; h1 < hammerHead.length; h1++){
                String pickerel = hammerHead[h1] + " is in Pisces Go Fish 4.";
                pickerel = pickerel.replaceAll("\\s", "#@!*");
                System.out.println(pickerel);
            }
        }

        if(hammerHead[3] == "Harvey"){
            String trout1 = trout[1];

            int t3 = 0, t4 = trout1.length() - 1;
            // t3 is indexed at the first character of the string
            // t4 is indexed at the last character of the string
            String fish1 = "";
            // setting this to empty string so it can be called outside of while loop
            // where it will be used and redefined
            while(t3 < t4){
                // until the two variable meet at the same index and are equal
                if(trout1.charAt(t3) != trout1.charAt(t4)){
                    // if the two characters are at any point not equal...
                    // then the word is not a palindrome
                    fish1 = trout1 + " is not a palindrome.";

                    t3++;
                    // t3 increments forward to center of string
                    t4--;
                    // t4 increments backward to center of string
                }
                else
                    fish1 = trout1 + " is a palindrome";
                    t3++;
                    // t3 increments forward to center of string
                    t4--;
                    // t4 increments backward to center of string
            }
            System.out.println(fish1);
        }

        if(ePetroleum[0] != "Gilgamesh"){
            String trout1 = troutString[2];
            // assigning the string to be used

            int t3 = 0, t4 = trout1.length() - 1;
            // t3 indexed at beginning of string
            // t4 indexed at end of string

            String oryx = "";
            // instantiating variable here so that its scope can be outside of while loop

            while(t3 < t4){
                // while t3 is incrementing towards t4
                // while t4 is incrementing towards t3
                if(trout1.charAt(t3) != trout1.charAt(t4)){
                    // if t3 and t4 are any point have different values
                    oryx = trout1 + " is not a palindrome";

                    t3++;
                    // t3 moves forward to middle of string
                    t4--;
                    // t4 moves backward to middle of string
                }
                else
                    oryx = trout1 + " is a palindrome.";
                    t3++;
                    // t3 moves forward to middle of string
                    t4--;
                    // t4 moves back toward middle of string
            }
            System.out.println(oryx);
        }

        if(bigHornCrew[0] == "Ace"){
            for(int bh1 = 0; bh1 < bigHornCrew.length; bh1++){
                System.out.println("Hi, " + bigHornCrew[bh1] + ", isn't it a great day on the Bighorn!");
            }
        }

        if(bigHornCrew[1] == "Columbus"){
            StringBuilder columbus = new StringBuilder();
            columbus.append(bigHornCrew[1] + " is going to Nebraska for the Great Crane Migration.");
            columbus = columbus.reverse();
            System.out.println(columbus);
            columbus = columbus.reverse();
            System.out.println(columbus);
        }

        if(bigHornCrew[4] == "Axel"){
            int h1 = hybridNo[5], reverse = 0;
            // assigning integer to variable // incremental variable
            for(; h1 != 0; h1 = h1 / 10){
                int remainder = h1 % 10;
                reverse = reverse * 10 + remainder;
            }
            System.out.println(reverse);
        }

        if(robots[1] == "Warren-21"){
            int r1 = 0;
            for(; r1 < treeNo.length; r1++){
                if(treeNo[r1] % Math.sqrt(treeNo[r1]) == 0){
                    System.out.println(treeNo[r1] + " has a whole number square root.");
                }
                else
                    System.out.println(treeNo[r1] + " does not have a whole number square root.");
            }
        }

        if(robots[2] == "Mellon-Tech"){
            int r1 = 0;
            while(r1 < robots.length){
                System.out.println(r1 + " " + robots[r1]);
                r1++;
            }
        }

        if (bigHornCrew[0] == "Ace"){
            String river = String.valueOf(troutNo[2]);
            int product = 1;
            // incremental variable
            for(int bh1 = 0; bh1 < river.length(); bh1++){
                // iterating through each character of the string
                char currentChar = river.charAt(bh1);
                // gathering each character one at a time
                String currentCharAsString = String.valueOf(currentChar);
                // converting the characters back into string characters
                product = product * Integer.parseInt(currentCharAsString);
            }
            System.out.println(product);
        }

        if(bigHornCrew[4] == "Axel"){
            String bigHorn = String.valueOf(troutNo[3]);
            int product = 1;
            int bh1 = 0;
            while(bh1 < bigHorn.length()){
                char currentChar = bigHorn.charAt(bh1);
                String currentCharAsString = String.valueOf(currentChar);
                product = product * Integer.parseInt(currentCharAsString);
                bh1++;
            }
            System.out.println(product);
        }
        // finding product of a numbers digits with a while loop

        System.out.println(troutNo.length);

        if(bigHornCrew.length != 9){
            String bigHorn = String.valueOf(troutNo[1]);
            int product = 1;
            int bh1 = 0;
            do{
                char currentChar = bigHorn.charAt(bh1);
                String currentCharAsString = String.valueOf(currentChar);
                product = product * Integer.parseInt(currentCharAsString);
                bh1++;
            }while(bh1 < bigHorn.length());
            System.out.println(product);
        }
        // finding product of number's digits with a do while loop

        System.out.println(samurai[6]);

        if(samurai[6] == "The Wraith"){
            String wraith = bigHornCrew[0];
            String bovine1 = "";

            int bov1 = 0;
            int bov2 = wraith.length() - 1;

            while(bov1 < bov2){
                if(wraith.charAt(bov1) != wraith.charAt(bov2)){
                    bovine1 = wraith + " is not a palindrome";
                    bov1++;
                    bov2--;
                }
                else
                    bovine1 = wraith + " is not a palindrome";
                    bov1++;
                    bov2--;
            }
            System.out.println(bovine1);
        }
        // function will output "Ace is not a palindrome

        if(robots[3] == "Eggplant-Head" && hammerHead[5] == "The Cosmic Trout"){
            String ace = "";

            for(int a1 = 0; a1 < troutString.length; a1++){
                String trout2 = troutString[a1];
                int t2 = 0;
                int t3 = trout2.length() - 1;

                for(; t2 < t3; t2++, t3--){
                    if (trout2.charAt(t2) != trout2.charAt(t3)){
                        ace = trout2 + " is not a palindrome.";


                    }
                    else
                        ace = trout2 + " is a palindrome.";


                }
                System.out.println(ace);

            }

        }
        // now it actually works, remember when comparing the two spots on the string that we need .charAt() method
        // appended to the string variable name. before the variables were just being used. Since 0 is obviously
        // not equal to the index spot of the last spot of the string, then even strings that are palindromes
        // would not evaluate to palindromes since the string itself wasn't actually being tested
        // scratch that, dachshund is evaluating to a palindrome, it appear that the algorithm is only evaluating the
        // first and last letter of the string

        if(bigHornCrew[0] == "Ace"){
            String mallard = "";
            for(int bh1 = 0; bh1 < troutString.length; bh1++){
                String crane = troutString[bh1];
                int bh2 = 0;
                // index for beginning of string
                int bh3 = crane.length() - 1;
                // index for end of string
                for(; bh2 < bh3; bh2++, bh3--){
                    if(crane.charAt(bh2++) != crane.charAt(bh3--)){
                        mallard = crane + " is not a palindrome";
                    }
                    else
                        mallard = crane + " is a palindrome";
                }
                System.out.println(mallard);
            }
            // for some reason dachshund is evaluating to a

        }

        if(dachshunds[4] == "Star"){
            String otter = "";
            for(int bh1 = 0; bh1 < troutString.length; bh1++){
                String mallard = troutString[bh1];
                int bh2 = 0;
                // bh2 will start at first index of string
                int bh3 = mallard.length() - 1;
                // bh3 will start at last index of string
                while(bh2 < bh3){
                    if(mallard.charAt(bh2++) != mallard.charAt(bh3--)){
                        otter = mallard + " is not a palindrome";
                        bh2++;
                        bh3--;
                    }
                    else
                        otter = mallard + " is a palinndrome";
                        bh2++;
                        bh3--;
                }
                System.out.println(otter);
            }
            // same problems here, dachshund is evaluating to a palindrome
            // fixed it!!!! needed to add ++ and -- in if statement
        }

        if(robots.length == 9 || robots[3] == "Eggplant-head"){
            String robo = "";
            for(int r1 = 0; r1 < troutString.length; r1++){
                String robo1 = troutString[r1];
                int r2 = 0;
                // r2 starts at first index of string
                int r3 = robo1.length() - 1;
                // r3 starts at last index of string
                for(; r2 < r3; r2++, r3--){
                    if(robo1.charAt(r2++) != robo1.charAt(r3--)){
                        // the ++ and the -- are the key to having the entire
                        // string tested. otherwise just the first and last character get tested
                        robo = robo1 + " is not a palindrome.";
                    }
                    else
                        robo = robo1 + " is a palindrome.";
                }
                System.out.println(robo);
            }
        }
        // this worked out, dachshund did not evaluate to a palindrome so we know the entire string,
        // not just the first and last character of the string

        if(bigHornCrew[0] == "Ace"){
            String blackLab = String.valueOf(hybridNo[7]);
            int sum = 0, product = 1;
            // incremental variables
            for(int bh1 = 0; bh1 < blackLab.length(); bh1++){
                // iterating through each character of the string
                char currentChar = blackLab.charAt(bh1);
                // gathering each character 1 by 1
                String currentCharAsString = String.valueOf(currentChar);
                // converting each character back to a string
                sum = sum + Integer.parseInt(currentCharAsString);
                product = product * Integer.parseInt(currentCharAsString);
            }
            System.out.println(sum);
            System.out.println(product);
        }

        if(hammerHead[0] == "Hammerhead"){
            StringBuilder cola = new StringBuilder();
            cola.append(hammerHead[0] + " has an awesome jacket!");
            cola = cola.reverse();
            System.out.println(cola);
            cola = cola.reverse();
            System.out.println(cola);
        }

        System.out.println(hammerHead[4]);

        if(hammerHead[4] == "Wibaux"){
            int h1 = 5;
            for(; h1 >= 0; h1--){
                String pickerel = hammerHead[h1];
                pickerel = pickerel.replaceAll("\\s", "%@%@%");
                System.out.println(pickerel);
            }
        }

        if(hammerHead[5] == "The Cosmic Trout"){
            int bh1 = hybridNo[6], reverse = 0;
            for(; bh1 != 0; bh1 = bh1 /10){
                int remainder = bh1 % 10;
                reverse = reverse * 10 + remainder;
            }
            System.out.println(reverse);
        }

        if(samurai[3] == "Glynis"){
            String merganser = "";
            for(int bh1 = 0; bh1 < troutString.length; bh1++){
                // iterating through every index of the troutString array
                String mallard1 = troutString[bh1];
                // mallard1 equals every string of the troutString array
                int duck1 = 0;
                // duck1 is the first index of the string
                int duck2 = mallard1.length() - 1;
                // duck2 is the last index of the string
                for(; duck1 < duck2; duck1++, duck2--){
                    // until the duck1 and duck2 meet in the middle...
                    // duck1 will increase
                    // and duck2 will decrease
                    if(mallard1.charAt(duck1++) != mallard1.charAt(duck2--)){
                        // important to put ++ and -- or else just the first and last character
                        // of the string will be tested, so a word like dachshund, which has d for the first
                        // and last characters of the word, will evaluate to a palindrome when
                        // the word is not a palindrome
                        merganser = mallard1 + " is not a palindrome.";
                    }
                    else
                        merganser = mallard1 + " is a palindrome.";
                }
                System.out.println(merganser);
            }

        }

        if(robots[2] == "Mellon-Tech"){
            String telecaster = String.valueOf(troutNo[2]);
            // converting integer to string
            int sum = 0, product = 1;
            // incremental variables
            for(int bh1 = 0; bh1 < telecaster.length(); bh1++){
                // iterating through each character of the converted string
                char currentChar = telecaster.charAt(bh1);
                // gathering each character one by one
                String currentCharAsString = String.valueOf(currentChar);
                // converting each character to string one by one
                sum = sum + Integer.parseInt(currentCharAsString);
                product = product * Integer.parseInt(currentCharAsString);
            }
            System.out.println(sum);
            System.out.println(product);
        }

        if(hammerHead[0] == "Hammerhead"){
            String pickerel = "";
            for(int hh1 = 0; hh1 < rams.length; hh1++){
                String ramHybrid = rams[hh1].toLowerCase();
                // had to use toLowerCase() method since the same letter in different cases
                // will not evaluate as same letter in program
                int ram1 = 0;
                // first index of string
                int ram2 = ramHybrid.length() - 1;
                // last index of string
                for(; ram1 < ram2; ram1++, ram2--){
                    if(ramHybrid.charAt(ram1++) != ramHybrid.charAt(ram2--)){
                        pickerel = ramHybrid + " is not a palindrome.";
                    }
                    else
                        pickerel = ramHybrid + " is a palindrome";
                }
                System.out.println(pickerel);
            }
        }

        if(samurai[7] == "Wushu Lizard"){
            int lws1 = hammerHead[0].length();
            // lws1 equals the amount of characters in "Hammerhead"
            System.out.println(lws1);
        }

        if(dachshunds[2] == "Bodhi"){
            int d1;

            // initialize maximum element
            int max = troutNo[0];
            // setting first element in the array as the max
            // since it will be the first element iterated through
            for(d1 = 0; d1 < troutNo.length; d1++){
                if(troutNo[d1] > max){
                    max = troutNo[d1];
                }
            }
            System.out.println(max);
        }

        if(hammerHead[4] == "Wibaux"){
            String maxName = "";
            int max = pisces[0].length();
            // setting first element in the array as the max
            // since it will be the first element iterated through
            for(int h1 = 0; h1 < pisces.length; h1++){
                if(pisces[h1].length() > max){
                   max = pisces[h1].length();
                   maxName = pisces[h1];
                }

            }
            System.out.println(maxName + " has " + max + " letters in his name.");
            // this works!!! will output name of pisces character and the amount of letters in their name
        }

        if(hammerHead[5] == "The Cosmic Trout"){
            String minName = "";
            int min = hammerHead[0].length();
            // setting first element in the array as the minimum element
            // since it will be the first element iterated through
            for(int h1 = 0; h1 < hammerHead.length; h1++){
                if(hammerHead[h1].length() <= min){
                    min = hammerHead[h1].length();
                    minName = hammerHead[h1];
                }
            }
            System.out.println(minName + " has " + min + " characters in their name.");
            // printed "Taylor has 6 characters in their name
            // Harvey could have also been printed but Taylor came first
            // Same deal with Wibaux
            // if we use <= instead of <, the last element matching the condition in the array will
            // print to console instead of the first
        }

        if(samurai[2] == "Laramie"){
            String robot = samurai[2] + " is a super fun guy!";
            robot = robot.replaceAll("\\s", "*");
            System.out.println(robot);
            // console prints "Laramie*is*a*super*fun*guy!
        }

        if(samurai[3] == "Glynis"){
            StringBuilder glynis = new StringBuilder();
            glynis.append(samurai[3] + " is a green dog from the far reaches of space!");
            System.out.println(glynis);
            glynis = glynis.reverse();
            System.out.println(glynis);
        }

        System.out.println(samurai[3].length());
        System.out.println(samurai[3] + " " + samurai[3].length());

        if(dachshunds[0] == "Beezer" && dachshunds[1] == "Chipper"){
            int max = Integer.parseInt(hybridString[0]);
            // converting the first elements of the String array to an integer
            // since we will iterate through each array element to find the greatest number
            // we will set the max to the first array element
            for(int bh1 = 0; bh1 < hybridString.length; bh1++){
                if(Integer.parseInt(hybridString[bh1]) > max){
                    max = Integer.parseInt(hybridString[bh1]);
                }
            }
            System.out.println(max);
        }

        System.out.println(hybridString.length);

        if(samurai[0] == "Lone Wolf Samurai"){
            double sum = 0;
            // incremental variable
            double avg = 0;
            for(int bh1 = 0; bh1 < hybridString.length; bh1++){
                int currentInt = Integer.parseInt(hybridString[bh1]);
                // convert each string to an integer 1 by 1
                sum = sum + currentInt;
                avg = sum / hybridString.length;
                // mean is sum of all the digits divided by the length of the array
            }
            System.out.println(avg);
        }
        // This works!!!
        System.out.println(hybridString[1]);
        System.out.println(Integer.parseInt(hybridString[1]));

        if(samurai[2] == "Laramie"){
            int bh1 = Integer.parseInt(hybridString[1]), reverse = 0;
            // converting string to integer             // incremental variable
            for(; bh1 != 0; bh1 = bh1 / 10){
                int remainder = bh1 % 10;
                reverse = reverse * 10 + remainder;
            }
            System.out.println(reverse);
        }

        if(samurai[3] == "Glynis"){
            String telecaster = String.valueOf(hybridNo[3]);
            // converting Integer to String
            int product = 1;
            // incremental variable
            for(int bh1 = 0; bh1 < telecaster.length(); bh1++){
                // iterating through each character of the string
                char currentChar = telecaster.charAt(bh1);
                // gathering each character 1 by 1
                String currentCharAsString = String.valueOf(currentChar);
                // converting each character back to a string
                product = product * Integer.parseInt(currentCharAsString);
            }
            System.out.println(product);
        }
        System.out.println(hybridNo[3]);
        System.out.println(hammerHead[3]);

        if(hammerHead[3] == "Harvey"){
            String hardin = "";
            for(int bh1 = 0; bh1 < hybridString.length; bh1++){
                String stX = hybridString[bh1];
                // gathering up all the string elements in this variable
                int river = 0;
                // first index of string
                int landing = stX.length() - 1;
                // last index of string
                for(; river < landing; river++, landing--){
                    // while river is less than landing on the string index...
                    // river increases by one and landing decreases by one
                    if(stX.charAt(river++) != stX.charAt(landing--)){
                        // stX.charAt(river++) starts at beginning of string and moves forward by 1
                        // stX.charAt(landing--) starts at of string and moves backward by 1
                        hardin = stX + " is not a palindrome";
                    }
                    else
                        hardin = stX + " is a palindrome";
                }
                System.out.println(hardin);
            }

        }

        if(hammerHead[2] == "Geometry Man"){
            for(int hh1 = 0; hh1 < hammerHead.length; hh1++){
                System.out.println(hammerHead[hh1] + " is from the far far reaches of space.");
            }
        }

        if(hammerHead[0] == "Hammerhead"){
            for(int hh1 = 0; hh1 < hammerHead.length; hh1++){
                if (hh1 == 3 || hh1 == 4){
                    System.out.println(hammerHead[hh1] + " is from Hardin-37.");
                }
                else if(hh1 == 0 || hh1 == 1){
                    System.out.println(hammerHead[hh1] + " are delivering Pickerel Cola to the far reaches of space.");
                }
                else
                    System.out.println(hammerHead[hh1] + " is a Cosmic Entity.");
            }
        }

        if(samurai[7] == "Wushu Lizard"){
            String laramie = samurai[2] + " is a super happy guy.";
            System.out.println(laramie);
            laramie = laramie.replaceAll("\\s", "##");
            System.out.println(laramie);
        }

        if(ePetroleum[1] == "Laurent"){
            String laurent = ePetroleum[1] + " is Thierry's best friend.";
            System.out.println(laurent);
            StringBuilder laurent1 = new StringBuilder();
            laurent1.append(laurent);
            laurent1 = laurent1.reverse();
            System.out.println(laurent1);
        }

        if(ePetroleum[2] == "Antoine"){
            String oryx = "";
            for(int bh1 = 0; bh1 < samurai.length; bh1++){
                String kenji = samurai[bh1];
                // kenji equals all the strings of the samurai array
                int zeno = 0;
                // first index of string
                int samos = kenji.length() - 1;
                // last index of string
                for(; zeno < samos; zeno++, samos--){
                    // for loop runs until zeno and samos will meet at the same index
                    if(kenji.charAt(zeno++) != kenji.charAt(samos--)){
                        // if the two indexes are not the same letter at any point
                        // the string will evaluate to not a palindrome
                      oryx = kenji + " is not a palindrome";
                    }
                    else
                        oryx = kenji + " is a palindrome";
                }
                System.out.println(oryx);
            }

        }

        System.out.println(ePetroleum[4]);

        if(ePetroleum[4] == "Gilgamesh"){
            int max = ePetroleum[0].length();
            String maxName = "";
            for(int ep1 = 0; ep1 < ePetroleum.length; ep1++){
                if(ePetroleum[ep1].length() > max){
                    max = ePetroleum[ep1].length();
                    maxName = ePetroleum[ep1];
                }
            }
            System.out.println(maxName + " has " + max + " characters in his name");
        }

        if(samurai[3] == "Glynis"){
            String yokohama = hybridString[1];
            int product = 1;
            // incremental variable
            for(int bh1 = 0; bh1 < yokohama.length(); bh1++){
                // iterating through each character of the string
                char currentChar = yokohama.charAt(bh1);
                // gathering up the characters 1 by 1
                String currentCharAsString = String.valueOf(currentChar);
                // converting character to a string 1 by 1
                product = product * Integer.parseInt(currentCharAsString);
            }
            System.out.println(product);
        }

        System.out.println(samurai[1].charAt(0));
        // will return K

        if(bigHornCrew[0] == "Ace"){
            String ace = bigHornCrew[0] + " rules the Bighorn!";
            System.out.println(ace);
            StringBuilder bigHorn = new StringBuilder();
            bigHorn.append(ace);
            bigHorn = bigHorn.reverse();
            System.out.println(bigHorn);
        }

        System.out.println(ePetroleum[3]);
        // Hunzuu!!!

        if(ePetroleum[3] == "Hunzuu"){
            String hunzuu = ePetroleum[3] + " is a snake with a robo-suit";
            System.out.println(hunzuu);
            hunzuu = hunzuu.replaceAll("\\s", "!!");
            System.out.println(hunzuu);
            StringBuilder snake = new StringBuilder();
            snake = snake.append(hunzuu + ". He works for Gilgamesh.");
            System.out.println(snake);
        }

        if(dachshunds[2] == "Bodhi"){
            String dachshund = String.valueOf(hybridNo[5]);
            int product = 1;
            for(int d1 = 0; d1 < dachshund.length(); d1++){
                char currentChar = dachshund.charAt(d1);
                String currentCharAsString = String.valueOf(currentChar);
                product = product * Integer.parseInt(currentCharAsString);

            }
            System.out.println(product);
        }
        System.out.println(hybridNo[5]);

        if(samurai[2] == "Laramie"){
            int crane = treeNo[2], reverse = 0;
                                  // incremental variable
            for(; crane != 0; crane = crane / 10){
                int remainder = crane % 10;
                reverse = reverse * 10 + remainder;
            }
            System.out.println(reverse);
        }

        if(trees[0] == "Cornelius"  && trout[1] == "Brown"){
            int tree = trees.length - 1;
            while(tree >= 0){
                System.out.println(trees[tree]);
                tree--;
            }
            System.out.println(tree);
        }

        if(trees[2] == "Owen"){
            String owen = trees[2];
            int t2 = 3;
            do{
                System.out.println(owen.charAt(t2));
                t2--;
            }while(t2 >= 0);
        }

        if(trees[1] == "Magnus"){
            String cornelius = trees[0];
            int t2 = trees[0].length() - 1;
            do{
                System.out.println(cornelius.charAt(t2));
                t2--;
            }while(t2 >= 0);
        }

        if(trees[4] == "Jasper"){
            String jasper = trees[4];
            int t2 = 0;
            do{
                System.out.println(jasper.charAt(t2));
                t2++;
            }while(t2 < jasper.length());
        }

        if(hammerHead[0] == "Hammerhead"){
            String hammer = hammerHead[0];
            int hh1 = 0;
            while(hh1 < hammer.length()){
                System.out.println(hammer.charAt(hh1));
                hh1++;
            }
        }

        if(dachshunds[0] == "Beezer"){
            String Beezer = dachshunds[0];
            for(int d1 = 0; d1 < Beezer.length(); d1++){
                System.out.println(Beezer.charAt(d1));
            }
        }

        if(dachshunds[1] == "Chipper"){
            String dachshundName = "";
            int max = dachshunds[0].length();
            // when testing for max or min, always start with first element that will be iterated
            for(int d1 = 0; d1 < dachshunds.length; d1++){
                if (dachshunds[d1].length() > max){
                    max = dachshunds[d1].length();
                    dachshundName = dachshunds[d1];

                }

            }
            System.out.println(dachshundName + " has " + max + " letters in his name.");
            // prints to console "Chipper has 7 letters in his name."
        }

        if(hammerHead[0] == "Hammerhead"){
            int hh1 = hybridNo[4], reverse = 0;
            // declaring variable name // incremental variable
            for(; hh1 != 0; hh1 = hh1 / 10){
                int remainder = hh1 % 10;
                reverse = reverse * 10 + remainder;
            }
            System.out.println(reverse);
        }

        if(bigHornCrew[4] == "Axel"){
            String otter = bigHornCrew[4] + " is an awesome otter who lives on the Bighorn!";
            System.out.println(otter);
            StringBuilder axel = new StringBuilder();
            axel.append(otter);
            axel = axel.reverse();
            System.out.println(axel);
        }

        if(bigHornCrew.length == 5){
            String crane = bigHornCrew[1] + " is a Sandhill Crane.";
            String red = samurai[1] + " is a Red Crowned Crane.";
            crane = crane.concat(red);
            crane = crane.replaceAll("\\s", "!!!");
            System.out.println(crane);
        }

        if(hammerHead[4].length() == 6){
            System.out.println(hammerHead[4]);
        }

        System.out.println(bigHornCrew[2]);

        if(bigHornCrew[2].length() == bigHornCrew[3].length()){
            if(bigHornCrew[2].charAt(1) == bigHornCrew[3].charAt(1)){
                String mallard = bigHornCrew[2] + " and " + bigHornCrew[3] + " both have a as the second letter in their name.";
                System.out.println(mallard);
            }
        }

        if(samurai[7] == "Wushu Lizard" && robots[0] == "Hank-44"){
            int max = robots[0].length();
           //
            for(int r1 = 0; r1 < robots.length; r1++){
                if(robots[r1].length() > max){
                    max = robots[r1].length();
                }
                System.out.println(max);
            }

        }

        System.out.println(Math.sqrt(81));

        if(bigHornCrew[0].length() == 3){
            // testing for palindrome algorithm
            String mallardsLanding = "";
            for(int bh1 = 0; bh1 < bigHornCrew.length; bh1++){
                String bigHorn = bigHornCrew[bh1];
                // bigHorn equals each string of the bigHornCrew array
                int bh2 = 0;
                // bh2 is the first index of the string
                int bh3 = bigHorn.length() - 1;
                // bh3 is the last index of the string
                for(; bh2 < bh3; bh2++, bh3--){
                    // bh2 increments by 1 and bh3 increments by -1 before they meet in the middle of the string
                    if(bigHorn.charAt(bh2++) != bigHorn.charAt(bh3--)){
                        // if statement will evaluate two indexes as they make their way towards the center of the string
                        System.out.println(bigHorn + " is not a palindrome.");
                    }
                    else
                        System.out.println(bigHorn + " is a palindrome.");
                }
            }
        }

        if(ePetroleum[0].length() == 7){
            String fuel = "";
            // incremental variable
            int ep1 = 0;
            for(; ep1 < ePetroleum.length; ep1++){
                String fuel1 = ePetroleum[ep1];
                for(int ep2 = 0; ep2 < fuel1.length(); ep2++){
                    if(ep2 == 1){
                        System.out.println(fuel1.charAt(ep2));
                        char currentChar = fuel1.charAt(ep2);
                        String oil = String.valueOf(currentChar);
                        // takes in characters 1 by 1
                        fuel = fuel + oil;

                    }
                }
            }
            System.out.println(fuel);
        }
        // outputs the second letter in each name
        // also adds those characters together to make a single string

        if(rams[3] == "Stacey"){
            int r1 = 0;
            for(; r1 < rams.length; r1++){
                String ram = rams[r1] + " is an awesome Ram Hybrid.";
                ram = ram.replaceAll("\\s", "!!!");
                System.out.println(ram);
                StringBuilder hybrid = new StringBuilder();
                hybrid = hybrid.append(ram);
                hybrid = hybrid.reverse();
                System.out.println(hybrid);
            }
        }

        if(robots[2] == "Mellon-Tech"){
            String robo = "";
            String roboStringSum = "";
            // incremental String variable
            for(int r1 = 0; r1 < robots.length; r1++){
                // iterating through each element of robots array
                String chappie = robots[r1];
                // chappie is equal to all strings of the array
                for(int r2 = 0; r2 < chappie.length(); r2++){
                    // iterating through each string's characters of the robots array
                    if(r2 == 0){
                        // if r2 is the first index of a given string
                        char currentChar = chappie.charAt(r2);
                        // gathering each character at the 0 index one at a time
                        String cyber_tech = String.valueOf(currentChar);
                        // converting each of those characters to strings 1 by 1
                        roboStringSum = roboStringSum + cyber_tech;
                        // adding those strings together, essentially concatenation
                        System.out.println(cyber_tech);

                    }

                }
            }
            System.out.println(roboStringSum);
        }

        System.out.println(ePetroleum[4]);

        if(ePetroleum.length == 5){
            String fuel = "";
            for(int r1 = 0; r1 < robots.length; r1++){
                String petroleum = robots[r1];
                // petroleum represents every string of the array
                int r2 = 0;
                // first index of string
                int r3 = petroleum.length() -1;
                // last index of string
                for(; r2 < r3; r2++, r3--){
                    if (petroleum.charAt(r2++) != petroleum.charAt(r3--)){
                        fuel = petroleum + " is not a palindrome.";
                    }
                    else
                        fuel = petroleum + " is a palindrome.";
                }
                System.out.println(fuel);
            }

        }

        if(robots[3] == "Eggplant-Head"){
            String robot = String.valueOf(hybridNo[3]);
            int product = 1;
            for(int r1 = 0; r1 < robot.length(); r1++){
                // iterating through each character of string robot
                char currentChar = robot.charAt(r1);
                // gathering up each character 1 at a time
                String currentCharAsString = String.valueOf(currentChar);
                product = product * Integer.parseInt(currentCharAsString);
            }
            System.out.println(product);
        }

        }
    }


