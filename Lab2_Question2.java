package com.semester;

import java.util.Scanner;

public class Lab2_Question2 {
    /*
     * Function to Reverse a Number
     */
    public static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        int n;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Reverse of " + n + " is " + reverse(n));
        sc.close();
    }
}
