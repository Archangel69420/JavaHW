package com.company;

public class Main {
    public static void main(String[] args) {
        int[] integers = {2, 4, 6, 8, 3, 5, 7, 8,
                3, 7, 76, 5, 454, 63, 6, 3, 645, 6, 4,
                6, 3546, 34, 6, 36, 3, 6};
        arrayPrinter(controller(integers));
    }

    static String[] controller(int[] someArray) {
        String[] allFactors = new String[someArray.length];
        for (int i = 0; i < someArray.length; i++) {
            allFactors[i] = factorsOf(someArray[i]);
        }
        return allFactors;
    }

    static String factorsOf(int num) {
        if (isPrime(num)) return toString(num);
        int quotient = oneFactor(num);
        return toString(quotient) + factorsOf(num / quotient);
    }

    static boolean isPrime(int input) {
        for (int i = 2; i <= Math.sqrt(input); i++) {
            if (input % i == 0) return false;
        }
        return true;
    }

    static String toString(int n) {
        return n + " ";
    }

    static void arrayPrinter(String[] givenArray) {
        for (String v : givenArray) {
            System.out.println(v);
        }
    }

    static int oneFactor(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return i;
            }
        }
        return 1;
    }
}