package com.company;

import java.util.Arrays;
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
        System.out.println(list.contains(37));
        // true
        System.out.println(list.indexOf(37));
        // 0
        System.out.println(list.size());
        // 4
        var array = list.toArray();
        for (java.lang.Object arrays: array){
            System.out.println(arrays);
        }
        System.out.println(Arrays.toString(array));
        // [37, 10, 20, 30]
    }
}
