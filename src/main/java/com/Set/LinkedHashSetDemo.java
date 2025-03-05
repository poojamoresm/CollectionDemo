package com.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Java");
        linkedHashSet.add("Programming");
        linkedHashSet.add("Language");
        linkedHashSet.add("For Learning");

        Iterator<String> iterator = linkedHashSet.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

        linkedHashSet.remove("Java");
        System.out.println(linkedHashSet);
    }
}
