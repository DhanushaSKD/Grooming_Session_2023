package com.dhanusha.program6;

import java.util.*;

public class Numbers {

    public static void main (String args[]) {

        int numbers[] = {34, 12, 89, 67, 45, 50, 71};

        Arrays.sort(numbers);

        System.out.println("Sorted Array:"+Arrays.toString(numbers));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter K : ");
        int k = sc.nextInt();
        sc.close();
        try {
            if(k>=numbers.length) {
                throw new ArrayIndexOutOfBoundsException("Give the valid index 0 to 6");
            }
            System.out.println("Kth smallest number is "+numbers[k-1]);
            System.out.println("Kth largest number is "+numbers[numbers.length-k]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        

        
    }

}
