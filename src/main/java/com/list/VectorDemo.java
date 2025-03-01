package com.list;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        for(int i =1;i<=10;i++)
            vector.add(i);
        System.out.println(vector);

        vector.remove(5);
        System.out.println(vector);

        System.out.println("Vector capacity is " +vector.capacity());
    }
}
