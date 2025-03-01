package com.Collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<Integer>(5);
        collection.add(2);
        collection.add(3);
        collection.add(4);
        collection.add(5);

        for (Integer i : collection)
        System.out.println("Collection after adding new integer"+i);

        Collection<Integer> collection1 = new ArrayList<Integer>();
        collection1.add(20);
        collection1.add(30);

        collection1.addAll(collection);
        System.out.println(collection1);

    }
}
