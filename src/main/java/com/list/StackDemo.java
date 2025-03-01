package com.list;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i =1; i<=10;i++)
            stack.add(i);

        System.out.println(stack);

        stack.push(3);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
    }
}
