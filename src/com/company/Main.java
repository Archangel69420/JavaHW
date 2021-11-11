package com.company;
import java.io.*;
import java.net.URL;
import java.util.*;

//HW1

public class Main {
    public static void main(String[] args) {
        int[] array = {-2, 9, 11, 12, 13, 14, 15, 22, 142};
        int key = 11;
        int hi = array.length - 1, low = 0;
        boolean found = false;
        while (low <= hi && !found) {
            int n = (hi + low) / 2;
            System.out.println(array[n]);
            if (array[n] == key) {
                System.out.println(n);
                found = true;
            }
            if (array[n] < key)
                low = n + 1;
            if (array[n] > key)
                hi = n - 1;
        }
    }
}

//HW2

public class Main {
    public static void main(String[] args) {
        String[][] students = {{"Alissa", "Ben", "Charlie", "Dianna"}, {"B", "D", "B", "A"}};
        String key = "Charlie";
        for (int i = 0; i < students[0].length; i++) {
            if (students[0][i].equals(key))
                System.out.println(students[1][i]);
        }
    }
}

//HW 4

public class Main {
    public static void main(String[] args) throws IOException {
        URL source = new URL("https://www-personal.umich.edu/˜jlawler/wordlist");
        Scanner input = new Scanner(source.openStream());
        String[] words = new String[70000];
        String key = "brokenlink";
        for (int i = 0; input.hasNext(); i ++)
            words[i] = input.next();
        System.out.println(stringFinder(words, key, 0, words.length - 1));
    }

    private static boolean stringFinder (String[] array, String key, int lo, int hi) {
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



