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
        String[] dachshunds = {"Beezer", "Chipper", "Bodhi", "Jake", "Star"};

        if (rams[0] == trees[0]) {
            System.out.println("These are the same hybrid.");
        } else
            System.out.println("These are different hybrids.");

        if (trout[1] == trout[1]) {
            System.out.println("This is a brown trout hybrid.");
        } else
            System.out.println("This is a rainbow trout hybrid.");

        System.out.println(ramHybridNo + treeHybridNo);
        System.out.println(troutHybridNo * 9);

        if (treeHybridNo == 30) {
            System.out.println("There are 30 Trout Hybrids.");
        } else
            System.out.println("There are 2 Trout Hybrids.");

        System.out.println(troutHybridNo + treeHybridNo);

        System.out.println(robots[3]);

        if (robots[3] == "Eggplant-Head") {
            System.out.println("The robot's name is Eggplant-Head");
        } else
            System.out.println("The robot's name is not Eggplant-Head");

        if (robots[0] == robots[1]) {
            System.out.println("These are the same robots.");
        } else
            System.out.println("These are different robots.");

        System.out.println(robots[2]);

        if (robots[0] == "Hank-44") {
            System.out.println("Hi, Hank-44!");
        } else
            System.out.println("Hey, where's Hank-44?");

        System.out.println("How was curling today?");
        System.out.println(robotNo * ramHybridNo);

        if (ramHybridNo == robotNo) {
            System.out.println("There's 4 Robots and 4 Ram Hybrids");
        } else
            System.out.println("There's a different number of Ram Hybrids and Robots");

        if (ramHybridNo < 37 && treeHybridNo < 37) {
            System.out.println("There are less than 37.");
        } else
            System.out.println("There's more than 37, or could be equal");

        if (ramHybridNo <= 5 || treeHybridNo > 37) {
            System.out.println("There are 5 Ram Hybrids.");
        } else
            System.out.println("There are more than 37 Tree Hybrids");

        System.out.println(robots[2] + " is great at fixing Telecasters. ");

        if (robots.length == 37) {
            System.out.println("There are 37 Robots.");
        } else
            System.out.println("There are 4 robots.");

        if (robots.length == 37 || trees.length == 5) {
            System.out.println("There are 5 Tree Hybrids");
        } else
            System.out.println("There are 37 robots");

        if (robots.length == 4 && rams.length == 4) {
            System.out.println("There are 4 Ram Hybrids and 4 Robots.");
        } else
            System.out.println("4 is not the number.");

        for (int i = 0; i < robots.length; i++) {
            System.out.println(robots[i]);
        }

        for (int i = 0; i < trees.length; i++) {
            if (trees[4] == "Jasper") {
                System.out.println("Jasper is a Tree Hybrid.");
            }
        }

        for (int i = 0; i < trout.length; i++) {
            System.out.println(trout[1]);
        }

        for (int i = 0; i < trout.length; i++) {
            System.out.println(trout[0]);
        }

        for (int i = 0; i < robots.length; i++) {
            if (robots[i] == "Hank-44") {
                System.out.println("What's up, Mellon-Tech?");
            }
            if (robots[i] == "Hank-44") {
                System.out.println("How's the curling stone, Hank-44?");
            } else
                System.out.println("How's the curling stone, Hank-44?");
        }

        for (int i = 0; i < robots.length; i++) {
            if (robots[i] == "Mellon-Tech") {
                System.out.println("What's up Mellon-Tech?");
            }
        }

        System.out.println(robots[3]);
        System.out.println(robots[2]);
        System.out.println(robots[1]);
        System.out.println(robots[0]);

        if (robots[0] == "Hank-44") {
            System.out.println("How was the curling match, Hank-44?");
        } else
            System.out.println("Wait, where is Warren-21?");

        for (int r = 0; r < robots.length; r++) {
            for (int m = r + 1; m < robots.length; m++) {
                if (robots[r] == "Warren-21" && robots[m] == "Warren-21") {
                    System.out.println("What is up Warren-21?");
                } else
                    System.out.println("Where is Warren-21");
            }
        }

        System.out.println(robots[3] + " is friends with " + rams[2]);


        if (rams[3] == "Stacey") {
            System.out.println(rams[3] + " is named after Stacey Peralta. ");
        } else
            System.out.println(rams[2] + " is named after Jays Adams. ");

        if (rams[0] == "Otto") {
            System.out.println("Whoops, that's not Otto. ");
        } else
            System.out.println(rams[1] + " is named after Otto Rocket. ");

        System.out.println(robots[2] + " is a mellon-head. ");

        if (robots[3] == "Hank-44" || robots[2] == "Hank-44") {
            System.out.println("There are 2 robots named " + robots[0]);
        } else if (robots[3] == "Eggplant-Head") {
            System.out.println("The robot's name is " + robots[3]);
        } else
            System.out.println("The Green Egg is awesome!");

        // for(int r = 0; r < robots.length; r++){
        //   while(robots[r] == "Warren-21"){
        //  System.out.println("How's the brisket, Warren-21?");
        //    }
        //  }

        int z = 0;

        while (z < 2) {
            System.out.println("Randall Park Mall.");
            z++;
        }

        int w = 0;

        while (w < robots.length) {
            System.out.println("These Robots fix guitars.");
            w++;
        }

        int s = 0;
        int t = 0;

        while (s < robots.length) {
            System.out.println("These Robots shred on the Telecaster.");
            s++;
            while (t < trees.length) {
                System.out.println("These Trees know high fashion.");
                t++;
            }
        }
        // interesting result from while loop

        int q = 0;
        int p = 0;

        while (q < rams.length) {
            System.out.println("These Rams go for it at the skate park");
            q++;
            while (p < trout.length) {
                System.out.println("These Trout are super resourceful");
                p++;
            }
        }
        // interesting result from while loop
        int u = 0;
        int v = 0;

        while (u < trees.length) {
            System.out.println("The Trees hang out in the Atrium");
            u++;
            while (v < robots.length) {
                System.out.println("The Robots were manufactured by Antibi");
                v++;

            }
        }

        System.out.println(trout[1] + " was incubated at Randall Park Mall");
        System.out.println((trout[0] + " loves to hang out at the movie theater."));

        double a1 = 37;
        double a2 = 12;
        double a3 = 9;

        System.out.println(a1 / a2);
        System.out.println(a3 / a2);
        System.out.println((a1 + a2) * a3);

        for (int i = 0; i < a2; i++) {
            System.out.println(a3 * a2);
        }

        if (robots[3] == "Eggplant-Head" || rams[0] == "Jay") {
            for (int r = 0; r < robots.length; r++) {
                System.out.println(robots[3] + " is an awesome Robot! ");
            }

        } else
            System.out.println(robots[0] + " is an awesome Robot!");

        if (robots[3] == "Mellon-Tech" || trees[0] == "Magnus") {
            for (int r = 0; t < trees.length; r++) {
                System.out.println("Wait... that's not Mellon-Tech");
            }
        } else
            System.out.println(robots[2] + " loves to play the guitar.");

        if (trees[1] == "Everett" || robots[0] == "Mellon-Tech") {
            for (int e = 0; e < robots.length; e++) {
                System.out.println(robots[0] + " is a great curler! ");
            }
        } else if (rams[0] == "Tony" && robots[0] == "Hank-44") {
            for (int i = 0; i < trees.length; i++) {
                System.out.println("The Tree Hybrids have great taste in teas");
            }
        } else
            for (int c = 0; c < rams.length; c++) {
                System.out.println("Where is the Randall Park Mall?");
            }

        for (int i = 9; i > trees.length; i--) {
            System.out.println(i);
        }

        for (int i = 9; i > trees.length; i--) {
            if (i == 9) {
                System.out.println(i);
            }
        }

        for (int i = 9; i > trees.length; i--) {
            if (i == 9) {
                System.out.println(i);
            }
        }

        for (int i = 7; i > rams.length; i--) {
            if (i == 7 || i == 6) {
                System.out.println(i);
            }
        }

        System.out.println(robots[2] + " is the man. ");

        if (robots.length == 3) {
            System.out.println(robots);
        } else
            System.out.println(robots[3]);

        if (robots.length == 4) {
            System.out.println(robots[0]);
        } else
            System.out.println(trees[4]);

        if (robots.length == 4 && trout.length == 2) {
            for (int i = 9; i > trout.length; i--) {
                if (i > trout.length) {
                    System.out.println(i);
                }
            }
        } else if (robots[0] == "Hank-44") {
            for (int i = 0; i < trees.length; i++) {
                if (i > trout.length) {
                    System.out.println(i);
                }
            }
        } else
            System.out.println("Hank-44");


        System.out.println(t);

        if (robots[2] == "Warren-21") {
            System.out.println("Green Egg");
        } else
            System.out.println(("How's the Green Egg, Warren-21?"));

        int t1 = 6;

        while (t1 > 3) {
            System.out.println(t1);
            t1--;
            for (int i = 0; i < t1; i++) {
                System.out.println(i);
            }
        }

        if (robots[0] == "Hank-44" || robots[2] == "Mellon-Tech") {
            System.out.println(trees[3] + " is a very fashionable Hybrid ");
            System.out.println((trees[2] + " is also a very fashionable Hybrid "));
        } else
            System.out.println(trees[3] + "soaks in the sun in the Atrium");

        if (trees[4] == "Magnus") {
            for (int i = 0; i < trees.length; i++) {
                if (trees[0] == "Cornelius") {
                    System.out.println(i);
                } else System.out.println("Magnus loves tea.");
            }


        } else
            System.out.println("Magnus loves Tea!");

        if (robots[0] == "Hank-44" && robots[2] == "Mellon-Tech") {
            for (int i = 0; i < robots.length; i++) {
                if (i == 3) {
                    System.out.println(i);
                    System.out.println("Mellon-Tech is the " + i + "rd Robot in the array.");
                } else
                    System.out.println("Eggplant-Head is awesome!");
            }
        } else
            System.out.println(robots[1]);

        if (robots[0] == "Hank-44") {
            System.out.println(robots[2]);
        }

        if (robots[2] == "Mellon-Tech" && robots[3] == "Eggplant-Head") {
            int g1 = 3;
            while (g1 < trees.length) {
                System.out.println(g1);
                g1++;
            }
        } else
            System.out.println("Mellon-Tech is the man!");

        if (trees[0] == "Cornelius") {
            System.out.println(trees.length * trout.length);
        } else
            System.out.println("Cornelius is very sophisticated.");

        System.out.println(trees[0] + " is a very sophisticated Tree Hybrid. ");

        String t2 = "Cornelius is a very sophisticated Tree Hybrid. ";

        if (rams[0] == "Tony") {
            int t3 = 5;
            while (t3 < 9) {
                System.out.println(t2);
                t3++;
            }
        }

        for (int i = 0; i < trees.length; i++) {
            if (i == 2) {
                System.out.println("The Trees gain wisdom in the Atrium.");
            } else
                System.out.println("The Trees drink tea at the Lao Hu Tea Lounge.");
        }

        if (trout.length != trees.length) {
            System.out.println("The Hybrids love popcorn");
        } else
            System.out.println("The Hybrids love to go to the movies.");

        if ("Mellon-Tech" == robots[2]) {
            for (int i = 0; i < trees.length; i++) {
                for (int j = 0; j < rams.length; j++) {
                    if (i == 1) {
                        System.out.println(trees[1]);
                    }
                    if (j == 1) {
                        System.out.println(rams[1]);
                    }

                }
            }
        } else
            System.out.println("The Hybrids live in the Randall Park Mall.");

        for (int i = 0; i < rams.length; i++) {
            System.out.println(rams[i]);
        }

        for (int i = 0; i < robots.length; i++) {
            System.out.println(robots[i]);
        }

        if (robots[2] == "Mellon-Tech" || robots[3] == "Eggplant-Head") {
            for (int i = 0; i < rams.length; i++) {
                System.out.println(rams[i]);
            }
            for (int i = 0; i < trout.length; i++) {
                System.out.println(trout[i]);
            }
        }

        if (rams[2] == "Stacey") {
            for (int i = 0; i < trout.length; i++) {
                System.out.println(rams[i]);
            }
        }

        if (rams[1] == "Otto") {
            for (int i = 2; i < rams.length; i++) {
                System.out.println(rams[i]);
            }
        }

        if (trees[0] == "Cornelius") {
            for (int i = 2; i < rams.length; i++) {
                System.out.println(trees[i]);
            }
        }

        if (trout[0] != "Rainbow" && trout[1] != "Brown") {
            System.out.println("The Trout are extremely resourceful.");
        } else if (trout[0] == "Rainbow" && trout[1] == "Brown") {
            for (int i = 0; i < trout.length; i++) {
                System.out.println(trout[i]);
            }
        } else
            System.out.println("The Trout are awesome!");

        System.out.println(trout[0] + " and " + trout[1] + " love the Bighorn River.");

        if (trout[0] == "Rainbow" && robots[2] == "Mellon-Tech") {
            for (int i = 0; i < trout.length; i++) {
                int t4 = 4;
                while (t4 > trout.length) {
                    System.out.println(trout[i]);
                    t4--;
                }
            }
        }

        if (robots[0] == "Hank-44") {
            System.out.println(robots[0] + " is the master of the Green Egg ");
        } else
            System.out.println("The Green Egg is the master of the Green Egg.");

        if (robots[1] != "Mellon-Tech") {
            for (int i = 0; i < trees.length; i++) {
                System.out.println("Hey, " + robots[2] + " , can you fix my guitar?");
            }
        }

        if (robots[1] != "Mellon-Tech") {
            for (int i = 0; i < robots.length; i++) {
                System.out.println("Hey, " + robots[i] + " , can you fix my guitar?");
            }
        }

        if (trees[0] == "Cornelius") {
            if (trees[0] == "Everett") {
                System.out.println("Hey, Everett!");
            } else
                System.out.println("What's going on. Everett!");
        } else
            System.out.println(trees[0] + ", how's it going?");

        // fizzBuzz
        int num1 = 15;

        if (num1 % 3 == 0 && num1 % 5 == 0) {
            System.out.println("RoboHybrid");
        } else if (num1 % 3 == 0) {
            System.out.println("Robo");
        } else if (num1 % 5 == 0) {
            System.out.println("Hybrid");
        } else
            System.out.println("Trout");
        // fizzBuzz


        if (robots.length % 2 == 0) {
            System.out.println("Hey, who's stratocaster is that?");
        } else
            System.out.println("Is that Bad Blake's guitar?");

        System.out.println("Mellon-Tech");

        System.out.println(robots[3]);

        if (robots.length == rams.length) {
            for (int i = 0; i < trees.length; i++) {
                int y2 = 5;
                while (y2 < 9) {
                    System.out.println(i);
                    y2++;
                }

            }
        }

        if (robots.length == rams.length) {
            for (int i = 0; i < trees.length; i++) {
                int y2 = 5;
                while (y2 < 9) {
                    System.out.println(trees[i]);
                    y2++;
                }
            }
        }

        if (robots.length == rams.length) {
            for (int i = 4; i > trees.length; i++) {
                System.out.println(trees[i]);

                int y2 = 5;
                while (y2 < 6) {
                    System.out.println(trees[i]);
                    y2++;
                }
            }
        }

        System.out.println(trout[0] + ", you are an awesome coder.");
        System.out.println(trees.length * rams.length * robots.length);

        if (robots[3] == "Eggplant-Head") {
            int y2 = 3;
            while (y2 < 5) {
                System.out.println(trees[y2]);
                y2++;
            }
        }

        if (robots[2] == "Mellon-Tech") {
            int y2 = 3;
            int y3 = 4;
            while (y3 < 5 && y2 < 4) {
                System.out.println(rams[y2]);
                System.out.println(trees[y3]);
                y2++;
                y3++;
            }
        }

        System.out.println("Incubator created " + trees[0] + " in the food court.");

        if (robots.length != trees.length && robots[2] == "Mellon-Tech") {
            for (int i = 4; i < trees.length; i++) {
                System.out.println(trees[i]);
            }
        }
        // will out put the last element in the trees array

        if (trees.length != 9 || "Eggplant-Head" == rams[3]) {
            for (int i = 0; i < robots.length; i++) {
                if (i < 1) {
                    System.out.println(robots[i]);
                }
            }
        }
        // print out first element in the array

        if (trees[4] != "KB") {
            for (int i = 0; i < trees.length; i++) {
                if (i < 1) {
                    System.out.println(trees[i] + " loves the tea at Lao Hu.");
                } else
                    System.out.println(trees[i] + " spends his mornings in the Atrium.");
            }
        }

        String t37 = "Hybrids Are Awesome!";

        // getBytes() method to convert string
        // into bytes[]
        byte[] strAsByteArray = t37.getBytes();

        byte[] result = new byte[strAsByteArray.length];

        for (int i = 0; i < strAsByteArray.length; i++) {
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];

            System.out.println(new String(result));
        }
        // not the best way to do this, doesn't reverse string in an efficient way

        if (robots[0] == "Hank-44" && robots[2] != "Lao Hu Tea Shop") {
            for (int i = 0; i < trees.length; i++) {
                if (i > 3) {
                    System.out.println(trees[i]);
                }
            }
        }

        if (trees.length * 2 == 10 && rams[0] == "Tony") {
            for (int i = 0; i < robots.length; i++) {
                if (i > 2) {
                    System.out.println(robots[i]);
                }
            }
        }
        // will out put 4 element in robots array

        if (trout.length * 2 != 37) {
            for (int i = 0; i < trout.length; i++) {
                if (i > 0) {
                    System.out.println(trout[i]);
                }
            }
        }

        if (rams[1] == "Otto") {
            for (int i = 0; i < trees.length; i++) {
                if (i > 2 && i < 4) {
                    System.out.println(trees[i]);
                }
            }
        }
        // isolating trees[3]

        if (trout[0] == "Rainbow" && trout[1] == "Brown") {
            for (int i = 0; i < trees.length; i++) {
                if (i > 0 && i < 4) {
                    System.out.println(trees[i]);
                }
            }
        }

        if (robots.length == 4) {
            System.out.println(robots[2] + " loves Pickerel Cola.");
        } else
            System.out.println(robots[3] + " loves Pickerel Cola.");

        if (robots.length == 4 && trout.length * 9 == 18) {
            int s7 = 1;
            while (s7 < 2) {
                System.out.println(trout[s7]);
                s7++;
            }
        }

        if (trees.length == 5) {
            int s6 = 4;
            while (s6 > 2) {
                System.out.println(trees[s6]);
                s6--;
            }
        }

        if (trees.length != robots.length) {
            int s6 = 4;
            while (s6 > 2) {
                System.out.println(trees[s6]);
                s6--;
                int s7 = 3;
                while (s7 > 1) {
                    System.out.println(robots[s7]);
                    s7--;
                    // will run 1 for each iteration of the parent loop
                    // so when the first element is iterated through in parent loop,
                    // the child while loop will iterate completely once
                    // then the second element of the parent loop will iterate through
                    // then the child loop will iterate through completely once again.
                }
            }
        }


        if (dachshunds[0] == "Beezer") {
            int d1 = 4;
            while (d1 > 2) {
                System.out.println(dachshunds[d1]);
                d1--;
                int t3 = 4;
                while (t3 > 2) {
                    System.out.println(trees[t3]);
                    t3--;
                    int r1 = 3;
                    while (r1 > 1) {
                        System.out.println(rams[r1]);
                        r1--;
                    }
                }
            }
        }

        System.out.println(dachshunds[0]);
        System.out.println(dachshunds[1]);
        System.out.println(dachshunds[2]);

        if (dachshunds[1] == "Chipper") {
            int d1 = 0;
            while (d1 < 1) {
                System.out.println(dachshunds[d1] + " loves to run in the country.");
                d1++;
                int d2 = 1;
                while (d2 < 2) {
                    System.out.println(dachshunds[d2] + " loves to hunt groundhogs.");
                    d2++;
                    int d3 = 2;
                    while (d3 < 3) {
                        System.out.println(dachshunds[d3] + " loves to play.");
                        d3++;
                    }
                }
            }
        }

        if (robots[0] == "Hank-44") {
            for (int i = 0; i < robots.length; i++) {
                if (i == 2) {
                    System.out.println(robots[i]);
                }

            }
        }

        if (robots[0] == "Hank-44") {
            for (int i = 0; i < robots.length; i++) {
                if (i == 2) {
                    System.out.println(robots[i]);
                } else
                    System.out.println(trees[i]);
            }
        }

        if (robots[2] == "Mellon-Tech" || trees.length != 25) {
            for (int i = 0; i < dachshunds.length; i++) {
                if (i == 2) {
                    System.out.println(dachshunds[i]);
                    for (int j = 0; j < dachshunds.length; j++) {
                        if (j == 1) {
                            System.out.println(dachshunds[j]);
                            for (int k = 0; k < dachshunds.length; k++) {
                                if (k == 0) {
                                    System.out.println(dachshunds[k]);
                                }
                            }
                        }
                    }
                }
            }
        }

        if (dachshunds.length == 5) {
            int d1 = 0;
            while (d1 < 0) {
                System.out.println(dachshunds[d1]);
                d1++;
                for (int d2 = 0; d2 < dachshunds.length; d2++) {
                    if (d2 == 1) {
                        System.out.println(dachshunds[d2]);
                        int d3 = 3;
                        while (d3 > 2) {
                            System.out.println(dachshunds[d3]);
                            d3--;
                            for (int d4 = 3; d4 < dachshunds.length; d4++) {
                                if (d4 == 3) {
                                    System.out.println(dachshunds[d4]);
                                    int d5 = 3;
                                    while (d5 < 4) {
                                        System.out.println(dachshunds[d5]);
                                        d5++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(dachshunds[2]);
        System.out.println(dachshunds[3]);
        System.out.println(dachshunds[4]);

        if(robots.length * 3 != 37){
            int d1 = 0;
            while(d1 < 1){
                System.out.println(dachshunds[d1]);
                d1++;
                for(int d2 = 0; d2 < dachshunds.length; d2++){
                    if(d2 == 1){
                        System.out.println(dachshunds[d2]);
                        int d3 = 2;
                        while(d3 < 3){
                            System.out.println(dachshunds[d3]);
                            d3++;
                            for(int d4 = 0; d4 < dachshunds.length; d4++){
                                if(d4 == 3){
                                    System.out.println(dachshunds[d4]);
                                    int d5 = 4;
                                    while(d5 < 5){
                                        System.out.println(dachshunds[d5]);
                                        d5++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        if(robots[2] == "Hank-44"){
            System.out.println(robots[2] + " loves to play the guitar.");
        }
        else if(robots[0] == "Hank-44"){
            System.out.println(robots[2] + " and " + robots[3] + " love Pickerel Cola.");
        }
        else
            System.out.println(robots[0] + " loves to grill on the Green Egg.");

        if(robots[0] == "Hank-44"){
            if(robots.length * dachshunds.length == 20){
                System.out.println(dachshunds[2] + " loves wubba games.");
                if(robots[2] == "Mellon-Tech"){
                    System.out.println(dachshunds[1] + " can be a little stubborn sometimes.");
                    if(robots[3] == "Eggplant-Head"){
                        System.out.println(robots[3] + " loves trips to the Minimart.");
                    }
                }
            }
        }

        if(robots.length * dachshunds.length == 20){
            System.out.println(robots[1] + " is an amazing curler.");
            if(37 == 36){
                System.out.println("Nouvelle Milwaukee");
            }
            else if(dachshunds[2] == "Bodhi"){
                System.out.println("Hey, " + robots[0] + ", cut me some slices of brisket.");
            }
        }

        if(robots[2] == "Mellon-Tech"){
            System.out.println(robots[2] + ", can you fix that Telecaster?");
        }

        if(dachshunds.length == 5){
            System.out.println(dachshunds[2] + ", do you want some popcorn?");
        }

        if(robots[2] == "Mellon-Tech" && robots[3] == "Eggplant-Head"){
            for(int r1 = 0; r1 < robots.length; r1++){
                if(r1 == 0){
                    System.out.println("How's the Green Egg doing, " + robots[r1] + "?");
                    int r2 = 1;
                    while(r2 < 2){
                        System.out.println("Nice curling shot, " + robots[r2] + "!");
                        r2++;
                        for(int r3 = 0; r3 < robots.length; r3++){
                            if(r3 == 2){
                                System.out.println("You're a guitar repair master, " + robots[2] + "!");
                                int r4 = 3;
                                while(r4 < 4){
                                    System.out.println("You drank the whole case of Pickerel Cola, " + robots[3] + "!?");
                                    r4++;
                                }
                            }
                        }
                    }
                }
            }
        }

       /* int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<=10); */

        if(robots.length == 4 || dachshunds.length == 9){
            int d1 = 0;
            do {
                System.out.println(dachshunds[d1]);
                d1++;
            } while(d1 < 5);

         }
        // iterate and print through each element of dachshunds array

        if (robots.length == 4 || dachshunds.length == 9) {
            int d1 = 4;
            do {
                System.out.println(dachshunds[d1]);
                d1--;
            } while(d1 >= 0);
        }
        // iterate and print backwards through dachshunds array


    }
}

