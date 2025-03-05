package com.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.add("First");
        deque.addFirst("Added First");
        deque.addLast("Added last");

        System.out.println(deque);
        deque.removeFirst();
        System.out.println("After using removeFirst "+deque);

        Iterator<String> itr = deque.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

        System.out.println(deque);
        deque.pop();
        System.out.println("After pop method" +deque);

        Deque<String> deque1 = new ArrayDeque<>();
        deque1.add("deOne");
        deque1.add("deTwo");
        deque1.add("deThree");
        deque1.add("deFour");
        System.out.println("Second Deque" +deque1);

        deque1.pop();
        System.out.println("After pop Deque" +deque1);

        deque1.addLast("Deque Last");
        System.out.println("After adding  "+deque1);
        deque1.pop();
        System.out.println("After pop "+deque1);

        deque1.poll();
        System.out.println("After poll "+deque1);
    }
}
