package com.queue;

import java.util.PriorityQueue;

public class PriorityQueneDemo {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("Java");
        queue.add("React");
        queue.add("DotNet");
        queue.add("Angular");

        System.out.println("Priority queue is "+queue);
        System.out.println("Top element in priority queue is "+queue.peek());
        System.out.println("Priority queue is "+queue);

        System.out.println(queue.poll());

        System.out.println("Priority queue is "+queue);

        System.out.println(queue.peek());
        System.out.println("Priority queue is "+queue);

    }
}
