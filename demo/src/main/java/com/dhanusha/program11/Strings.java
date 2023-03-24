package com.dhanusha.program11;

public class Strings {

    public static void main(String[] args) {

        System.out.println(new StringBuffer().capacity());

        StringBuffer s1 = new StringBuffer("Hello ");

        System.out.println(s1.append("World"));

        System.out.println(s1.capacity());      

        StringBuilder s2 = new StringBuilder(s1);

        System.out.println(s2.append("!!!"));

        System.out.println(s2.insert(6,"Java "));

        System.out.println(s2.replace(6, 11, "Python "));

        System.out.println(s2.delete(6, 13));

        System.out.println(s2.capacity());

    }
    
}
