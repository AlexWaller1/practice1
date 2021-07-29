package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;

public class DachshundsAndHybridsAndRobots {

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
        String[] hybridString = {"37", "102", "2309", "1992"};


        int result = practiceObject.addDigits(hybridNo[7]);
        System.out.println(result);
        System.out.println("A" + "B");

        if (robots[0] == "Hank-44") {
            System.out.println(robots[0] + " is great on the Green Egg.");
        }

        if (dachshunds[0] == "Beezer" && dachshunds.length == 5) {
            System.out.println(dachshunds[2] + " ran up the Flume Trail!");
        }

        if (robots[2] == "Mellon-Tech") {
            for (int r1 = 0; r1 < robots.length; r1++) {
                System.out.println(robots[r1]);
                if (r1 == 2) {
                    int r2 = 3;
                    while (r2 >= 0) {
                        System.out.println(rams[r2]);
                        System.out.println(robots[r1] + " is great at repairing telecasters.");
                        System.out.println(dachshunds[r1] + " ran the whole Cooper-Kiln Trail!");
                        r2--;
                    }
                    // r1 inherited from parent for loop
                    // Eggplant-Head prints last since the nested while loop is hit on the the element before
                    // therefore the nested while loop completes before the for loop iterates through
                    // Eggplant-Head's spot on the array.
                }
            }
        }

        if (robots[1] == "Warren-21" || trout[0] == "Rainbow") {
            int t1 = 1;
            while (t1 >= 0) {
                System.out.println(trout[t1]);
                t1--;
            }
        }

        if (robots[0] == "Hank-44" || trout[1] == "Brown") {
            int t1 = 0;
            while (t1 <= 1) {
                System.out.println(trout[t1]);
                t1++;
            }
        }

        if (robots.length * trout.length == 8) {
            int d1 = 0;
            do {
                System.out.println(dachshunds[d1] + " is a great dachshund!!!");
                d1++;
            } while (d1 <= 4);
        }

        if (dachshunds.length == 5) {
            for (int d1 = 0; d1 < dachshunds.length; d1++) {
                System.out.println(dachshunds[d1] + " is a great dachshund!!!");
            }
        }

        if (dachshunds.length == 5) {
            int d1 = 0;
            while (d1 <= 4) {
                System.out.println(dachshunds[d1] + " is a great dachshund!!!");
                d1++;
            }
        }

        if (robots.length == 4 && trout.length == 2) {
            for (int r1 = 0; r1 < robots.length; r1++) {
                if (r1 == 0) {
                    System.out.println(robots[r1] + " grills an awesome Brisket!!!");
                    int d2 = 1;
                    while (d2 < 2) {
                        System.out.println(robots[d2] + " is a great curler.");
                        d2++;
                        int r3 = 2;
                        do {
                            System.out.println(robots[r3] + " can fix any telecaster.");
                            r3++;
                        } while (r3 < 3);
                        for (int r4 = 0; r4 < robots.length; r4++) {
                            if (r4 == 3) {
                                System.out.println(robots[r4] + " loves Pickerel Cola.");
                            }
                        }
                    }
                }
            }
        }

        System.out.println(trout[0]);

        if (dachshunds.length == 5 && trees.length == 5) {
            for (int d1 = 0; d1 < dachshunds.length; d1++) {
                if (d1 == 2) {
                    System.out.println(dachshunds[d1] + " wants to do something!!!!");
                }
            }
        }

        if (robots[2] == "Mellon-Tech" || trout.length * trees.length == 37) {
            for (int r1 = 0; r1 < robots.length; r1++) {
                if (r1 == 3) {
                    System.out.println(robots[r1] + " is not an Eggplant!?");
                }
            }
        }

        System.out.println(treeHybridNo);
        System.out.println(ramHybridNo);
        System.out.println(troutHybridNo);
        System.out.println(robotNo);
        System.out.println(dachshundNo);

        if (treeHybridNo > dachshundNo) {
            System.out.println(trees[0]);
        } else
            System.out.println("There are the same amount of trees and dachshunds!");

        System.out.println(dachshunds.length);
        System.out.println(dachshunds[0].chars().count());
        System.out.println(dachshunds[1].chars().count());

        if (dachshunds[0].chars().count() == 6) {
            for (int d1 = 0; d1 < dachshunds.length; d1++) {
                System.out.println(dachshunds[d1].chars().count());
            }
        }

        System.out.println(dachshunds[2].charAt(0));
        // charAt() finds location of string characters along string array
        // for example, if dachshunds[2] is "Bodhi",
        // then dachsunds[2].charAt(0) would give us "B"

        System.out.println(dachshunds[1].getBytes(StandardCharsets.UTF_8));
        // check into that later

        System.out.println(dachshunds[1].toUpperCase(Locale.ROOT));
        // makes a string all uppercase

        System.out.println(dachshunds[0].length());
        // can also count the amount of characters in a string

        System.out.println(Arrays.stream(dachshunds).findFirst());
        // can find find first element in the array

        System.out.println(Arrays.stream(dachshunds).count());
        // counts the elements in an array

        System.out.println(Arrays.stream(rams).count());
        // counts the elements in an array

        System.out.println(Arrays.stream(trees).iterator());
        // not sure about this one

        System.out.println(Arrays.stream(trees).limit(0));
        // not sure about this one

        int ii = 37;
        System.out.println(trees[0].chars().count());

        if (trees.length == 5) {
            for (int t1 = 0; t1 < trees.length; t1++) {
                System.out.println(trees[t1].chars().count());
            }
        }


