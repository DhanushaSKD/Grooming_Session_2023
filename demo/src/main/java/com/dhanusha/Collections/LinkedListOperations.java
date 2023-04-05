package com.dhanusha.Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListOperations {

    public static void main(String[] args) {
        
        LinkedList<Person> list = new LinkedList<Person>();

        Person p1 = new Person("Dhanu",22);

        Person p2 = new Person("Anu",32);

        Person p3 = new Person("Aadhi",45);

        list.add(p1);

        list.add(p2);

        list.add(p3);

        System.out.println("\nIterating LinkedList in reverse order...");

        Iterator<Person> dIt = list.descendingIterator();

        // int count = list.size();

        while(dIt.hasNext()) {
         Person p = dIt.next();
         System.out.println("\nId: "+p.id+"\nName: "+p.name+"\nAge: "+p.age);
         //count--;
        }

        list.addLast(p1);

        list.addFirst(p2);

        Person p4 = new Person("Durai",55);

        list.offer(p4);

        System.out.println("\nIterating LinkedList...");

        Iterator<Person> it = list.iterator();

        //count = 0;

        while(it.hasNext()) {
         Person p = it.next();
         System.out.println("\nId: "+p.id+"\nName: "+p.name+"\nAge: "+p.age);
         //count++;
        }

        System.out.println("\nIndex of first occurrence of Person named 'Dhanu': "+ list.indexOf(p1));

        System.out.println("\nIndex of last occurrence of Person named 'Anu': "+ list.lastIndexOf(p2));

    }
    
}

class Person {

    static int count;

    int id;

    String name;

    int age;

    Person(String name, int age) {

        this.name = name;
        this.age = age;
        count++;
        this.id = count;
    }
}