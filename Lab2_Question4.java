package com.semester;

import java.util.Scanner;

public class Lab2_Question4 {
    /*
     * Function to Find Euler's number that is used as the base of natural logarithm
     * where n is the user input.
     */
    public static double euler(int n) {
        double e = 1;
        for (int i = 1; i <= n; i++) {
            e = e + (1 / factorial(i));
        }
        return e;
    }

    /*
     * Function to calculate factorial of a number
     */
    public static int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Euler's number of " + n + " is " + euler(n));
        sc.close();
    }
}
