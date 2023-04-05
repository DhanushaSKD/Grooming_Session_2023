package com.dhanusha.Collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapOperations {

    public static HashMap<Integer,String> sortByValue(Map<Integer,String> colors) {

        List<Map.Entry<Integer,String>> list = new LinkedList<Map.Entry<Integer,String>>(colors.entrySet());

        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2)   
            {  
              return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());  
            }  
        });

        HashMap<Integer,String> lmap = new LinkedHashMap<Integer,String>();

        Iterator<Map.Entry<Integer,String>> it = list.iterator();

        while(it.hasNext()) {
            Map.Entry<Integer,String> m = (Map.Entry<Integer,String>)it.next(); 
            lmap.put(m.getKey(), m.getValue());
        }

        return lmap;
    }

    public static void main(String[] args) {
        

        Map<Integer,String> colors = new HashMap<Integer,String>();

        colors.put(12, "blue");
        colors.put(9,"green");
        colors.put(32,"orange");
        colors.put(27,"yellow");
        colors.put(5,"red");

        System.out.println("Iterating map before sorting...");

        for(Map.Entry<Integer,String> m: colors.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }

        // Map<Integer,String> map = sortByValue(colors);

        // System.out.println("Iterating map after sorting by values...");

        System.out.println("Iterating map after sorting by keys...");

        Map<Integer,String> map = new TreeMap<>(colors);

        for(Map.Entry<Integer,String> m: map.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
    
}
