package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumUpTo(20));
    }

    static int sumUpTo (int n) {
        if (n == 1) return 1;
        return n + sumUpTo(n -1);
    }
}