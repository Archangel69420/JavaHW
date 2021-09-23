package com.company;

public class Main {
    public static void main(String[] args) {
        int[] test = {1,2,3,4,5,6,7,8,9};
        int[] result = alternate(test);
        for (int v : result) {
            System.out.print(v + " ");
        }
    }

    static int[] alternate (int[] input) {
        int[] result = new int[input.length];
        boolean counter = true;
        int startInd = 0, endInd = input.length - 1;
        /* while (startInd < input.length) {
            if (counter) {
                result[startInd] = input[startInd/2];
                startInd++;
                counter = false;
            }
            else {
                result[startInd] = input[endInd];
                endInd--;
                counter = true;
                startInd++;
            }
        } */
        return result;
    }
}