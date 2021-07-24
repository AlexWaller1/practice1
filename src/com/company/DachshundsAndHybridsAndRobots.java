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

        if(robots[2] == "Mellon-Tech"){
            for(int r1 = 0; r1 < robots.length; r1++){
                System.out.println(robots[r1]);
                if(r1 == 2){
                    int r2 = 3;
                    while(r2 >= 0){
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

        if(robots[1] == "Warren-21" || trout[0] == "Rainbow"){
            int t1 = 1;
            while(t1 >= 0){
                System.out.println(trout[t1]);
                t1--;
            }
        }

        if(robots[0] == "Hank-44" || trout[1] == "Brown"){
            int t1 = 0;
            while(t1 <= 1){
                System.out.println(trout[t1]);
                t1++;
            }
        }





    }
}
