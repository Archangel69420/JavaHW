package com.company;

public class Main {
    public static void main(String[] args) {
        int[] integers = {4, 532, 45, 23, 5324, 5, 23, 52, 5, 423, 54, 5, 234, 5234, 5, 2352, 35, 2};
        AllFactors some = new AllFactors(integers.length);
        some.setArray(integers);
        some.printArray();
        some.printSolution();
    }
}

class AllFactors {
    private int length;

    public AllFactors(int input) {
        length = input;
    }

    private int[] array = new int[length];

    public void setArray(int[] someArray) {
        array = someArray;
    }

    public String[] controller() {
        String[] allFactors = new String[length];
        for (int i = 0; i < length; i++) {
            allFactors[i] = factorsOf(array[i]);
        }
        return allFactors;
    }

    private String factorsOf(int num) {
        if (isPrime(num)) return toString(num);
        int quotient = oneFactor(num);
        return toString(quotient) + factorsOf(num / quotient);
    }

    private boolean isPrime(int input) {
        for (int i = 2; i <= Math.sqrt(input); i++) {
            if (input % i == 0) return false;
        }
        return true;
    }

    private String toString(int n) {
        return n + " ";
    }

    public void printArray() {
        System.out.println("The given array is: ");
        for (int v : array) {
            System.out.println(v + " ");
        }
        System.out.println("--------------------------");
    }

    public void printSolution() {
        String[] solutions = controller();
        System.out.println("The solutions are: ");
        for (String v : solutions) {
            System.out.println(v);
        }
        System.out.println("--------------------------");
    }

    private int oneFactor(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return i;
            }
        }
        return 1;
    }
}