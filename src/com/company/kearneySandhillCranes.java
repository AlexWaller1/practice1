package com.company;

public class kearneySandhillCranes {
    public String sandHillCraneMigration(String[] cranes){
        String sandHillCrane1 = "";
        String sandHillCrane2 = "";
        String sandHillCrane3 = "";
        for(int crane1 = 0; crane1 < cranes.length; crane1++){
            sandHillCrane1 = cranes[crane1];
            if(sandHillCrane1.chars().count() > 6){
                sandHillCrane2 = sandHillCrane1 + " loves Pickerel Cola!";
            }
            else
                sandHillCrane2 = sandHillCrane1 + " loves St.X Jerky";
        }
        return sandHillCrane2;
    }
}
