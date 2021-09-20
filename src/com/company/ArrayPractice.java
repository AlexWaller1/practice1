package com.company;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args){
        int[] numbers = new int[3];
        // 3 is the length of the array
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        System.out.println(Arrays.toString(numbers));
        // [0, 0, 0]
        // all elements in numerical array are initialized to zero
        // [10, 20, 30]
        int[] numbers2 = {10, 20, 30};
        System.out.println(Arrays.toString(numbers2));
        // [10, 20, 30]
        System.out.println(numbers.length);
        // 3
        System.out.println(numbers2.length);
        // 3
    }
}
