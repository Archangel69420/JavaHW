package com.company;

public class Main {

    public static void main(String[] args) {
        int[] original = {-3, 2, 6, -11};
        int[] cumulative_sum = new int[original.length];
        int sum = 0;
        for (int i = 0; i < original.length; i++) {
            sum += original[i];
            cumulative_sum[i] = sum;
        }
        for (int v : cumulative_sum) {
            System.out.print(v + " ");
        }
    }
}
