package com.dhanusha.program4;

public class Main {
    public static void main (String[] agrs) {

        State obj1 = new State();
        obj1.name();
        State obj2 = new City();
        obj2.name();

        City obj3 = new City();
        obj3.own("Agri University");
        obj3.own("PSG College", "CIT College");
        
    }
    
}
