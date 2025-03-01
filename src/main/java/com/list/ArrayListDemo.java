package com.list;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i =1 ; i <= 10; i++)
            arrayList.add(i);

        System.out.println(arrayList);
        arrayList.remove(3);
        System.out.println(arrayList);
    }
}
