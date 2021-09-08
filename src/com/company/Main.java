package com.company;

public class Main {

    public static void main(String[] args) {
        int[] original = {5, 4, -7, -2, -1};
        int[] reversed = new int[original.length];
        for (int n = 0; n < reversed.length; n++) {
            reversed[reversed.length-n - 1] = original[n];
        }
        for (int v : reversed) {
            System.out.print(v + " ");
        }
    }
}