        if (dachshunds[0] == "Beezer") {

            StringBuilder reverseTron = new StringBuilder();
            // definitely need a string builder in order to reverse a string

            reverseTron.append(dachshunds[0]);
            // we the .append() method to attach the string we want to reverse

            reverseTron = reverseTron.reverse();
            // new reverseTron equals the old reverseTron reversed


            System.out.println(reverseTron);
            // simply print out the string here
        }

        if (trees.length == 5) {
            for (int t1 = 0; t1 < trees.length; t1++) {
                StringBuilder reverseTron = new StringBuilder();
                // definitely need a string builder in order to reverse a string
                reverseTron.append(trees[t1]);
                reverseTron = reverseTron.reverse();
                System.out.println(reverseTron);
            }
        }

        if (rams.length == 4) {
            for (int r1 = 0; r1 < rams.length; r1++) {
                StringBuilder reverseTron = new StringBuilder();
                // making a new instance of the StringBuilder class
                // definitely need a string builder in order to reverse a string
                reverseTron.append(rams[r1]);
                reverseTron = reverseTron.reverse();
                System.out.println(reverseTron);

            }
        }

        if (robots.length == 4) {
            for (int r1 = 0; r1 < robots.length; r1++) {
                StringBuilder roboReverse = new StringBuilder();
                // making a new instance of the StringBuilder class
                // definitely need a string builder in order to reverse a string
                roboReverse.append(robots[r1]);
                roboReverse = roboReverse.reverse();
                System.out.println(roboReverse);
            }
        }

        if (trout.length == 2) {
            for (int t1 = 0; t1 < trout.length; t1++) {
                StringBuilder reverseTrout = new StringBuilder();
                // making a new instance of the StringBuilderClass
                // definitely need a string builder in order to reverse a string
                reverseTrout.append(trout[t1]);
                reverseTrout = reverseTrout.reverse();
                System.out.println(reverseTrout);
            }


        }

        if(robots.length == 4 && robots[2] == "Mellon-Tech"){
            for(int r1 = 0; r1 < robots.length; r1++){
                if(r1 == 2){
                    StringBuilder robo = new StringBuilder();
                    // new instance of string builder class
                    robo.append(robots[r1]);
                    robo = robo.reverse();
                    System.out.println(robo);
                }
            }
        }

        if(dachshunds.length == 5 || dachshunds.length == 37){
            for(int d1 = 0; d1 < dachshunds.length; d1++){
                if(d1 == 0 || d1 == 1){
                    StringBuilder appleHill = new StringBuilder();
                    // new instance of StringBuilder class
                    appleHill.append(dachshunds[d1]);
                    appleHill = appleHill.reverse();
                    System.out.println(appleHill);
                }
            }
        }

        if(robots[2] == "Mellon-Tech"){
            for(int r1 = 0; r1 < robots.length; r1++){
                if(r1 == 2){
                    StringBuilder robo = new StringBuilder();
                    // new instance of StringBuilder class
                    robo.append(robots[r1] + " can fix any telecaster");
                    robo = robo.reverse();
                    System.out.println(robo);
                }
            }
        }

        if(robots.length == 4 || robots[2].toUpperCase(Locale.ROOT) == "MELLON-TECH"){
            for(int r1 = 0; r1 < robots.length; r1++){
                if(r1 == 2){
                    StringBuilder robo = new StringBuilder();
                    // new instance of string builder class
                    robo.append(robots[r1]);
                    robo = robo.reverse();
                    System.out.println(robo);
                    robo = robo.reverse();
                    System.out.println(robo);
                }
            }
        }

        if(dachshunds.length == 5){
            for(int r1 = 0; r1 < robots.length; r1++){
                if(r1 == 3){
                    StringBuilder robo = new StringBuilder();
                    // new instance of StringBuilder class
                    robo.append(robots[r1] + " drinks 3 cases of Pickerel Cola.");
                    robo = robo.reverse();
                    System.out.println(robo);
                    robo.reverse();
                    System.out.println(robo);
                }
            }
        }

        if(trout.length == 2){
            for(int t1 = 0; t1 < trout.length; t1++){
                if(t1 == 0 || t1 == 1){
                    StringBuilder fish = new StringBuilder();
                    // new instance of StringBuilder class
                    fish.append(trout[t1] + " is an extremely resourceful trout.");
                    fish = fish.reverse();
                    System.out.println(fish);
                    fish = fish.reverse();
                    System.out.println(fish);
                }
            }
        }

        if(trees.length == 5){
            StringBuilder tree = new StringBuilder();
            tree.append(trees[0] + " is very fashionable.");
            tree = tree.reverse();
            int t1 = 5;
            do{
                System.out.println(tree);
                tree = tree.reverse();
                System.out.println(tree);
                t1--;
            }while(t1 > 0);
        }

        if(rams.length != 49){
            for(int r1 = 0; r1 < rams.length; r1++){
                if(r1 == 3){
                    StringBuilder hybrid = new StringBuilder();
                    // new instance of string builder class
                    hybrid.append(rams[r1] + " is named after Stacey Peralta.");
                    hybrid = hybrid.reverse();
                    System.out.println(hybrid);
                    hybrid = hybrid.reverse();
                    System.out.println(hybrid);

                }
            }
        }

