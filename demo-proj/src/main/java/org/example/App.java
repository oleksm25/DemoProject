package org.example;

import java.util.Arrays;

/**
 * Test app!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Test app!");

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.stream(arr).forEach(n -> System.out.println(n));
    }
}
