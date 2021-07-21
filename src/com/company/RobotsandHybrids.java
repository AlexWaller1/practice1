package com.company;

public class RobotsandHybrids {

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

        String[] rams = {"Tony", "Otto", "Jay", "Stacey"};
        String[] trees = {"Cornelius", "Magnus", "Owen", "Everett", "Jasper"};
        String[] trout = {"Rainbow", "Brown"};
        String[] robots = {"Hank-44", "Warren-21", "Mellon-Tech", "Eggplant-Head"};

        if (rams[0] == trees[0]) {
            System.out.println("These are the same hybrid.");
        }
        else
        System.out.println("These are different hybrids.");

        if (trout[1] == trout[1]) {
            System.out.println("This is a brown trout hybrid.");
        }
        else
        System.out.println("This is a rainbow trout hybrid.");

        System.out.println(ramHybridNo + treeHybridNo);
        System.out.println(troutHybridNo * 9);

        if (treeHybridNo == 30) {
            System.out.println("There are 30 Trout Hybrids.");
        }
        else
            System.out.println("There are 2 Trout Hybrids.");

        System.out.println(troutHybridNo + treeHybridNo);

        System.out.println(robots[3]);

        if (robots[3] == "Eggplant-Head") {
            System.out.println("The robot's name is Eggplant-Head");
        }
        else
            System.out.println("The robot's name is not Eggplant-Head");

        if (robots[0] == robots[1]) {
            System.out.println("These are the same robots.");
        }
        else
            System.out.println("These are different robots.");

        System.out.println(robots[2]);

        if (robots[0] == "Hank-44") {
            System.out.println("Hi, Hank-44!");
        }
        else
            System.out.println("Hey, where's Hank-44?");

        System.out.println("How was curling today?");
        System.out.println(robotNo * ramHybridNo);

        if (ramHybridNo == robotNo) {
            System.out.println("There's 4 Robots and 4 Ram Hybrids");
        }
        else
            System.out.println("There's a different number of Ram Hybrids and Robots");

        if (ramHybridNo < 37 && treeHybridNo < 37) {
            System.out.println("There are less than 37.");
        }
        else
            System.out.println("There's more than 37, or could be equal");

        if (ramHybridNo <= 5 || treeHybridNo > 37) {
            System.out.println("There are 5 Ram Hybrids.");
        }
        else
            System.out.println("There are more than 37 Tree Hybrids");

        System.out.println(robots[2] + " is great at fixing Telecasters. ");

        if (robots.length == 37) {
            System.out.println("There are 37 Robots.");
        }
        else
            System.out.println("There are 4 robots.");

        if (robots.length == 37 || trees.length == 5) {
            System.out.println("There are 5 Tree Hybrids");
        }
        else
            System.out.println("There are 37 robots");

        if (robots.length == 4 && rams.length == 4) {
            System.out.println("There are 4 Ram Hybrids and 4 Robots.");
        }
        else
            System.out.println("4 is not the number.");

        for(int i = 0; i < robots.length; i++) {
            System.out.println(robots[i]);
        }

        for(int i = 0; i < trees.length; i++ ) {
            if(trees[4] == "Jasper"){
                System.out.println("Jasper is a Tree Hybrid.");
            }
        }

        for(int i = 0; i < trout.length; i++) {
            System.out.println(trout[1]);
        }

        for(int i = 0; i < trout.length; i++) {
            System.out.println(trout[0]);
        }

        for(int i = 0; i < robots.length; i++) {
            if(robots[i] == "Mellon-Tech") {
                System.out.println("What's up, Mellon-Tech?");
            }
            if(robots[i] == "Hank-44") {
                System.out.println("How's the curling stone, Hank-44?");
            }
            else
                System.out.println("How's the curling stone, Hank-44?");
        }

        for(int i = 0; i < robots.length; i++) {
            if(robots[i] == "Mellon-Tech") {
                System.out.println("What's up Mellon-Tech?");
            }
        }






        }
    }

