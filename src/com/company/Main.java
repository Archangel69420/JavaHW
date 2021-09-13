package com.company;

public class Main {

    public static void main(String[] args) {
        PrimeFind cap = new PrimeFind(70);
        System.out.println(cap.controller());
    }
}

class PrimeFind {
    int primeCap;

    public PrimeFind (int input) {
        primeCap = input;
    }

    public String controller() {
        return allPrimes(primeCap);
    }

    private String allPrimes(int input) {
        if (input == 2) return "2";
        if (isPrime(input)) return Integer.toString(input) + " "
                + allPrimes(input-1);
        return allPrimes(input - 1);
    }

    private boolean isPrime (int primetest) {
        boolean isPrime = true;
        for (int i = 2; i < Math.sqrt(primetest); i = i + 2) {
            if (primetest % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}