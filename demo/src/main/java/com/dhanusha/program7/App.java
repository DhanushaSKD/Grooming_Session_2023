package com.dhanusha.program7;

public class App {

    public static void main(String[] agrs) {

        Employee employee = new Employee();
        employee.setId(100001);
        employee.setName("Dhanusha");

        Employee.Address address = new Employee.Address();

        System.out.println("Name: "+employee.getName()+"\n"+"Employee Id: "+employee.getId());
        System.out.println("Company: "+Employee.getCompany()+"\n"+"Address: "+address.getArea()+", "+address.getCity()+".");
    }
    
}
