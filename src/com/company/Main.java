package com.company;

import java.io.*;
import java.net.URL;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        URL source = new URL("http://www-personal.umich.edu/~jlawler/wordlist");
        Scanner input = new Scanner(source.openStream());
        String[] words = new String[70000];
        String key = "car";
        for (int i = 0; input.hasNext(); i++)
            words[i] = input.next();
        System.out.println(stringFinder(words, key, 0, words.length - 1));
    }

    private static boolean stringFinder(String[] array, String key, int lo, int hi) {
        int n = (lo + hi) / 2;
        if (lo > hi)
            return false;
        if (array[n].equals(key))
            return true;
        else {
            if (array[n].compareTo(key) > 0)
                return stringFinder(array, key, lo, n - 1);
            else
                return stringFinder(array, key, n + 1, hi);
        }
    }
}