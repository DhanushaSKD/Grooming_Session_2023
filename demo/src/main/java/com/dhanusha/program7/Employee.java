package com.dhanusha.program7;

public class Employee {

    private long id;

    private String name;

    static String company;                          //static variable

    static {                                        //static block initializes static variable.
        company = "Publicis Sapient";
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    static String getCompany() {
        // return name;                             //gives error since static method cannot use non-static field.
        return company;
    }

    static class Address {

        // int no = 1;

        public String getArea() {
            // getCompany();                        //works since static member can be accessed inside the static class.
            // getName();                           //does not work since non-static member cannot be accessed.
            // no = 10;
            return "Marathahali";
        }

        public String getCity() {
            return "Bengaluru";
        }
    }
}
