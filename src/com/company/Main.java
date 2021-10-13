package com.company;
import java.io.*;
import java.util.*;

/* public class Main {
    public static void main (String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int v = i; v < i + 5; v++) {
                System.out.print(v);
            }
            System.out.print("\n");
        }
    }
} */

public class Main {
    public static void main (String[] args) {
        // Whether the elements of the A and B array are the same
        // To have a flag that breaks once Flag = False
        /*
        FLAG = false
        while NOT FLAG, n < 5, m < 5
            if A[n] = B[m]
                FLAG = TRUE
            n++
            m++
            end loop

         output FLAG
         */

        /* boolean flag = false;
        int[] A = {42,4,24,2,42,4,24,2,43,5,2,5,457,4,7};
        int[] B = {8,7,47,47,4,74,6,35,2,52,5};
        for (int i = 0; i < A.length && !flag; i++) {
            for (int v = 0; v < B.length && !flag;v++) {
                if (A[i] == B[v]) {
                    flag = true;
                }
            }
        }
        System.out.println(flag); */

        /* int k = 0, l;
        int[] Num = {3,4,6,7,9,2};
        while (k < Num.length) {
            l = 0;
            while (l < Num.length)  {
                if (k != l) System.out.println(10*Num[k] + Num[l]);
                l++;
            }
            k++;
        } */

        /* for (int i = 0; i < 7; i ++) {
            for (int v = 0; v < 7-i; v++) {
                System.out.print("*");
            }
            System.out.println();
        } */

        /* for (int i = 0; i < 7; i++) {
            for (int v = 0; v <= i; v++) {
                System.out.print("*");
            }
            for (int m = 0; m < 6-i; m++){
                System.out.print("-");
            }
            System.out.println();
        } */
        /*
        int[] testArray = {100,2,6,80,7,9,0,3,70,8};
        System.out.println(unique(testArray));*/
        /* boolean flag = false;
        int[] a = {4, 4, 6, 11, -2, 3};
        int[] b = {5, 11, 11, -3, 3, 5};
        for (int i = 0; i < a.length; i++) {
            for (int v = 0; v < b.length; v++) {
                if (a[i] == b [v]) {
                    flag = true;
                    b[v] = 0;
                }
            }
            if (!flag) System.out.print(a[i] + " ");
            flag = false;
        }

        for (int v : b) {
            if (v != 0) System.out.print(v + " ");
        }
     } */
     /* static boolean unique (int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int v = i + 1; v < numbers.length; v++) {
                if (numbers[i] == numbers[v]) return true;
            }
        }
        return false;
     } */
}