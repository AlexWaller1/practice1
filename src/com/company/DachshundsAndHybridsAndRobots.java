package com.company;

public class DachshundsAndHybridsAndRobots {

    public static void main(String[] args){

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
        String[] dachshunds = {"Beezer", "Chipper", "Bodhi", "Jake", "Star"};

        if(robots[0] == "Hank-44"){
            System.out.println(robots[0] + " is great on the Green Egg.");
        }

        if( dachshunds[0] == "Beezer" && dachshunds.length == 5){
            System.out.println(dachshunds[2] + " ran up the Flume Trail!");
        }




    }
}