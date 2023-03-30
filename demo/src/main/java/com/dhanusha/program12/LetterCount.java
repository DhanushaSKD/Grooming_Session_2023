package com.dhanusha.program12;

import java.util.*;

public class LetterCount {

    public static void main(String[] args) {

        String s = "Helo";

        try {
            if (s.length() == 0) {
                throw new EmptyStringException("String is empty");
            }

            char letters[] = s.toCharArray();

            System.out.println(Arrays.toString(letters));

            int[] count = new int[letters.length];

            int max = count[0];

            for (int j = 0; j < letters.length; j++) {
                int c = 1;
                for (int k = 0; k < letters.length; k++) {
                    if (k != j && letters[k] == letters[j]) {
                        c++;
                    }
                }
                count[j] = c;
                max = Math.max(max, count[j]);
            }

            System.out.println(Arrays.toString(count));

            Set<Character> result = new HashSet<>();

            for (int i = 0; i < letters.length; i++) {
                if (count[i] == max) {
                    result.add(letters[i]);
                }
            }

            if (result.size() == letters.length) {
                throw new NoRepeatedCharacterException("String contains only unique characters...");
                // throw new RuntimeException("String contains only unique characters...");
            }
            System.out.println("Maximum occuring characters: " + result);

        } catch (EmptyStringException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Finally block is executed...");
        }
        System.out.println("rest of the code...");

    }

}
