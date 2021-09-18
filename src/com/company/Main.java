package com.company;

public class Main {

    /* public static void main(String[] args) {
        int[] array = {32,4,242,4,24,2,42,4,24,2,42,42,4};
        System.out.println(contains(array, 5));
    }

    static boolean contains (int[] array, int value) {
        for (int i = 0; i< array.length; i++)
            if (array[i] == value) return true;
        return false;
    }

    public static void main(String[] args) {
        int[] array1 = {32,4,242,4,24,2,42,4,24,2,42,42,4};
        int[] array2 = {6,63,5,35,35,3,87,7,87};
        System.out.println(any(array1, array2));
    }
    static boolean any (int[] a, int[] b) {
        for (int i = 0; i < a.length; i++)
            if (contains(b, a[i])) return true;
        return false;
    } */

    /* public static void main(String[] args) {
        int counter = 1;
        for (int i = 2; counter <= 100; i++) {
            if (prime(i)) {
                System.out.println(i);
                counter++;
            }
        }
    }

    static boolean prime (int n) {
        for (int i = 2; i < Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    } */

    /* public static void main(String[] args) {
        int[] beginning = {2,3,5,7,7,8};
        int[] reversed = reverse(beginning);
        System.out.println(equal(beginning, reversed));
    }

    static int[] reverse (int[] a) {
        int[] reversed = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            reversed[i] = a[a.length-1-i];
        }
        return reversed;
    }

    static boolean equal (int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    } */

    /* public static void main(String[] args) {
        int[] IN = {1,2,3,4,5,5,4,3,2,1};
        int[] OUT = {6,6,6,6,6,6,6,6,6,6};
        int x = 4;
        remove(IN, OUT, x);
        for (int v: OUT) System.out.print(v + " ");
    }
    static void remove (int[] IN, int[] OUT, int X) {
        int counter = 0;
        for (int i = 0; i < IN.length; i++) {
            if (IN[i] != X) {
                OUT[counter] = IN[i];
                counter++;
            }
        }
        for (int i = 0; i < IN.length - counter; i++) {
            OUT[OUT.length - 1 - i] = 0;
        }
    }*/

    public static void main(String[] args) {
        int[] test = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        int[] result = alternate(test);
        for (int v : result) {
            System.out.print(v + " ");
        }
    }

    static int[] alternate(int[] a){
        int[] result = new int[a.length];
        for (int i = 0, counter = 0; counter < a.length/2; i = i + 2, counter ++) {
            result[i] = a[counter];
            result[i+1] = a[a.length - 1 - counter];
        }
        if (a.length % 2 != 0) result[a.length -1 ] = a[a.length/2];
        return result;
    }
}