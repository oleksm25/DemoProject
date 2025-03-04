package org.example;

import java.util.Arrays;

/**
 * Test app!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("App started!");

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,};
        Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.println(n));

        System.out.println("Changes #3  - oleksm");

        System.out.println("App finished!");
    }
}
