package com.company;
import java.io.*;
import java.util.*;

import ibadts.Collection;

public class Main {
    public static void main (String[] args) {
        /* Collection<String> NAMES = new Collection<>();
        NAMES.add(new String[] {"John", "Marie"});
         for (int Count = 0; Count < 3; Count++) {
            NAMES.resetNext();
            while (NAMES.hasNext()) {
                System.out.println(NAMES.getNext());
            }
        } */

        /* Collection<Integer> NUMBERS = new Collection<>();
        Collection<Integer> input = new Collection<>();
        input.add(new Integer[] {11, 2, 7, -1, 3});
        boolean Flag = true;
        int NUMBER;
        int T = 0;
        while (Flag) {
            NUMBER = input.getNext();
            if (NUMBER <= 0) Flag = false;
            else {
                NUMBERS.addItem(NUMBER);
                T = NUMBER;
            }
        }

        while (NUMBERS.hasNext()) {
            NUMBER = NUMBERS.getNext();
            if (NUMBER > T) System.out.println(NUMBER);
        } */

        Scanner input = new Scanner(System.in);
        Collection<Integer> user = new Collection<>();
        boolean flag = true;
        while (input.hasNextInt() && flag) {
            int number = input.nextInt();
            if (number > 0) {
                user.addItem(number);
            }
            else {
                flag = false;
            }
        }
        user.resetNext();
        while (user.hasNext()) {
            System.out.println(user.getNext());
        }
    }
}

/*
John
Marie
John
Marie
John
Marie
 */