package com.semester;

import java.util.Scanner;

public class Lab2_Question1 {
    /*
     * Function to Find out HCF of two numbers
     */
    public static int hcf(int a, int b) {
        if (b == 0)
            return a;
        return hcf(b, a % b);
    }

    /*
     * Function to Find out LCM of two numbers
     */
    public static int lcm(int a, int b) {
        return (a * b) / hcf(a, b);
    }
    public static void main(String[] args) {
        int a, b;
        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("HCF of " + a + " and " + b + " is " + hcf(a, b));
        System.out.println("LCM of " + a + " and " + b + " is " + lcm(a, b));
        sc.close();
    }
}