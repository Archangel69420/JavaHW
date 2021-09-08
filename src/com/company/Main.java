package com.company;

public class Main {

    public static void main(String[] args) {
        // calculates the average
        // whether the members of an array is in incrementing progression
        boolean result = true;
        final int[] VALUES = {-3, 2, 5, 6, 7};
        int n = 1;
        while (n < 5) {
            if (VALUES[n] < VALUES[n-1]) {
                result = false;
                break;
            }
            n++;
        }
        System.out.println(result);
    }
}
