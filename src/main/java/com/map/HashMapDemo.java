package com.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"C");
        hashMap.put(2,"C++");
        hashMap.put(3,"Java");
        hashMap.put(4,"Dot Net");

        System.out.println(hashMap.get(3));
        for (Map.Entry<Integer, String> map : hashMap.entrySet())
            System.out.println("Key of map is "+map.getKey() +"Value of map is " +map.getValue());
    }
}