        if(trout[0] == "brook trout" || robots[2] == "Mellon-Tech"){
            for(int r1 = 0; r1 < robots.length; r1++){
                if(r1 == 0){
                    StringBuilder robo = new StringBuilder();
                    robo.append(robots[r1] + " is an amazing cooler.");
                    robo = robo.reverse();
                    System.out.println(robo);
                    robo = robo.reverse();
                    System.out.println(robo);

                }
                if(r1 == 2){
                    StringBuilder robo = new StringBuilder();
                    robo.append(robots[2] + " loves Pickerel Cola!");
                    robo = robo.reverse();
                    System.out.println(robo);
                    robo = robo.reverse();
                    System.out.println(robo);

                }
            }
        }

        System.out.println(trees[0].chars().count());

        if(trees[0].chars().count() == 9){
            for(int t1 = 0; t1 < trees.length; t1++){
                System.out.println(trees[t1] + " is a Tree Hybrid with GREAT fashion sense.");
                System.out.println(trees[t1].chars().count() + " is the amount of characters in his name");
            }
        }

        System.out.println(Arrays.stream(trees).findFirst());

        System.out.println(robots.toString());
        // remember this method

        System.out.println(dachshunds.getClass());
        // not sure what this does

        if(dachshunds[0].chars().count() == 6){
            for(int d1 = 0; d1 < dachshunds.length; d1++){
                if(d1 == 2){
                    StringBuilder appleHill = new StringBuilder();
                    // new instance of StringBuilder class
                    appleHill.append(dachshunds[d1] + " runs up the Mountain Preserve.");
                    appleHill = appleHill.reverse();
                    System.out.println(appleHill);
                    appleHill = appleHill.reverse();
                    System.out.println(appleHill);
                }
            }
        }

        if(dachshunds.length == 5){
            for(int d1 = 0; d1 < dachshunds.length; d1++){
                System.out.println(dachshunds[d1] + " is a great dachshunds!!");
                System.out.println(dachshunds[d1].chars().count() + " is the amount of letters in this dachshund's name.");
            }
        }

        if(robots[2] == "Mellon-Tech" && robots[0] == "Hank-44"){
            int d1 = 4;
            while(d1 >= 0){
                System.out.println(dachshunds[d1]);
                System.out.println(dachshunds[d1].chars().count());
                d1--;
            }
        }

        if(robots[3] == "Eggplant-Head"){
            int r1 = 3;
            while(r1 >= 0){
                StringBuilder robo = new StringBuilder();
                robo.append(robots[r1] + " is an awesome robot!");
                robo = robo.reverse();
                System.out.println(robo);
                robo = robo.reverse();
                System.out.println(robo);
                r1--;
            }
        }

        if(trees[0] == "Cornelius"){
            int t1 = 4;
            do{
                StringBuilder tree = new StringBuilder();
                tree.append(trees[t1]);
                tree = tree.reverse();
                System.out.println(tree);
                tree = tree.reverse();
                System.out.println(tree);
                t1--;
            }while(t1 >= 0);
        }

        if(trees.length == 20 - 15){
            for(int t1 = 0; t1 < trees.length; t1++){
                if(t1 == 3){
                    StringBuilder tree = new StringBuilder();
                    tree.append(trees[t1] + " is a very fashionable Tree Hybrid.");
                    tree = tree.reverse();
                    System.out.println(tree);
                    tree = tree.reverse();
                    System.out.println(tree);
                }
            }
        }

        if(dachshunds[2] == "Bodhi" && dachshunds[1] == "Chipper"){
            int d1 = 4;
            while(d1 >= 0){
                if(d1 == 2){
                    System.out.println(dachshunds[d1] + " jumps over tree logs");
                }
                d1--;
            }
        }

        if(robots[2] == "Mellon-Tech" || rams[3] == "Stacey"){
            int r1 = hybridNo[0], reverse = 0;
            // r1 = 37;
            while(r1 != 0){
                int remainder = r1 % 10;
                // remainder = 37 % 10 = 7

                reverse = reverse * 10 + remainder;
                //
                r1 = r1 / 10;
            }
            System.out.println(reverse);
        }

        /*

        number = 37
        remainder = 37 % 10 = 7
        reverse = 0 * 10 + 7 = 0 + 7 = 7
        number = 37 / 10 = 3

        number = 3
        remainder = 3 % 10 = 3
        reverse = 7 * 10 + 3 = 73
        number = 3 /10 = 0

        Now the variable number become 0. Hence, we get the reverse number 73

         */

        if(robots.length == 4){
            int r1 = hybridNo[7], reverse = 0;
            // then initialization for the for loop
            for(;r1 != 0; r1 = r1 / 10){
                int remainder = r1 % 10;
                reverse = reverse * 10 + remainder;
            }
            System.out.println(reverse);
        }

        if(trees.length == 5){
            int t1 = hybridNo[6], reverse = 0;
            // then initialization for the for loop
            for(;t1 != 0; t1 = t1 / 10){
                int remainder = t1 % 10;
                reverse = reverse * 10 + remainder;
            }
            System.out.println(reverse);
        }

        if(robots.length == 4){
            int r1 = hybridNo[6], reverse = 0;
            // then initialization for the for loop
            for(;r1 != 0; r1 = r1 / 10){
                int remainder = r1 % 10;
                reverse = reverse * 10 + remainder;
                System.out.println(reverse);
            }
        }

        if(rams.length == 4 && rams[3] == "Stacey"){
            int r2 = hybridNo[9];
            int r1 = hybridNo[9], reverse = 0;
            // then initialization
            for(;r1 != 0; r1 = r1 /10){
                int remainder = r1 % 10;
                reverse = reverse * 10 + remainder;
            }
            if(r2 == reverse){
                System.out.println(r2 + " is a palindrome!!!");
            }
        }

