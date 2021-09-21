package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayPractice5 {
    public static void main(String[] args) {
        // two types of special arrays in java called Vector and LinkedList
        // Vector: grows by 100% when full - synchronized
        // ArrayList: grows 50% when full
        ArrayList<Integer> list = new ArrayList<>();
        list.add(37);
        list.add(44);
        list.add(22);
        System.out.println(list);
        // [37, 44, 22]
        list.remove(2);
        System.out.println(list);
        // [37, 44]
        list.indexOf(0);
        System.out.println(list);
        // [37, 44]
        System.out.println(list.indexOf(37));
        // 0
        System.out.println(list.indexOf(44));
        // 1
        System.out.println(list.contains(37));
        // true
        System.out.println(list.contains(45));
        // false


    }
}
