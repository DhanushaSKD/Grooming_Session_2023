package com.dhanusha.program8;

public class App {

    public static void main(String[] args) {

        Citizen citizen1 = new Citizen(432187659090L, "Dhanusha");

        citizen1.show();

        // citizen1.aadharNo = 123456789090L;       //error - final variable

        // citizen1.name = "Dhanu";                 //error - private variable

    }
    
}
