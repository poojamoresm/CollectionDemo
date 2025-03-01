package com.queue;

import java.util.ArrayDeque;

public class ArrayDequedemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        for (int i =1;i<=10;i++)
            arrayDeque.add(i);
        System.out.println(arrayDeque);
        arrayDeque.addLast(30);
        System.out.println(arrayDeque);

        arrayDeque.clear();
        System.out.println(arrayDeque);

        arrayDeque.addFirst(50);
        System.out.println(arrayDeque);
    }
}
