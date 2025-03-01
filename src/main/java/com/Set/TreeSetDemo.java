package com.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i =1;i<=10;i++)
            treeSet.add(i);

        Iterator<Integer> iterator = treeSet.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
