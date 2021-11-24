package com.company;

import java.awt.*;
import java.io.FileWriter;
import java.net.*;
import java.util.*;
import java.security.*;

public class Main {
    public static void main(String[] args) throws Exception {
        long programStart = System.currentTimeMillis();
        URL source = new URL("http://www-personal.umich.edu/~jlawler/wordlist");
        Scanner input = new Scanner(source.openStream());
        int numofEle = 69903; //Cannot reset input
        String[] words = new String[numofEle];
        for (int i = 0; input.hasNext(); i++)
            words[i] = input.next();
        input.close();
        shuffle(words);
        long[] startTime = new long[numofEle];
        long[] endTime = new long[numofEle];
        long[][] runningTime = new long[2][numofEle];
        String[] test = new String[words.length];
        FileWriter logger = new FileWriter("text.txt");
        for (int i = 0; i < words.length; i++) {
            for (int v = 0; v < words.length; v++)
                test[v] = words[v];
            startTime[i] = System.nanoTime();
            sort(test, i);
            endTime[i] = System.nanoTime();
            runningTime[0][i] = i + 1;
            runningTime[1][i] = endTime[i] - startTime[i];
            logger.write(runningTime[1][i] + " \t" + runningTime[0][i] + "\n");
        }
        long programEnd = System.currentTimeMillis();
        long programElapsed = programEnd - programStart;
        System.out.println("Run completed. Time elapsed: " +
                programElapsed);
    }

    static void shuffle(String[] array) {
        Random generator = new Random();
        for (int i = 0; i < array.length; i++) {
            int v = generator.nextInt(array.length);
            int j = generator.nextInt(array.length);
            swap(array, v, j);
        }
    }

    static void swap(String[] array, int ind1, int ind2) {
        String a = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = a;
    }

    static void sort(String[] array, int members) {
        for (int i = 0; i < members - 1 && members != 1; i++) {
            int smallestInd = i;
            for (int j = i; j < members; j++) {
                if (array[smallestInd].compareTo(array[j]) > 0) {
                    smallestInd = j;
                }
            }
            swap(array, i, smallestInd);
        }
    }
}