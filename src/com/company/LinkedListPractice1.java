package com.company;

import java.util.LinkedList;

public class LinkedListPractice1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.addLast(30);

        System.out.println(list);
        // [10, 20, 30]
        // this is LinkedList, not an array despite the square brackets
        list.addFirst(37);
        System.out.println(list);
        // [37, 10, 20, 30]
    }
}
