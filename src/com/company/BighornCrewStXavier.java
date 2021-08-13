package com.company;
import javax.swing.*;
import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.Arrays;
import java.util.Locale;

public class BighornCrewStXavier {

    private int x_37;

    public static void main(String[] args) {


        practice123 practiceObject = new practice123();
        // can implement a function from another class by doing this
        HybridReverseInteger hybridInteger = new HybridReverseInteger();
        // can implement a function from another class by doing this
        WushuLizardStringBuilder blueTape = new WushuLizardStringBuilder();
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
        String[] robotString = {"1", "2", "3", "4", "5"};
        ArrayList<String> badgerHounds = new ArrayList<String>();
        badgerHounds.add("Anubis");
        badgerHounds.add("The Miner");
        badgerHounds.add("Gawain");
        badgerHounds.add("The Element");
        badgerHounds.add("M'arcuzz M'orzz");

        int result = practiceObject.addDigits(hybridNo[7]);
        System.out.println(result);
        System.out.println("A" + "B");

        if(hammerHead[0] == "Hammerhead"){
            for(int d1 = 0; d1 < dachshunds.length; d1++){
                String dachshund = dachshunds[d1] + " is an amazing dachshund!!!";
                System.out.println(dachshund);
                dachshund = dachshund.replaceAll("\\s", "______");
                System.out.println(dachshund);
                StringBuilder appleHill = new StringBuilder();
                appleHill.append(dachshund);
                appleHill = appleHill.reverse();
                System.out.println(appleHill);
            }
        }

        if(rams[3] == "Stacey"){
            String ramHybrid = "";
            for(int ram1 = 0; ram1 < rams.length; ram1++){
                String ram2 = rams[ram1].toLowerCase();
                // ram2 is equal to every ram hybrid of the rams array
                int ram3 = 0;
                // first index of string
                int ram4 = ram2.length() - 1;
                // last index of string
                for(; ram3 < ram4; ram3++, ram4--){
                    if(ram2.charAt(ram3++) != ram2.charAt(ram4--)){
                        ramHybrid = ram2 + " is not a palindrome.";
                    }
                    else
                        ramHybrid = ram2 + " is a palindrome.";
                }
                System.out.println(ramHybrid);
            }
        }

        if(dachshunds[2] == "Bodhi"){
            int hybridTest = 3745, reverse = 0;
            // integer             // incremental variable
            for(; hybridTest != 0; hybridTest = hybridTest / 10){
                int remainder = hybridTest % 10;
                reverse = reverse * 10 + remainder;
            }
            System.out.println(reverse);
        }

        if(bigHornCrew[0] == "Ace"){
            String incubator = String.valueOf(hybridNo[5]);
            int product = 1;
            for(int bh1 = 0; bh1 < incubator.length(); bh1++){
                // iterating through every character of the string
                char currentChar = incubator.charAt(bh1);
                // gathering up each character 1 by 1
                String currentCharAsString = String.valueOf(currentChar);
                // converting characters back to string characters 1 by 1
                product = product * Integer.parseInt(currentCharAsString);

            }
            System.out.println(product);
        }

        System.out.println(hammerHead.length);

        if (hammerHead[2] == "Geometry Man"){
            int hh1 = 5;
            while(hh1 >= 0){
                System.out.println(hammerHead[hh1] + " is the star of Pisces Go Fish 4!!!");
                hh1--;
            }
        }

        if(hammerHead[4] == "Wibaux"){
            int whiteFish = 0;
            do{
                int goldEye = hybridNo[whiteFish] + 37;
                System.out.println(goldEye);
                whiteFish++;
            }while(whiteFish < hybridNo.length);
        }

        if(hammerHead[3] == "Harvey"){
            int hh1 = 0;
            for(; hh1 < hammerHead.length; hh1++){
                if(hh1 == 1){
                    System.out.println(hammerHead[hh1] + " is a good luck albatross!");
                }
            }
        }

        if(ePetroleum[4] == "Gilgamesh"){
            String gilgamesh = "";
            for(int ep1 = 0; ep1 < ePetroleum.length; ep1++){
                String hunzuu = ePetroleum[ep1];
                for(int ep2 = 0; ep2 < hunzuu.length(); ep2++){
                    if(ep2 == 0){
                        System.out.println(hunzuu.charAt(ep2));

                    }
                }
            }
        }

        if(ePetroleum[3] == "Hunzuu"){
            String antoine = "";
            for(int ep1 = 0; ep1 < ePetroleum.length; ep1++){
                char currentChar = ePetroleum[ep1].charAt(0);
                System.out.println(currentChar);
                antoine = antoine + currentChar;
            }
            System.out.println(antoine);
        }

        if(hammerHead[0] == "Hammerhead"){
            int hh1 = 414, hh2 = 414, reverse = 0;
            // assigning integers     // incremental variable
            for(; hh2 != 0; hh2 = hh2 / 10){
                int remainder = hh2 % 10;
                reverse = reverse * 10 + remainder;
            }
            System.out.println(reverse);
            if(reverse == hh1){
                System.out.println(reverse + " is a palindrome");
            }
            else
                System.out.println(reverse + " is not a palindrome.");

        }

        if(bigHornCrew[0] == "Ace"){
            int bh1 = 37;
            int sum = 0;
            // incremental variable
            while(bh1 > 0){
                sum = sum + bh1 % 10;
                bh1 = bh1 / 10;
            }
            System.out.println(sum);
        }

        System.out.println(bigHornCrew[4]);
        // Axel!!!!! The Man!!!!!
        if(bigHornCrew[4] == "Axel"){
            int bh2 = hybridNo[9];
            int bh1 = hybridNo[9];
            int sum = 0;
            // incremental variable
            for(; bh1 > 0; bh1 = bh1 / 10){
                sum = sum + bh1 % 10;
            }
            System.out.println(bh2);
            System.out.println(sum);
        }

        if(bigHornCrew[1] == "Columbus"){
            int bh2 = hybridNo[7];
            int bh1 = hybridNo[7], sum = 0;
                                   // incremental variable
            for(; bh1 > 0; bh1 = bh1 / 10){
                sum = sum + bh1 % 10;
            }
            System.out.println(bh2);
            if(bh2 == sum){
                System.out.println(sum + " is a palindrome.");
            }
            else
                System.out.println(sum + " is not a palindrome.");
        }

        if(samurai[6] == "The Wraith"){
            int wraith1 = 3773;
            int wraith2 = wraith1, product = 1;
            for(; wraith2 != 0; wraith2 = wraith2 / 10){
                // keep in mind that wraith = wraith / 10 occurs after loop executes
                // so the first time through the iteration the number is 3773
                // after we go through the code, then 3773 will be divided by 10
                // and the result will be 377
                // then 377 will through as the second iteration of the loop
                product = product * (wraith2 % 10);
                // 3773 % 10 = 3
                // 377 % 10 = 7
                // 37 % 10 = 7
                // 3 % 10 = 3

            }
            System.out.println("wraith1 == " + wraith1);
            // 3773
            System.out.println("wraith2 == " + wraith2);
            // 0
            System.out.println("product of integers == " + product);
            // 441
        }

        System.out.println(3 % 10);
        // 3

        if(samurai[2] == "Laramie"){
            int laramie = hybridNo[3];
            // 23
            int reverse = 0;
            int remainder = 0;
            for(; laramie > 0; laramie = laramie / 10){
                // first iteration laramie is 23
                // after going through loop, laramie is divided by 10
                // and laramie is now 2
                remainder = laramie % 10;
                // 23 % 10 == 3
                // 2 % 10 == 2
                reverse = reverse * 10 + remainder;
                // 0 * 10 + 3 == 3
                // reverse is now 3
                // 3 * 10 + 2 == 32
                // reverse is 32 and laramie is now 0, ending the loop
            }
            System.out.println(hybridNo[3]);
            System.out.println(reverse);
        }

        if(robots[1] == "Warren-21"){
            int spahn = 2017;
            int sum = 0;
            for(; spahn > 0; spahn = spahn / 10){
                sum = sum + spahn % 10;
            }
            System.out.println(sum);
        }

        if(robots[2] == "Mellon-Tech"){
            int mellon_tech = 31;
            int product = 1;
            for(; mellon_tech > 0; mellon_tech = mellon_tech / 10){
                product = product * (mellon_tech % 10);
            }
            System.out.println(product);
        }

        System.out.println(robotNo);
        System.out.println(rams);

        if(samurai[0] == "Lone Wolf Samurai"){
            for(int lws1 = 0; lws1 < treeNo.length; lws1++){
                if (treeNo[lws1] % Math.sqrt(treeNo[lws1]) == 0){
                    System.out.println(treeNo[lws1] + " has a whole number square root.");
                }
                else
                    System.out.println(treeNo[lws1] + " does not have a whole number square root.");
            }
        }

        if(samurai[1] == "Kenji the Crane"){
            int sum = 0;
            for(int ktc1 = 0; ktc1 < hybridNo.length; ktc1++){
                int crane37 = hybridNo[ktc1];
                for(; crane37 > 0; crane37 = crane37 / 10){
                    sum = sum + (crane37 % 10);
                }
                System.out.println(sum);
            }
        }
        // still adding all integers of array, not stopping with just an element

        if(robots[3] == "Eggplant-Head"){
            String eggPlantHead = robots[3] + " is an maven on the telecaster";
            eggPlantHead = eggPlantHead.replaceAll("\\s", "::::");
            System.out.println(eggPlantHead);
            StringBuilder robo_eggPlant = new StringBuilder();
            robo_eggPlant.append(eggPlantHead);
            robo_eggPlant = robo_eggPlant.reverse();
            System.out.println(robo_eggPlant);
        }

        if(bigHornCrew[2] == "Marek"){
            int billings = 406;
            int sum = 0;
            for(; billings > 0; billings = billings / 10){
                sum = sum + billings % 10;
            }
            System.out.println(sum);
        }

        if(bigHornCrew[3] == "Radek"){
            String merganser = "";
            for(int bh1 = 0; bh1 < bigHornCrew.length; bh1++){
                String mallard = bigHornCrew[bh1].toLowerCase();
                // all strings elements of bigHornCrew
                int mallard1 = 0;
                // first index of string
                int mallard2 = mallard.length() - 1;
                // last index of string
                for(; mallard1 < mallard2; mallard1++, mallard2--){
                    if(mallard.charAt(mallard1++) != mallard.charAt(mallard2--)){
                        merganser = mallard + " is not a palindrome";
                    }
                    else
                        merganser = mallard + " is a palindrome";
                }
                System.out.println(merganser);
            }
        }

        if(ePetroleum[1] == "Laurent"){
            String laurent = ePetroleum[1];
            for(int clichy1= 0; clichy1 < laurent.length(); clichy1++){
                System.out.println(laurent.charAt(clichy1));
            }
        }

        if(bigHornCrew[4] == "Axel"){
            for(int ep1 = 0; ep1 < ePetroleum.length; ep1++){
                String antoine = ePetroleum[ep1];
                for (int ep2 = 0; ep2 < antoine.length(); ep2++){
                    System.out.println(antoine.charAt(ep2));
                }
            }
        }

        if(rams[2] == "Jay"){
            int ramHybrid = 0;
            for(int r1 = 0; r1 < hybridNo.length; r1++){
                for(int r2 = 0; r2 < treeNo.length; r2++){
                    ramHybrid = r1 + r2;

                }
                System.out.println(ramHybrid);
            }
        }

        if(ePetroleum[4] == "Gilgamesh"){
            long charCount = 0;
            String petroleum = "";
            for(int ep1 = 0; ep1 < ePetroleum.length; ep1++){
                charCount = ePetroleum[ep1].chars().count();
                petroleum = ePetroleum[ep1];
                System.out.println(petroleum + " has " + charCount + " letters.");
            }

        }

        if(samurai[1] == "Kenji the Crane"){
            int kenji = 3754;
            int reverse = 0, remainder = 0;
            for(; kenji > 0; kenji = kenji / 10){
                remainder = kenji % 10;
                // 3754 % 10 = 4
                // 375 % 10 = 5
                // 37 % 10 = 7
                // 3 % 10 = 3
                reverse = reverse * 10 + remainder;
                // 0 * 10 + 4 = 4
                // 4 * 10 + 5 = 45
                // 45 * 10 + 7 = 457
                // 457 * 10 + 3 = 4573
                // reverse = 4573
            }
            System.out.println(reverse);
        }

        if(samurai[3] == "Glynis"){
            for(int lws1 = 0; lws1 < samurai.length; lws1++){
                System.out.println(samurai[lws1].charAt(0));
            }
        }

        if(samurai[7] == "Wushu Lizard"){
            int lws1 = 567493;
            int reverse = 0, remainder = 0;
            for(; lws1 > 0; lws1 = lws1 / 10){
                // 567493
                // ***after first loop completes***
                // 567493 / 10 = 56749
                // 56749 / 10 = 5674
                // 5674 / 10 = 567
                // 567 / 10 = 56
                // 56 / 10 = 5
                remainder = lws1 % 10;
                // 567493 % 10 = 3
                // 56749 % 10 = 9
                // 5674 % 10 = 4
                // 567 % 10 = 7
                // 56 % 10 = 6
                // 5 % 10 = 5

                reverse = reverse * 10 + remainder;
                // 0 * 10 + 3
                // 3 * 10 + 9 = 39
                // 39 * 10 + 4 = 394
                // 394 * 10 + 7 = 3947
                // 3947 * 10 + 6 = 39476
                // 39476 * 10 + 5 = 394765
                // reverse = 394765
            }
            System.out.println(reverse);
            // reverse = 394765
        }

        System.out.println(37 / 10);

        System.out.println(0 / 10);

        if(bigHornCrew[0] == "Ace"){
            int max = bigHornCrew[0].length();
            String maxName = "";
            for(int bh1 = 0; bh1 < bigHornCrew.length; bh1++){
                if (bigHornCrew[bh1].length() > max){
                    max = bigHornCrew[bh1].length();
                    maxName = bigHornCrew[bh1];

                }

            }
            System.out.println(maxName + " " + max);
            // Columbus 8
        }

        if(bigHornCrew[1] == "Columbus"){
            int min = bigHornCrew[4].length();
            String minName = "";
            for(int bh1 = 0; bh1 >= 0; bh1--){
                if(bigHornCrew[bh1].length() < min){
                    min = bigHornCrew[bh1].length();
                    minName = bigHornCrew[bh1];
                }
            }
            System.out.println(minName + " " + min);
            System.out.println(minName);
        }
        // interesting stuff here, Ace is the proper output here since he has the fewest letters in his name
        // he's also at the 0 index of the bigHornCrewArray, for whatever reason, when we make him the starting
        // point of the iteration

        if(bigHornCrew[1] == "Columbus"){
            int min = bigHornCrew[0].length();
            String minName = "";
            for(int bh1 = 0; bh1 < bigHornCrew.length; bh1++) {
                if (bigHornCrew[bh1].length() <= min) {
                    min = bigHornCrew[bh1].length();
                    minName = bigHornCrew[bh1];
                }
            }

            System.out.println(minName + " " + min);
        }
        // this worked!!! output was "Ace 3"

        System.out.println(hammerHead[5]);

        if(hammerHead[5] == "The Cosmic Trout"){
            int[] hybridYears = {2000, 2004, 2008, 2012, 2016, 2020};
            for (int hybrid1 = 0; hybrid1 < hybridYears.length; hybrid1++){
                int ramYear = hybridYears[hybrid1];
                // all integers of hybridYears array
                if(ramYear % 4 == 0 && ramYear % 5 == 0){
                    System.out.println(ramYear);
                }
            }

        }

        if(bigHornCrew[2] == "Marek"){
            int bh1 = 37;
            int sum = 0;
            // incremental variable
            for(; bh1 > 0; bh1 = bh1 / 10){
                // 37
                // 37 / 10 == 3
                // 3
                sum = sum + (bh1 % 10);
                // 0 + (37 % 10) = 7
                // 7 + (3 % 10) = 10
                // sum is 10
            }
            System.out.println(sum);
        }

        if(samurai[6] == "The Wraith"){
            String wraith = "";
            for(int lsw1 = 0; lsw1 < samurai.length; lsw1++){
                String wraith1 = samurai[lsw1].toLowerCase();
                // all string elements of the samurai array
                int wraith2 = 0;
                // first index of string
                int wraith3 = wraith1.length() - 1;
                // last index of string
                for(; wraith2 < wraith3; wraith2++, wraith3--){
                    if (wraith1.charAt(wraith2++) != wraith1.charAt(wraith3--)){
                        wraith = wraith1 + " is not a palindrome.";
                    }
                    else
                        wraith = wraith1 + " is a palindrome.";
                }
                System.out.println(wraith);
            }
        }

        if(hammerHead[0] == "Hammerhead" && hammerHead[4] == "Wibaux"){
            String[] superCroc = {"Super Croc", "Frankenwurst"};
            System.out.println(superCroc.length);
            for(int sc1 = 0; sc1 < superCroc.length; sc1++){
                System.out.println(superCroc[sc1]);
            }
        }

        if(trees[1] == "Magnus"){
            int[] treeInts = {54, 45, 44, 37, 89, 81, 99, 36, 12};
            for(int tree1 = 0; tree1 < treeInts.length; tree1++){
                int tree2 = treeInts[tree1];
                if(tree2 % 6 == 0 && tree2 % 9 == 0){
                    System.out.println(tree2 + " FizzBuzz!");
                }
                else if(tree2 % 9 == 0){
                    System.out.println(tree2 + " Fizz!");
                }
                else if(tree2 % 6 == 0){
                    System.out.println(tree2 + " Buzz!");
                }
                else
                    System.out.println(tree2 + " No Fizz!");
            }

        }

        if(rams[1] == "Otto"){
            System.out.println(rams[2]);
            // Jay
            System.out.println(rams[2].charAt(rams[2].length() - 1));
            // y
        }

        if(robots[2] == "Mellon-Tech"){
            String mellon_tech = robots[2];
            mellon_tech = mellon_tech.replaceAll("-", "_");
            System.out.println(mellon_tech);
        }

       if(robots[3] == "Eggplant-Head"){
           String eggplant = robots[3];
           System.out.println(eggplant.toUpperCase());
           // EGGPLANT-HEAD
        //   System.out.printf("Eggplant-Head");
           // Eggplant-Head
       }

       if(samurai[7] == "Wushu Lizard"){
           // hybridInteger
           int hh1 = hybridInteger.reverseHybridInteger(37);
           int hh2 = hybridInteger.reverseHybridInteger(10945);
           System.out.println(hh1);
           // 73
           System.out.println(hh2);
           // 54901
       }

       if(hammerHead[0] == "Hammerhead"){
          // blueTape
           String lizard = blueTape.samuraiStringBuilder(samurai[7]);
           System.out.println(lizard);
       }







    }
}
