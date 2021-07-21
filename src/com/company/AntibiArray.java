package com.company;

public class AntibiArray {


public static void main(String[] args) {


            int[] nums = {2, 7, 11, 15};
            int target = 9;


                for (int i = 0; i < nums.length; i++) {
                    // i will increment for for every spot in the nums array
                    for (int j = i + 1; j < nums.length; j++) {
                        // will give us access to spot after in the array
                        // so we can subtract i from j and potentially find a match for target
                        if (nums[j] == target - nums[i]) {
                            System.out.println(new int[] {i,j});
                        }
                    }
                }
                // In case there is no solution, we'll just return null
    System.out.println("null");
            }


}
