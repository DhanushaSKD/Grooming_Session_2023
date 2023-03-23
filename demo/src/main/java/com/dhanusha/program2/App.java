package com.dhanusha.program2;
import com.dhanusha.program2.students.*;

public class App {
    public static void main(String args[]) {

        Student stud = new Student();

        // It gives error since studId is a private field in Student class. It cannot be accessed outside the class.
        // stud.studId = 12345;      
        // It gives error since deptId is a protected field in Department class. It cannot be accessed outside the package and it's non-subclass.    
        // stud.deptId = 100001;             

        //All setter methods are public.
        stud.setStudId(12345);
        stud.setStudName("Dhanusha");
        stud.setDeptId(100001);
        stud.setDeptName("Computer Science");

        stud.display();
    }
    
}
