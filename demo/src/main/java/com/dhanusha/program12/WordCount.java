package com.dhanusha.program12;

import java.util.*;

public class WordCount {

    public static void main(String[] args) {

        String s = "HelloWord";

        try {
            if (s.length() != 0) {
                char letters[] = s.toCharArray();

                System.out.println(Arrays.toString(letters));

                int[] count = new int[letters.length];

                for (int j = 0; j < letters.length; j++) {
                    int c = 1;
                    for (int k = 0; k < letters.length; k++) {
                        if (k != j && letters[k] == letters[j]) {
                            c++;
                        }
                    }
                    count[j] = c;
                }

                System.out.println(Arrays.toString(count));

                int max = count[0];

                for (int i = 1; i < count.length; i++) {
                    max = Math.max(max, count[i]);
                }

                Set<Character> result = new HashSet<>();

                for (int i = 0; i < letters.length; i++) {
                    if (count[i] == max) {
                        result.add(letters[i]);
                    }
                }

                if (result.size() == letters.length) {
                    throw new Exception("String contains only unique characters...");
                } else {
                    System.out.println("Maximum occuring characters: " + result);
                }
            } else {
                throw new Exception("String is empty");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
