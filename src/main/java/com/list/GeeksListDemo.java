package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GeeksListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Pinapple");
        list.add("Watermelon");

        Collections.addAll(list,"Mango","Grapes");

        for (int i =0;i<list.size();i++)

        System.out.println(list.get(i)+" ");

       System.out.println("After Reversing list");

      Collections.sort(list,Collections.reverseOrder());
      for (int i=0;i<list.size();i++)
          System.out.print(list.get(i) +",");

      System.out.println();
      List<String > list1 = new ArrayList<>();
      list1.add("TV");
      list1.add("Dish");
      list1.add("Table");
      list1.add("Watch");

      System.out.println("Searching element in list" + list1);

      System.out.println(Collections.binarySearch(list1,"Watch" ));

      System.out.println("Copy list 1 into list ");
      Collections.copy(list,list1);

      for (int i =0; i< list.size();i++)
          System.out.println(list.get(i) +" ,");
    }


}
