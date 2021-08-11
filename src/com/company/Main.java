package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var newClass = new practice();
        var newFolder = new DachshundClass();
        int[] numbers = {37, 23, 18};
        // addArrayDigits(numbers);
        System.out.println("Hello");
        System.out.println("Beezer");
        System.out.println("Bodhi");
        System.out.println("Chipper");

        var list = addArrayDigits(numbers);

    }

    public static ArrayList<Integer> addArrayDigits(int[] numbers){
        var list = new ArrayList<Integer>();
        for(int num: numbers){
         var result =   digitSum(num);
            System.out.println(result);
            list.add(result);
        }
        return list;
    }
    public static int digitSum(int num){
        int sum = 0;
        while(num > 0){
            sum = sum + num % 10;
            num = num /10;
        }
        return sum;
    }
}


