package com.dhanusha.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashSetOperations {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();

        list1.add(31);
        list1.add(100);
        list1.add(56);
        list1.add(48);
        list1.add(100);
        list1.add(21);

        Set<Integer> set1 = new HashSet<Integer>(list1);
        
        // HashSet<Integer> set1 = new HashSet<Integer>(list1);

        System.out.println("set1: "+set1+" of size "+set1.size());

        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list2.add(21);
        list2.add(31);
        list2.add(100);
        list2.add(48);
        list2.add(48);
        list2.add(100);

        Set<Integer> set2 = new HashSet<Integer>(list2);

        // HashSet<Integer> set2 = new HashSet<Integer>();
   
        // set2 = (HashSet)set1.clone();

        System.out.println("set2: "+set2+" of size "+set2.size());

        if(set1.equals(set2)) {
            System.out.println("Two sets are similar...");
        }
        else {
            System.out.println("Two sets differ...");
        }
        
    }
    
}