        if(trees.length == 5 && trees[0] == "Cornelius"){
            int t2 = hybridNo[5];
            // declaring variable first because this on will not be changed by for loop
            int t1 = hybridNo[5], reverse = 0;
            // then initialization
            for(;t1 != 0; t1 = t1 / 10){
                // for loop conditions  are while t1 is not equal to 0, then divide that number by 10
                // if data type int in java is less than 10 and divided by 10, then we will get 0
                int remainder = t1 % 10;
                // this will find remainder when number is divided by ten
                // for example, if 37 is divided by 10, then the remainder will be 37
                reverse = reverse * 10 + remainder;
                // if number is 37, the reverse through the first iteration will be 7
                // on the second iteration, the remainder will be 3 and the reverse will 7
                // so it will be reverse = 7 * 10 + 3 = 73
            }
            if(t2 == reverse){
                System.out.println(t2 + " is a palindrome!!");
            }
            else
                System.out.println(t2 + " is not a palindrome!!");
        }

        if(trees.length == 5){
            for(int t1 = 0; t1 < trees.length; t1++){
                if(t1 == 3){
                    StringBuilder tree = new StringBuilder();
                    tree.append(trees[t1] + " gains wisdom in the Atrium");
                    tree = tree.reverse();
                    System.out.println(tree);
                    tree = tree.reverse();
                    System.out.println(tree);
                }
            }
        }

        if(dachshunds.length == 5){
            for(int d1 = 0; d1 < dachshunds.length; d1++){
                System.out.println(dachshunds[d1]);
            }
        }

        if(dachshunds.length == 5){
            for(int d1 = 4; d1 >= 0; d1--){
                System.out.println(dachshunds[d1]);
            }
        }

        if(dachshunds.length == 5){
            int d2 = hybridNo[5];
            // declaring variable first because this variable will not be changed by the for loop
            int d1 = hybridNo[5], reverse = 0;
            // declaring t1 for for loop, and reverse needs to start at 0 pretty much all the time
            for(;d1 != 0; d1 = d1 / 10){
                // for loop conditions are while d1 is not equal to 0, then divide that number by 10
                // if data type int in java is less than 10 and divided by 10, then we will get 0
                int remainder = d1 % 10;
                // this will find remainder when number is divided by ten
                // for example, if 37 is divided by 10, then the remainder will be 7
                reverse = reverse * 10 + remainder;
                // if number is 37, the reverse through the first iteration will be 7
                // on the second iteration, the remainder will be 3 and the reverse will be 7
                // so it will be reverse = 7 * 10 + 3 = 73
            }
            System.out.println(reverse);
        }

        if(trees.length == 5){
            int t2 = hybridNo[5];

            int t1 = hybridNo[5], reverse = 0;

            for(;t1 != 0; t1 = t1 / 10){

                int remainder = t1 % 10;

                reverse = reverse * 10 + remainder;
            }
            System.out.println(reverse);
        }

        if(robots[2] == "Mellon-Tech"){
            int t2 = hybridNo[4];
            int t1 = hybridNo[4], reverse = 0;

            for(;t1 != 0; t1 = t1 /10){

                int remainder = t1 % 10;

                reverse = reverse * 10 + remainder;
            }
            System.out.println(reverse);
        }

        if(trees.length == 5 && robots[2] == "Mellon-Tech"){
            for(int t1 = 0; t1 < trees.length; t1++){
                if(t1 == 3){
                    StringBuilder tree = new StringBuilder();
                    tree.append(trees[t1] + " is a fine connoisseur of tea");
                    tree = tree.reverse();
                    System.out.println(tree);
                    tree = tree.reverse();
                    System.out.println(tree);
                }
            }
        }

        if(dachshunds[2] == "Bodhi"){
            int d2 = hybridNo[4];
            int d1 = hybridNo[4], reverse = 0;

            for(;d1 != 0; d1 = d1 / 10){
                int remainder = d1 % 10;

                reverse = reverse * 10 + remainder;
            }
            if(d2 == reverse){
                System.out.println(d2 + " is a palindrome!");
            }
            else
                System.out.println(d2 + " is not a palindrome!");
        }

        if(robots.length == 4){
            for(int r1 = 0; r1 < robots.length; r1++){
                System.out.println(robots[r1] + " is an awesome robot!");
            }
        }

        if(robots.length == 4){
            for(int r1 = 3; r1 >= 0; r1--){
                System.out.println(robots[r1] + " is an awesome robot!");
            }
        }

        if(trees.length == 5 || dachshunds.length == 37){
            int d1 = 0;
            while(d1 < dachshunds.length){
                if(d1 == 2){
                    System.out.println(dachshunds[d1] + " jumped over a huge log!");
                }
                d1++;
            }
        }

        if(trees[0] == "Cornelius"){
            int t1 = 4;
            do{
                if(t1 == 4) {
                    System.out.println(trees[t1] + " is a very impressive Tree Hybrid.");
                    t1++;
                }
            }while(t1 < trees.length);
        }

        System.out.println(dachshunds[2].length());
        // will output the number of letters in a string

        System.out.println(dachshunds[0].charAt(4));
        // will out put the letter at a certain string index, given that the 5th letter in Beezer is e
        // e is what will print

        System.out.println(dachshunds[1].concat(dachshunds[2]));
        //will combine two strings, this will give us ChipperBodhi

        if(trees[0] == "Cornelius"){
            int t2 = hybridNo[5];
            int t1 = hybridNo[5], reverse = 0;

            for(;t1 != 0; t1 = t1 / 10){
                int remainder = t1 % 10;

                reverse = reverse * 10 + remainder;
            }
            System.out.println(reverse);
        }

