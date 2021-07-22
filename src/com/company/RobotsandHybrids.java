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
            if(robots[i] == "Hank-44") {
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

        System.out.println(robots[3]);
        System.out.println(robots[2]);
        System.out.println(robots[1]);
        System.out.println(robots[0]);

        if (robots[0] == "Hank-44") {
            System.out.println("How was the curling match, Hank-44?");
        }
        else
            System.out.println("Wait, where is Warren-21?");

        for( int r = 0; r < robots.length; r++) {
            for(int m = r + 1; m < robots.length;  m++) {
                if(robots[r] == "Warren-21" && robots[m] == "Warren-21") {
                    System.out.println("What is up Warren-21?");
                }
                else
                    System.out.println("Where is Warren-21");
            }
        }

        System.out.println(robots[3] + " is friends with " + rams[2]);


        if(rams[3] == "Stacey"){
            System.out.println(rams[3] + " is named after Stacey Peralta. ");
        }
        else
            System.out.println(rams[2] + " is named after Jays Adams. ");

        if(rams[0] == "Otto"){
            System.out.println("Whoops, that's not Otto. ");
        }
        else
            System.out.println(rams[1] + " is named after Otto Rocket. ");

        System.out.println(robots[2] + " is a mellon-head. ");

        if(robots[3] == "Hank-44" || robots[2] == "Hank-44") {
            System.out.println("There are 2 robots named " + robots[0]);
        }
        else if(robots[3] == "Eggplant-Head") {
            System.out.println("The robot's name is " + robots[3]);
        }
        else
            System.out.println("The Green Egg is awesome!");

       // for(int r = 0; r < robots.length; r++){
         //   while(robots[r] == "Warren-21"){
              //  System.out.println("How's the brisket, Warren-21?");
        //    }
      //  }

        int z = 0;

        while(z < 2){
                System.out.println("Randall Park Mall.");
                z ++;
            }

        int w = 0;

        while(w < robots.length){
            System.out.println("These Robots fix guitars.");
            w++;
        }

        int s = 0;
        int t = 0;

        while(s < robots.length){
            System.out.println("These Robots shred on the Telecaster.");
            s++;
            while(t < trees.length){
                System.out.println("These Trees know high fashion.");
                t++;
            }
        }
        // interesting result from while loop

       int q = 0;
        int p = 0;

        while(q < rams.length){
            System.out.println("These Rams go for it at the skate park");
            q++;
            while(p < trout.length){
                System.out.println("These Trout are super resourceful");
                p++;
            }
        }
        // interesting result from while loop
        int u = 0;
        int v = 0;

        while(u < trees.length){
            System.out.println("The Trees hang out in the Atrium");
            u++;
            while( v < robots.length){
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

        for(int i = 0; i < a2; i++){
            System.out.println(a3 * a2);
        }

        if(robots[3] == "Eggplant-Head" || rams[0] == "Jay"){
            for(int r = 0; r < robots.length; r++){
                System.out.println(robots[3] + " is an awesome Robot! ");
            }

        }
        else
            System.out.println(robots[0] + " is an awesome Robot!");

        if(robots[3] == "Mellon-Tech" || trees[0] == "Magnus"){
            for(int r = 0; t < trees.length; r++){
                System.out.println("Wait... that's not Mellon-Tech");
            }
        }
        else
            System.out.println(robots[2] + " loves to play the guitar.");

        if(trees[1] == "Everett" || robots[0] == "Mellon-Tech"){
            for(int e = 0; e < robots.length; e++){
                System.out.println(robots[0] + " is a great curler! ");
            }
        }
        else if(rams[0] == "Tony" && robots[0] == "Hank-44"){
            for(int i = 0; i < trees.length; i++){
                System.out.println("The Tree Hybrids have great taste in teas");
            }
        }
        else
            for(int c = 0; c < rams.length; c++){
                System.out.println("Where is the Randall Park Mall?");
            }

            for(int i = 9; i > trees.length; i--){
                System.out.println(i);
            }

            for(int i = 9; i > trees.length; i--){
                if(i == 9){
                    System.out.println(i);
                }
            }

            for(int i = 9; i > trees.length; i--){
                if(i == 9){
                    System.out.println(i);
                }
            }

            for(int i = 7; i > rams.length; i--){
                if(i == 7 || i == 6){
                    System.out.println(i);
                }
            }

        System.out.println(robots[2] + " is the man. ");

        if (robots.length == 3) {
            System.out.println(robots);
        }
        else
            System.out.println(robots[3]);

        if (robots.length == 4) {
            System.out.println(robots[0]);
        }
        else
            System.out.println(trees[4]);

        if(robots.length == 4 && trout.length == 2) {
            for(int i = 9; i > trout.length; i--) {
                if(i > trout.length){
                    System.out.println(i);
                }
            }
        }
        else if(robots[0] == "Hank-44"){
            for(int i = 0; i < trees.length; i++){
                if(i > trout.length){
                    System.out.println(i);
                }
            }
        }
        else
            System.out.println("Hank-44");


        System.out.println(t);

        if(robots[2] == "Warren-21") {
            System.out.println("Green Egg");
        }
        else
            System.out.println(("How's the Green Egg, Warren-21?"));

        int t1 = 6;

        while(t1 > 3){
            System.out.println(t1);
            t1--;
            for(int i = 0; i < t1; i++){
                System.out.println(i);
            }
        }

        if (robots[0] == "Hank-44" || robots[2] == "Mellon-Tech"){
            System.out.println(trees[3] + " is a very fashionable Hybrid ");
            System.out.println((trees[2] + " is also a very fashionable Hybrid "));
        }
        else
            System.out.println(trees[3] + "soaks in the sun in the Atrium");

        if(trees[4] == "Magnus"){
            for(int i = 0; i < trees.length; i++){
                if(trees[0] == "Cornelius"){
                    System.out.println(i);
                }
                else System.out.println("Magnus loves tea.");
            }



        }
        else
            System.out.println("Magnus loves Tea!");

        if(robots[0] == "Hank-44" && robots[2] == "Mellon-Tech"){
            for(int i = 0; i < robots.length; i++){
                if(i == 3){
                    System.out.println(i);
                    System.out.println("Mellon-Tech is the " + i + "rd Robot in the array.");
                }
                else
                    System.out.println("Eggplant-Head is awesome!");
            }
        }
        else
            System.out.println(robots[1]);

        if(robots[0] == "Hank-44"){
            System.out.println(robots[2]);
        }

        if(robots[2] == "Mellon-Tech" && robots[3] == "Eggplant-Head"){
            int g1 = 3;
            while(g1 < trees.length){
                System.out.println(g1);
                g1++;
            }
        }
        else
            System.out.println("Mellon-Tech is the man!");

        if (trees[0] == "Cornelius"){
            System.out.println(trees.length * trout.length);
        }
        else
            System.out.println("Cornelius is very sophisticated.");

        System.out.println(trees[0] + " is a very sophisticated Tree Hybrid. ");

        String t2 = "Cornelius is a very sophisticated Tree Hybrid. ";

        if(rams[0] == "Tony"){
            int t3 = 5;
            while(t3 < 9){
                System.out.println(t2);
                t3++;
            }
        }

        for(int i = 0; i < trees.length; i++){
            if(i == 2){
                System.out.println("The Trees gain wisdom in the Atrium.");
            }
            else
                System.out.println("The Trees drink tea at the Lao Hu Tea Lounge.");
        }

        if(trout.length != trees.length){
            System.out.println("The Hybrids love popcorn");
        }
        else
            System.out.println("The Hybrids love to go to the movies.");

        if("Mellon-Tech" == robots[2]){
            for(int i = 0; i < trees.length; i++){
                for(int j = 0; j < rams.length; j++){
                    if(i == 1){
                        System.out.println(trees[1]);
                    }
                    if (j == 1){
                        System.out.println(rams[1]);
                    }

                }
            }
        }
        else
            System.out.println("The Hybrids live in the Randall Park Mall.");

        for(int i = 0; i < rams.length; i++){
            System.out.println(rams[i]);
        }

        for(int i = 0; i < robots.length; i++){
            System.out.println(robots[i]);
        }

        if(robots[2] == "Mellon-Tech" || robots[3] == "Eggplant-Head"){
            for(int i = 0; i < rams.length; i++){
                System.out.println(rams[i]);
            }
            for(int i = 0; i < trout.length; i++){
                System.out.println(trout[i]);
            }
        }

        if(rams[2] == "Stacey"){
            for(int i = 0; i < trout.length; i++){
                System.out.println(rams[i]);
            }
        }

        if(rams[1] == "Otto"){
            for(int i = 2; i < rams.length; i++){
                System.out.println(rams[i]);
            }
        }



        }
    }

