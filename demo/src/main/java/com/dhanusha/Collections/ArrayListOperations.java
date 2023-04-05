package com.dhanusha.Collections;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListOperations {

    public static void addOperations(List<String> list) {

        list.add("blue");
        list.add("green");
        list.add("orange");

        System.out.println("\nAfter adding elements in an array: "+list);

        list.add(1,"red");

        System.out.println("\nAfter adding an element in an index 1 of an array: "+list);

        ArrayList<String> list1 = new ArrayList<String>();

        list1.add("black");
        list1.add("white");

        list.addAll(list1);

        System.out.println("\nAfter adding a list to an array: "+list);

        ArrayList<String> list2 = new ArrayList<String>();

        list2.add("yellow");
        list2.add("purple");

        list.addAll(2,list2);

        System.out.println("\nAfter adding a list in an index 2 of an array: "+list);

    }

    public static void removeOperations(List<String> list) {

        list.remove("red");

        System.out.println("\nAfter removing an element from an array: "+list);

        list.remove(3);

        System.out.println("\nAfter removing an element of index 3 from an array: "+list);

        ArrayList<String> list1 = new ArrayList<String>();

        list1.add("black");
        list1.add("white");

        list.removeAll(list1);

        System.out.println("\nAfter removing a list from an array: "+list);

        //list.clear();

        //System.out.println("\nAfter removing all elements from an array: "+list);

    }

    public static void retriveOperations(List<String> list) {

        System.out.println("\nIterating using Iterator Interface: ");

        Iterator<String> it = list.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\nIterating using for-each loop: ");

        for(String color: list) {
            System.out.println(color);
        }

        System.out.println("\nIterating in reverse order using ListIterator: ");

        ListIterator<String> lit = list.listIterator(list.size());

        while(lit.hasPrevious()) {
            System.out.println(lit.previous());
        }

        System.out.println("\nIterating in reverse order using for loop: ");

        for(int i=list.size()-1; i>=0; i--) {
            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {
        
       List<String> list = new ArrayList<String>();

       System.out.println("Initial array: "+list);

       addOperations(list);

       removeOperations(list);

       retriveOperations(list);

       Collections.sort(list);

       System.out.println("\nSorted Array: "+list);

    }
    
}