        if(robots[2] == "Mellon-Tech"){
            for(int d1 = 0; d1 < dachshunds.length; d1++){
                System.out.println(dachshunds[d1].toUpperCase(Locale.ROOT));
            }
        }

        if(robots[3] == "Eggplant-Head"){
            for(int r1 = 0; r1 < robots.length; r1++){
                if(r1 == 3){
                    StringBuilder robo = new StringBuilder();
                    robo.append(robots[3] + " loves Pickerel Cola!");
                    robo = robo.reverse();
                    System.out.println(robo);
                    robo = robo.reverse();
                    System.out.println(robo);
                }
            }
        }

        if(dachshunds[0] == "Beezer" && dachshunds[1] == "Chipper"){
            int d2 = hybridNo[9];
            int d1 = hybridNo[9], reverse = 0;

            for(;d1 != 0; d1 = d1 / 10){
              int remainder = d1 % 10;

              reverse = reverse * 10 + remainder;
            }
            if(reverse == d2){
                System.out.println(d2 + " is a palindrome!");
            }
            else
                System.out.println(d2 + " is not a palindrome!");
        }


        if(trees.length * dachshunds.length == 25){
            int d1 = 4;
            do{
                System.out.println(dachshunds[d1].toUpperCase(Locale.ROOT));
                d1--;
            }while(d1 >= 0);
        }

        if(rams[3] == "Stacey"){
            int r1 = 3;
            while(r1 >= 0){
                if(r1 == 3){
                    System.out.println(rams[r1].toUpperCase(Locale.ROOT));
                }
                r1--;
            }
        }

        if(robots[3] == "Eggplant-Head"){
            int r2 = hybridNo[8];
            int r1 = hybridNo[8], reverse = 0;

            for(;r1 != 0; r1 = r1 / 10){
                int remainder = r1 % 10;

                reverse = reverse * 10 + remainder;
            }
            System.out.println(reverse);
        }

        if(robots[2] == "Mellon-Tech"){
            for(int r1 = 3; r1 >= 0; r1--){
                if(r1 == 3){
                    System.out.println(robots[3].concat(robots[2]).toUpperCase(Locale.ROOT));
                    // outputs EGGPLANT-HEADMELLON-TECH
                }
            }
        }

        System.out.println(robots[2].compareTo(robots[3]));
        System.out.println(robots[2].contains(robots[0]));
        // outputs false

        System.out.println(dachshunds[0].contains(dachshunds[2]));
        // outputs false

        if(dachshunds[1] == "Chipper" || dachshunds[1] == "Crusoe"){
            for(int d1 = 0; d1 < dachshunds.length; d1++){
                if(d1 == 2 || d1 == 0){
                    StringBuilder appleHill = new StringBuilder();
                    appleHill.append(dachshunds[d1] + " loves to run fast in the country!!!");
                    appleHill = appleHill.reverse();
                    System.out.println(appleHill);
                    appleHill = appleHill.reverse();
                    System.out.println(appleHill);

                }
            }
        }

        if(robots.length == 4){
            int r1 = 3;
            do{
                if(r1 == 3){
                    System.out.println(robots[r1] + " drinks tons of Pickerel Cola.");
                }
                r1--;
            }while(r1 >= 0);
        }

        if(robots.length == 4){
            int r1 = 3;
            while(r1 >= 0){
                if(r1 == 3){
                    System.out.println(robots[3] + " drinks 5 cases of Pickerel Cola per day!");
                }
                r1--;
            }
        }

        System.out.println(dachshunds[0].concat(dachshunds[1].concat(dachshunds[2])));
        // output will be BeezerChipperBodhi
        System.out.println(dachshunds[0].concat(dachshunds[1].concat(dachshunds[2].concat(dachshunds[3].concat(dachshunds[4])))));

        if(trees.length == 5 && rams[1] == "Otto"){
            int r2 = hybridNo[7];
            int r1 = hybridNo[7], reverse = 0;

            for(;r1 != 0; r1 = r1 / 10){
                int remainder = r1 % 10;

                reverse = reverse * 10 + remainder;
            }
            System.out.println(reverse);
        }

        System.out.println(hybridNo[7]);

        if(trees.length == 5){

            String treeString = String.valueOf(hybridNo[9]);
            // switching number to a string
            int countSoFar = 0;
            // declaring countSoFar
            for(int t1 = 0; t1 < treeString.length(); t1++){
                //iterating through each character of the string
                char currentChar = treeString.charAt(t1);
                // is taking string characters one at a time
                String currentCharAsString = String.valueOf(currentChar);
                // switching character to string
                countSoFar = countSoFar + Integer.parseInt(currentCharAsString);
            }
            System.out.println(countSoFar);

        }

        if(robots[2] == "Mellon-Tech"){
            String ramString = String.valueOf(hybridNo[7]);
            // here we are creating a new string called ramString
            // the .valueOf() method will convert its integer parameter into a string
            int countSoFar = 0;
            // declaring countSoFar
            for(int t1 = 0; t1 < ramString.length(); t1++){
                // iterating through each character of the string
                char currentChar = ramString.charAt(t1);
                // is taking string characters one at a time
                String currentCharAsString = String.valueOf(currentChar);
                // switching characters to string
                countSoFar = countSoFar + Integer.parseInt(currentCharAsString);
                // we need to add the integers one at a time as they are iterated through
                // let's say we have we're iterating through {1, 2, 3, 4}
                // since countSoFar is initialized at 0, and the first iteration is 1
                // it will be 0 + 1 = 1
                // then 1 + 2 = 3
                // then 3 + 3 = 6
                // then 6 + 4 = 10
                // think about x = x + y whenever we need to keep doing a mathematical operation for
                // each integer we iterate through
            }
            System.out.println(countSoFar);
        }

