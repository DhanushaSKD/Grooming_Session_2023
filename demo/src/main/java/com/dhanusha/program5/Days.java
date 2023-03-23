package com.dhanusha.program5;
import java.util.*;

public enum Days {

    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any day which is a String: ");
        String input = sc.nextLine();
        sc.close();
        Days day = Days.valueOf(input.toUpperCase());
        System.out.println("The day in enum: "+day);

    }
    
    
}
