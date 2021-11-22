package com.company;

import java.io.*;
import java.net.URL;
import java.util.*;

//Homework 3 1.1

public class Main {
    public static void main(String[] args) {
        int[] array = {-4, 11, 7, -12, 6, 1};
        for (int i = 0; i < array.length; i++) {
            int smallestind = i;
            for (int j = i; j < array.length; j++) {
                if (array[smallestind]> array[j])
                    smallestind = j;
            }
            if (smallestind != i)
                swap(array, smallestind, i);
        }
        for (int v: array)
            System.out.println(v);
    }
    static void swap (int[] array, int ind1, int ind2) {
        int variable = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = variable;
    }
}
//1.2

public class Main {
    public static void main(String[] args) {
        int[] array = {-4, 11, 7, -12, 6, 1};
        boolean flag = false;
        while (!flag) {
            flag = true;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    flag = false;
                }
            }
        }
        for (int v: array)
            System.out.println(v);
    }

    static void swap (int[] array, int ind1, int ind2) {
        int variable = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = variable;
    }
}

//2

HW 3, Q 2

public class Main {
    public static void main(String[] args) {
        int[] array = {-4, 11, 7, -12, 6, 1};
        boolean flag = false;
        while (!flag) {
            flag = true;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    flag = false;
                }
            }
            for (int v: array)
                System.out.print(v + ", ");
            System.out.println();
        }
    }

    static void swap (int[] array, int ind1, int ind2) {
        int variable = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = variable;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] array = {-4, 11, 7, -12, 6, 1};
        for (int i = 0; i < array.length; i++) {
            int smallestind = i;
            for (int j = i; j < array.length; j++) {
                if (array[smallestind]> array[j])
                    smallestind = j;
            }
            if (smallestind != i)
                swap(array, smallestind, i);
            for (int v: array)
                System.out.print(v + ", ");
            System.out.println();
        }
    }
    static void swap (int[] array, int ind1, int ind2) {
        int variable = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = variable;
    }
}

//Hw 5
public class Main {
    // pt 1 :2, 7, 9, 11
    public static void main(String[] args) {
        int[] array = {9, 7, 2, 11};
        int i = 1;
        while (i < array.length) {
            int val = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > val) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = val;
            i++;
        }
        for (int v: array)
            System.out.println(v);
    }
    //pt 3 : expo
}

//hw6
\documentclass{article}
        \usepackage[utf8]{inputenc}

        \title{Compsci HW 6}
        \author{Allen Li}
        \date{November 2021}

        \begin{document}

        \maketitle

        \section{Solution}

        The number of problems that can be solved is $10^9$ in one second. Hence we solve for:
        \\
        1.1 $n^2 = 10^9$ we have $n = \sqrt{10^9} = 10^4 * \sqrt{10}$. $31623$
        \\
        1.2 $2^n = 10^9$ we have $n = \log_2 10^9$. $30$

        \end{document}

2. The bundling of data into one block in such a way that prevents external interference. Data hiding is another term.
3. Float and Double.
4. Long is longer than int. :)
5. A method is an action that can be called to change an aspect of the object whereas a field
    defines one of the characteristics of the object.

//hw2
public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[2];
        books[0] = new Book("The Sun Is Also a Star", new String[]{"Nicola Yoon"}, 2016);
        books[1] = new Book("The Wizard of Earthsea", new String[]{"Ursula K. Le Guin"}, 1968);
        for (Book book : books)
            System.out.println(book);
    }
}

class Book
{
    public Book (String title, String[] authors, int publicationYear)
    {
        this.title = title;
        this.authors = authors;
        this.publicationYear = publicationYear;
    }

    public String toString ()
    {
        StringBuffer strBuffer = new StringBuffer ();
        int numAuth = authors.length;
        for (int i = 0; i < numAuth; i = i + 1)
        {
            strBuffer.append (authors [i]);
            if (i != numAuth - 1)
                strBuffer.append (" & ");
        }
        strBuffer.append (": " + title + " ");
        strBuffer.append ("(" + publicationYear + ")");

        return strBuffer.toString ();
    }

    public String getTitle ()
    {
        return title;
    }

    public String[] getAuthors ()
    {
        return authors;
    }

    public int getPublicationYear ()
    {
        return publicationYear;
    }

    public int numAuthors ()
    {
        return authors.length;
    }

    public boolean newerThan (Book book)
    {
        return publicationYear > book.getPublicationYear ();
    }

    private String title;
    private String[] authors;
    private int publicationYear;
}
//hw3
public class Main {
    public static void main(String[] args) {
        Newspaper express = new Newspaper("Express", 2021, 2, 25, false);
        System.out.println(express);
    }
}

class Newspaper {
    private String name;
    private int year, month, dayOfMonth;
    private boolean isFinnish;
    public Newspaper (String name, int year, int month, int dayOfMonth, boolean isFinnish) {
        this.name = name;
        this.year = year;
        this.dayOfMonth = dayOfMonth;
        this.isFinnish = isFinnish;
        this.month = month;
    }
    public String getName() {
        return name;
    }
    public void setdate(int year, int month, int dayOfMonth) {
        this.year = year;
        this.month = month;
        this.dayOfMonth = dayOfMonth;
    }
    public int getYear (){
        return year;
    }
    public int getMonth() {
        return month;
    }
    public int getDayOfMonth() {
        return dayOfMonth;
    }
    public boolean getisFinnish() {
        return isFinnish;
    }
    public String toString() {
        return "Newspaper{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", month=" + month +
                ", dayOfMonth=" + dayOfMonth +
                ", isFinnish=" + isFinnish +
                '}';
    }
}

//hw5

public class Main {
    public static void main(String[] args) {
        Point[] points = new Point[3];
        points[0] = new Point(1, 0);
        points[1] = new Point(0.5, 0.2);
        points[2] = new Point(5, 6);
        for (Point point : points) {
            System.out.println(point);
            System.out.println(point.inUnitCircle());
            System.out.println(point.isXAxis());
        }
        System.out.println(points[0].midPoint(points[1]));
        System.out.println(points[0].distanceTo(points[2]));
    }
}

class Point {
    private double x, y;
    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public String toString() {
        return "The coordinates are: (" + x + ", " + y + ")";
    }
    public boolean isXAxis() {
        if (y == 0)
            return true;
        return false;
    }
    public boolean compareWith(Point otherPoint) {
        if (x == otherPoint.getX() && y == otherPoint.getY())
            return true;
        return false;
    }
    public double distanceTo (Point otherPoint) {
        double value = Math.sqrt(Math.pow(otherPoint.getX() - x, 2) + Math.pow(otherPoint.getY() - y, 2));
        return value;
    }
    public boolean inUnitCircle() {
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        if (distance > 1)
            return false;
        return true;
    }
    public Point midPoint(Point otherPoint) {
        Point mid = new Point((x + otherPoint.getX()) / 2, (y + otherPoint.getY()) / 2);
        return mid;
    }
}