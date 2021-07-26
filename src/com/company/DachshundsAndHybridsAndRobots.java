package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;

public class DachshundsAndHybridsAndRobots {

    public static void main(String[] args) {

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
        int[] hybridNo = {37, 9, 44, 23, 21, 102, 2309, 1992, 2002, 9229};

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






    }
}
