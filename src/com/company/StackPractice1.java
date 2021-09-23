package com.company;

import java.util.Stack;

public class StackPractice1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        // [10, 20, 30]
        var top = stack.pop();
        System.out.println(top);
        // 30
        System.out.println(stack);
        // [10, 20]
        top = stack.peek();
        System.out.println(top);
        // 20
        // stacks are great when asked to complete a task in reverse order

    }
}