        // System.out.println(Integer.parseInt(robots[2]));
        // gave an error because string cannot be successfully converted to integers

        System.out.println(Integer.parseInt(hybridString[0]));
        // does not give an error because string characters can be successfully converted to integers

        if(robots.length == 4 && robots[1] == "Warren-21"){
            String robot = String.valueOf(hybridNo[9]);
            System.out.println(robot.concat(hybridString[0]));
        }

        if(dachshunds[0] == "Beezer" && dachshunds[1] == "Chipper" && dachshunds[2] == "Bodhi"){
            String hybrid = String.valueOf(hybridNo[9]);

            int countSoFar = 0;

            for(int t1 = 0; t1 < hybrid.length(); t1++){
                // iterating through each character of the string
                char currentChar= hybrid.charAt(t1);
                // gathering string characters one at a time
                String currentCharAsString = String.valueOf(currentChar);
                // switching character to string
                countSoFar = countSoFar + Integer.parseInt(currentCharAsString);
            }
            System.out.println(countSoFar);
        }

        if(dachshunds[4] == "Star"){
            StringBuilder appleHill = new StringBuilder();
            appleHill.append(dachshunds[3] + " and " + dachshunds[4] + " live in Billings.");
            appleHill = appleHill.reverse();
            System.out.println(appleHill);
            appleHill = appleHill.reverse();
            System.out.println(appleHill);

        }

        if(robots[2] == "Mellon-Tech"){
            int r2 = hybridNo[9];
            int r1 = hybridNo[9], reverse = 0;
            for(;r1 != 0; r1 = r1 / 10){

                int remainder = r1 % 10;

                reverse = reverse * 10 + remainder;
            }
            System.out.println(reverse);
        }

        if(robots[2] == "Mellon-Tech"){
            int r2 = hybridNo[9];
            int r1 = hybridNo[9], reverse = 0;

            for(;r1 != 0; r1 = r1 / 10){

              int remainder = r1 % 10;

              reverse = reverse * 10 + remainder;
            }
            if(r2 == reverse){
                System.out.println(r2 + " is a palindrome!");
            }
            else
                System.out.println(r2 + " is not a palindrome");
        }

        if(robots.length == 4 && dachshunds[4] == "Star"){
            StringBuilder appleHill = new StringBuilder();
            appleHill.append(dachshunds[3] + " is a great dachshund!");
            appleHill = appleHill.reverse();
            System.out.println(appleHill);
            appleHill = appleHill.reverse();
            System.out.println(appleHill);
        }

        if(robots[2] == "Mellon-Tech"){
            for (int r1 = 0; r1 < robots.length; r1++){
                StringBuilder robo = new StringBuilder();
                robo.append(robots[r1] + " is an awesome robot!");
                robo = robo.reverse();
                System.out.println(robo);
                robo = robo.reverse();
                System.out.println(robo);
            }
        }

        if(dachshunds[2] == "Bodhi"){
            int d2 = hybridNo[9];
            // will declare this variable since d1 will change throughout iteration
            // if we want to compare the initial number to the reversed number
            // we need the original number attached to a variable that won't be modified by
            // the for loop
            int d1 = hybridNo[9];
            // variable that will modified by the for loop
            int reverse = 0;
            // we will use this reverse to add the numbers as they go through the iteration
            // let's just think about a simple function that adds the hybridsNum array which is
            // {1, 2, 3, 4}. and we have  int sum = 0 defined before the loop begins
            // then as our variable d1 goes through the for loop, we can add the numbers as they through the loop
            // in body of loop, there will be sum = sum + r1, first loop will be sum = 0 + 1
            // then the next will be sum = 1 + 2, then sum = 3 + 3, then sum = 6 + 4
            // so when we System.out.println(sum); 10 will print to the console

            for(;d1 != 0; d1 = d1 / 10){
                int remainder = d1 % 10;

                reverse = reverse * 10 + remainder;

            }
            System.out.println(reverse);
        }

        if(robots.length == 4 && robots[3] == "Eggplant-Head"){
            int r1 = 0;
            String hybridNew = String.valueOf(hybridNo.length);
            int sum = 0;
            for(; r1 < roboNo.length; r1++){
                sum = sum + roboNo[r1];
                System.out.println(sum);
            }
            System.out.println(sum);

        }

        if(dachshunds.length == 5){
            int sum = 0;

            for(int d1 = 0; d1 < treeNo.length; d1++){
                sum = sum + treeNo[d1];
            }
            System.out.println(sum);
        }

        if(trees.length == 5 && robots[1] == "Warren-21"){
            int product = 0;

            for(int t1 = 0; t1 < treeNo.length; t1++){
                product = product * treeNo[t1];
                // won't work using product because anything multiplied by zero will equal zero
            }
            System.out.println(product);
        }

        if(robots.length == 4){
            int difference = 0;

            for(int r1 = 0; r1 < treeNo.length; r1++){
                difference = difference - treeNo[r1];
            }
            System.out.println(difference);
        }

