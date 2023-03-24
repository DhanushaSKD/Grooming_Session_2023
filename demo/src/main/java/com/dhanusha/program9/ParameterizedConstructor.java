package com.dhanusha.program9;

public class ParameterizedConstructor {

    int value;

    String text;

    ParameterizedConstructor(int value, String text) {                  //parameterized constructor
        this.value = value;
        this.text = text;
    }

    ParameterizedConstructor(ParameterizedConstructor object) {         //constructor overloading
        this.value = object.value;
        this.text = object.text;
    }

    public void show() {
        System.out.println("Text: "+text+", Value: "+value);
    }

    public static void main(String[] agrs) {

        ParameterizedConstructor object = new ParameterizedConstructor(123,"Hello");

        object.show();

        ParameterizedConstructor object1 = new ParameterizedConstructor(object);                //copying object

        object1.show();

    }
    
}
