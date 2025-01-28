package com.wgdevelopment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
       // LinkedList<GenericTypes aka "E">
       // LinkedList<Integer> list = new LinkedList<>() OR
       // omit the generic type and node value can hold anything.
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(5);
        list.removeLast();
        list.removeFirst();
        list.remove(0);
        System.out.println(list.contains(10));
        list.indexOf(30);
        System.out.println(list);
        System.out.println(list.size());
        var array = list.toArray();
        System.out.println(Arrays.toString(array));
        System.out.println(list.getClass());
        System.out.println(array.getClass());
    }
}