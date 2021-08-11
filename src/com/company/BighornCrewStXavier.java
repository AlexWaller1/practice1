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



    }
}
