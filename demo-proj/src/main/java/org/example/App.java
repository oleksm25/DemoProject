package org.example;

import java.util.Arrays;

/**
 * Test app!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("App started!");

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,12,13,14,15};
        Arrays.stream(arr).forEach(n -> System.out.println(n));

        System.out.println("App finished!");
    }
}
