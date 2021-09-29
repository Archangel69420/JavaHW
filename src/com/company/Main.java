package com.company;
import static ibio.Helpers.*;
/* public class Main {
    public static void main(String[] args) {
        for (int k = 0; k <= 10; k++) {
            double a = k * Math.PI / 5;
            System.out.print(a + ", ");
            System.out.print(Math.sin(a) + ", ");
            System.out.print(Math.cos(k * Math.PI / 5));
            System.out.print("\n");
        }
    }
} */

/* public class Main {
    public static void main(String[] args) {
        calculator();
    }

    static void calculator() {
        boolean running = true;
        String operation;
        int a, b;
        while (running) {
            operation = input("give operation: ");
            System.out.println(operation);
            if (operation.equals("end")) {running = false;}
            else {
                a = inputInt("give first integer operand: ");
                b = inputInt("give second integer operand: ");
                if (operation.equals("add")) output(a + b);
                else {
                    if (operation.equals("sub")) output(a - b);
                    else output("unknown operation");
                }
            }
        }
    }
} */

/* public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Not enough arguements detected");
            System.exit(1);
        }
        String[] results = args[0].split(args[1]);
        for (String v: results) {
            if (v.length() > 0) System.out.println(v);
        }
    }
} */