package com.dhanusha.program2.students;

import com.dhanusha.program2.departments.*;;

public class Student extends Department {

    private long studId;

    private String studName;

    public void setStudId (long id) {
        studId = id;
    }

    public void setStudName (String name) {
        studName = name;
    }

    public void display() {
        System.out.println("I am "+studName+". My Id is "+studId+".");
        System.out.println("I am from "+deptName+" department. My Department Id is "+deptId+".");     //It works since fields in department class are protected and it is accessed in its subclass.
    }
    
}
