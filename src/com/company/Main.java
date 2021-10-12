package com.company;
import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) {
        try (Scanner in = new Scanner(new File("text.txt"))){
            long sum = 0;
            while (in.hasNextInt()) {
                sum += in.nextInt();
            }
            System.out.println(sum);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}