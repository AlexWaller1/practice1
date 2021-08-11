package com.company;

public class AddArrayDigits {
    public int digitSum(int num){
        int sum = 0;
        while(num > 0){
            sum = sum + num % 10;
            num = num /10;
        }
        return sum;
    }
}
