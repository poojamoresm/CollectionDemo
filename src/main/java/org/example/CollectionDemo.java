package org.example;


import java.util.Hashtable;
import java.util.Vector;

public class CollectionDemo {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        Vector<Integer> vector = new Vector<>();
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);

        hashtable.put(1,"Hashtable1");
        hashtable.put(2,"Hashtable2");

        System.out.println(arr[1]);
        System.out.println(vector);
        System.out.println(hashtable);
    }
}