        if(robots.length == 4 && robots[0] == "Hank-44"){
            String robot = String.valueOf(hybridNo[9]);
            // before we do anything, we need to convert the integer into a string
            int countSoFar = 0;
            // will be our incrementing variable
            for(int r1 = 0; r1 < robot.length(); r1++){
                // iterating through each character of the string
                char currentChar = robot.charAt(r1);
                // gathering the string characters one at a time
                String currentCharAsString = String.valueOf(currentChar);
                // switching character to string
                countSoFar = countSoFar + Integer.parseInt(currentCharAsString);
            }
            System.out.println(countSoFar);
            // when finding the sum of an integer, there are a few steps to remember that will help us find our
            // way to a solution
            // since we're starting out with an integer, we need to convert to a string first so we can extract the
            // characters from that string
            // we convert int x to a string by creating a string, and then changing the value of the integer into
            // a string, for example, String robot = String.valueOf(x);
        }

        if(rams.length == 4){
            String ram = String.valueOf(hybridNo[6]);
            // converting int hybridNo[6] to a string
            int countSoFar = 0;
            // this is our incrementing variable
            for(int r1 = 0; r1 < ram.length(); r1++){

                char currentChar = ram.charAt(r1);

                String currentCharAsString = String.valueOf(currentChar);

                countSoFar = countSoFar + Integer.parseInt(currentCharAsString);
            }
            System.out.println(countSoFar);
        }

        if(robots[2] == "Mellon-Tech"){
            String robot = String.valueOf(hybridNo[5]);
            // must start by converting integer into a string
            int countSoFar = 0;
            // we'll define our incremental variable up here

            for(int t1 = 0; t1 < robot.length(); t1++){
                // iterating through each character in the string
                char currentChar = robot.charAt(t1);
                // gather each character 1 by one
                String currentCharAsString = String.valueOf(currentChar);
                // convert each character back into a string 1 by 1
                countSoFar = countSoFar + Integer.parseInt(currentCharAsString);
                // here we convert each string into an integer, and ten incrementally add it.
            }
            System.out.println(countSoFar);
            // print our sum to the console
        }

        if(robots[2] == "Mellon-Tech"){
            int r2 = hybridNo[5];
            int r1 = hybridNo[5], reverse = 0;

            for(;r1 != 0; r1 = r1 / 10){
                 int remainder = r1 % 10;
                 reverse = reverse * 10 + remainder;
            }
            if (r2 == reverse){
                System.out.println(r2 + " is a palindrome");
            }
            else
                System.out.println(r2 + " is not a palindrome");
        }

        if(trees[0] == "Cornelius"){
            String h2 = "kayak";
            String h1 = "kayak";
            StringBuilder hybrid = new StringBuilder();
            hybrid.append(h1);
            hybrid = hybrid.reverse();
            String robo = String.valueOf(hybrid);
            System.out.println(hybrid);
            if(h2 == robo){
                System.out.println(h2 + " is a palindrome.");
            }
            else
                System.out.println(h2 + " is not a palindrome");
        }
        // didn't work, couldn't convert StringBuilder object to String object this way

        if(robots.length * dachshunds.length == 20){
            int t2 = hybridNo[3];
            int t1 = hybridNo[3], reverse = 0;
            for(;t1 != 0; t1 = t1 /10){

              int remainder = t1 % 10;

              reverse = reverse * 10 + remainder;
            }
            System.out.println(reverse);
        }

        if(robots.length == 4 && robots[3] == "Eggplant-Head"){
            int r2 = hybridNo[4];
            int r1 = hybridNo[4], reverse = 0;

            for(;r1 != 0; r1 = r1 / 10){
                int remainder = r1 % 10;

                reverse = reverse * 10 + remainder;
            }
            System.out.println(reverse);
        }

        if(rams.length == 4){
            String robo = String.valueOf(hybridNo[4]);
            System.out.println(dachshunds[0].concat(robo));
        }

        if(pisces[0] == "Galahad"){
            StringBuilder hadal = new StringBuilder();
            hadal.append(pisces[0] + " is a great warrior of the Marianas Trench");
            hadal = hadal.reverse();
            System.out.println(hadal);
            hadal = hadal.reverse();
            System.out.println(hadal);
        }

        if(pisces[4] == "Hadrian"){
            int f1 = hybridNo[7];
            String fish = String.valueOf(f1);
            int countSoFar = 0;
            for (int f2 = 0; f2 < fish.length(); f2++){
                // gather each letter as a character fish.charAt(f2)
                char currentChar = fish.charAt(f2);
                // then convert each character to a string String.valueOf(currentChar)
                String currentCharAsString = String.valueOf(currentChar);
                // then convert each character to an integer, and incrementally add them with them with
                countSoFar = countSoFar + Integer.parseInt(currentCharAsString);
                // the countSoFar int variable
                // countSoFar = countSoFar + Integer.parseInt(currentCharAsString);
            }
            System.out.println(countSoFar);
        }
        if(pisces[1] == "Governal"){
            int sum = 0;
            for(int f1 = 0; f1 < treeNo.length; f1 ++){
                sum = sum + treeNo[f1];
                System.out.println(sum);
                // will show sum incrementing
            }
            System.out.println(sum);
            // will show final sum
        }

        if(hammerHead[0] == "Hammerhead"){
            for (int h1 =0; h1 < hammerHead.length; h1++){
                if(h1 == 4){
                    System.out.println(hammerHead[h1]);
                }
            }
        }

        if(samurai[0] == "Lone Wolf Samurai"){
          int s1 = 8;
          while(s1 >= 0){
              System.out.println(samurai[s1]);
              s1--;
          }
        }

        if(samurai[1] == "Kenji the Crane"){
            int s1 = 0;
            do{
                System.out.println(samurai[s1]);
                s1++;
            }while(s1 < samurai.length);
            // remember we can use .length in while and do while loops as well
        }

