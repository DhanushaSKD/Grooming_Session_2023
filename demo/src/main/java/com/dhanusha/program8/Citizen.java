package com.dhanusha.program8;

final class Citizen {

    private final long aadharNo;

    private final String name;

    Citizen(long aadharNo, String name) {
        this.aadharNo = aadharNo;
        this.name = name;
    }

    public long getAadharNo() {
        return aadharNo;
    }

    public String getName() {
        return name;
    }

}

//Citizen class is immutable it cannot be inherited.
// class Person extends Citizen{

// }
