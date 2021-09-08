package com.company;

public class Main {

    public static void main(String[] args) {
        int m = 1;
        int[] array = new int[args.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(args[i]);
        }
        int[][] bigger_smaller = new int[2][array.length];
        for (int i = 0; i < args.length; i++) {
            if (array[i] > m) bigger_smaller[0][i] = array[i] - m;
            if (array[i] < m) bigger_smaller[1][i] = array[i] - m;
        }
        System.out.print("Bigger: ");
        for (int v : bigger_smaller[0]) {
            if (v != 0)
                System.out.print(v + m + " ");
        }
        System.out.println("\n ----");
        System.out.print("Smaller: ");
        for (int z : bigger_smaller[1]) {
            if (z != 0) System.out.print(z + m + " ");
        }
    }
}