        if(hammerHead[1] == "Taylor"){
            System.out.println("hybridConsole");
            StringBuilder spaceShark = new StringBuilder();
            spaceShark.append(hammerHead[0] + " delivers Pickerel Cola across space");
            spaceShark = spaceShark.reverse();
            System.out.println(spaceShark);
            spaceShark = spaceShark.reverse();
            System.out.println(spaceShark);

        }

        if(hammerHead[0] == "Hammerhead"){
            for (int h1 = 0; h1 < hammerHead.length; h1++){
                System.out.println(hammerHead[h1]);
            }
        }

        if(hammerHead.length == 6){
            int h1 = 0;
            do{

                    System.out.println(hammerHead[h1] + " will make all and everything okay.");
                    h1++;

            }while(h1 < hammerHead.length);
        }

        System.out.println(hammerHead[5]);

        if(hammerHead[3] == "Harvey"){
            for(int h1 = 0; h1 < hammerHead.length; h1++){
                if(h1 == 5){
                    System.out.println(hammerHead[5] + " the Cosmic Trout will make all and everything okay.");
                }
            }
        }

        if(robots[2] == "Mellon-Tech"){
            String soda = String.valueOf(hybridNo[7]);
            // converting an integer to a string
           int countSoFar = 0;
           // countSoFar will be our incremental variable
            for(int r1 = 0; r1 < soda.length(); r1++){
                // iterating through each character of the soda string
                char currentChar = soda.charAt(r1);
                // gathering each character one by one
                String currentCharAsString = String.valueOf(currentChar);
                // one by one taking the characters and converting them to strings
                countSoFar = countSoFar + Integer.parseInt(currentCharAsString);
                // one by one changing the string characters to integers, and then adding them
                // incrementally so we'll get our sum.
            }
            System.out.println(countSoFar);
        }

        if(hammerHead[0] == "Hammerhead"){
            int difference = 0;
            // difference is our incremental variable
            for(int h1 = 0; h1 < treeNo.length; h1++){
                difference = difference - treeNo[h1];
                // incremental variable
            }
            System.out.println(difference);
        }

        if(hammerHead[0] == "Hammerhead" && hammerHead[1] == "Taylor"){
            int sum = 0;
            int h2 = 0;
            for (int h1 = 0; h1 < treeNo.length; h1++){
                sum = sum + treeNo[h1];
                h2 = sum / treeNo.length;
            }
            System.out.println(h2);
        }

        if(hammerHead[0] == "Hammerhead"){
            int h1 = hybridNo[2], reverse = 0;
            for(;h1 != 0; h1 = h1 / 10){
                int remainder = h1 % 10;
                reverse = reverse * 10 + remainder;
            }
            System.out.println(reverse);
        }

        System.out.println(Arrays.stream(hammerHead).sequential());
        // didn't do much
        if(hammerHead[0] == "Hammerhead"){
            for(int h1 =0; h1 < hammerHead.length; h1++){
                System.out.println(hammerHead[h1]);
            }
        }

        System.out.println(hammerHead[4]);

        if(hammerHead[4] == "Wibaux"){
            StringBuilder whiteFish = new StringBuilder();
            whiteFish.append(hammerHead[4] + " has a cool exo-suit!");
            whiteFish = whiteFish.reverse();
            System.out.println(whiteFish);
            whiteFish = whiteFish.reverse();
            System.out.println(whiteFish);
        }

        if(hammerHead[2] == "Geometry Man"){
            int h1 = 0;
            while(h1 < hammerHead.length){
                if (h1 < 6 ){
                    System.out.println(hammerHead[h1] + " will make all okay.");
                    h1++;
                }
            }
        }

        System.out.println(hammerHead[5]);

        if(samurai[0] == "Lone Wolf Samurai"){
            for(int h1 = 0; h1 < hammerHead.length; h1++){
                if(h1 == 5){
                    System.out.println(hammerHead[h1] + " will make all okay.");
                }
            }
        }

        if(robots.length == 4 && robots[2] == "Mellon-Tech"){
            String robot = String.valueOf(hybridNo[6]);
            // converting integer to string
            int countSoFar = 0;
            // incrementing variable
            for(int r1 = 0; r1 < robot.length(); r1++){
                // iterating through each character in the string
                char currentChar = robot.charAt(r1);
                // taking the string characters one at a time through the for loop
                String currentCharAsString = String.valueOf(currentChar);
                // converting each character back into a string one by one
                countSoFar = countSoFar + Integer.parseInt(currentCharAsString);
                // incrementing variable and converting string characters back into integers

            }
            System.out.println(countSoFar);
            // printing out the new integer to the console
        }

        if(hammerHead[4] == "Wibaux"){
            StringBuilder whiteFish = new StringBuilder();
            whiteFish.append(hammerHead[4] + " is from Hardin-37.");
            whiteFish = whiteFish.reverse();
            System.out.println(whiteFish);
            whiteFish = whiteFish.reverse();
            System.out.println(whiteFish);
        }

        System.out.println(hammerHead[3]);
        if(hammerHead[3] == "Harvey"){
            for(int h1 = 0; h1 < hammerHead.length; h1++){
                if (h1 == 3){
                    System.out.println(hammerHead[3] + " is a tough beaver from Hardin-37.");
                }
            }
        }

        if(hammerHead[0] == "Hammerhead" && hammerHead[3] == "Harvey"){
            for (int h1 = 0; h1 < hammerHead.length; h1++){
                for (int h2 = h1 + 1; h2 < hammerHead.length; h2++){
                    if (h1 == 3){
                        System.out.println(hammerHead[h2]);
                    }
                }
            }
        }


    }
}

