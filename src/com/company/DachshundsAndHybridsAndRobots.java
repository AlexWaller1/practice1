package com.company;

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

        if(dachshunds.length == 5 && trees.length == 5){
            for(int d1 = 0; d1 < dachshunds.length; d1++){
                if(d1 == 2){
                    System.out.println(dachshunds[d1] + " wants to do something!!!!");
                }
            }
        }

        if(robots[2] == "Mellon-Tech" || trout.length * trees.length == 37){
            for(int r1 = 0; r1 < robots.length; r1++){
                if(r1 == 3){
                    System.out.println(robots[r1] + " is not an Eggplant!?");
                }
            }
        }

        System.out.println(treeHybridNo);
        System.out.println(ramHybridNo);
        System.out.println(troutHybridNo);
        System.out.println(robotNo);
        System.out.println(dachshundNo);

        if(treeHybridNo > dachshundNo){
            System.out.println(trees[0]);
        }
        else
            System.out.println("There are the same amount of trees and dachshunds!");

        System.out.println(dachshunds.length);
        System.out.println(dachshunds[0].chars().count());
        System.out.println(dachshunds[1].chars().count());

        if (dachshunds[0].chars().count() == 6){
            for(int d1 = 0; d1 < dachshunds.length; d1++){
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


    }
}
