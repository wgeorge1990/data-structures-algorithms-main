package com.wgdevelopment;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
// ArrayList: 50% grow for resize - non synchronized
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        System.out.println(list);
//        list.remove(2);
//        System.out.println(list);
//        list.lastIndexOf(list);
//        System.out.println(list);
//        System.out.println(list.contains(1));
//        System.out.println(list.size());
//        list.toArray();
        Array numbers = new Array(3);
        numbers.insert(1);
        numbers.insert(2);
        numbers.insert(3);
        numbers.insert(40);
        numbers.insert(5);

        Array numbers2 = new Array(3);
        numbers2.insert(1);
        numbers2.insert(2);
        numbers2.insert(3);

        numbers.intersect(numbers2).print();

    }
}