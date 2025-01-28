package com.wgdevelopment;

public class Main {
    public static void main(String[] args) {
      var list = new LinkedList();
      list.addLast(10);
      list.addLast(20);
      list.addLast(30);
      list.addFirst(5);
        System.out.println(list.indexOf(30));
        System.out.println(list.indexOf(20));
        System.out.println(list.indexOf(10));
        System.out.println(list.indexOf(5));
        System.out.println(list.indexOf(200));
        System.out.println(list.contains(300));
        System.out.println(list.contains(30));
    }
}