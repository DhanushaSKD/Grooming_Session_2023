package com.dhanusha.program4;

public class City extends State{ 
    public void name() {
        System.out.println("City: Coimbatore");
    }

    public void own(String college) {
        System.out.println("I own "+college+".");
    }

    public void own(String college1, String college2) {
        System.out.println("I own "+college1+" and "+college2+".");
    }
    
}
