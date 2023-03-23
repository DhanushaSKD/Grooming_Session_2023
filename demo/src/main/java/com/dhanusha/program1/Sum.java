//Java program to accept two numbers as command line arguments and print the addition of those numbers.

package com.dhanusha.program1;

public class Sum 
{
    public static void main( String[] args )
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("Sum of a and b is "+(a+b));
    }
}
