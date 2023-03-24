package com.dhanusha.program9;

public class DefaultConstructor {

    int value;

    String text;

    DefaultConstructor() {
        System.out.println("Text: "+text+", Value: "+value);            //default constructor provides default values
    }

    public static void main(String[] args) {
        new DefaultConstructor();
    }
    
}
