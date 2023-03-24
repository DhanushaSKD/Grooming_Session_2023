package com.dhanusha.program8;

final class Citizen {

    final long aadharNo;

    private String name;

    Citizen(long aadharNo, String name) {
        this.aadharNo = aadharNo;
        this.name = name;
    }

    void show() {
        System.out.println("Citizen Name: "+name+", Aadhar Number: "+aadharNo);
    }
    
}

//Citizen class is immutable it cannot be inherited.
// class Person extends Citizen{

// }
