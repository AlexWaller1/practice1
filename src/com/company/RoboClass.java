package com.company;

public class RoboClass {
    public static void main(String[] args) {
        String robo1 = "Hank-44";
        String robo2 = "Warren-21";
        String[] robots = {"Hank-44", "Warren-21", "Mellon-Tech", "Eggplant-Head"};

        double roboFacture = 9;
        double roboModify = 10;
        double roboReact = 21;

        System.out.println(robo1);
        System.out.println(robo2);
        System.out.println(robots[0]);
        System.out.println(robots[2]);
        System.out.println(robots[0] + " and " + robots[2] + " love to fix guitars. ");
        System.out.println(roboModify * roboReact);
        System.out.println(roboModify / roboReact);
        System.out.println(roboModify / (roboReact * roboFacture));
        System.out.println(robots[3]);


    }
}
