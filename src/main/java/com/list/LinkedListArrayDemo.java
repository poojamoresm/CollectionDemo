package com.list;

import java.util.LinkedList;

public class LinkedListArrayDemo {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);

        System.out.println(linkedList);
        linkedList.addLast(60);
        linkedList.get(5);

        System.out.println(linkedList);

        System.out.println("Size is " +linkedList.size());

        linkedList.removeLast();
        System.out.println(linkedList);

        linkedList.removeFirst();
        System.out.println(linkedList);
    }
}
