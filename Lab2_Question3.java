package com.semester;

import java.util.Scanner;

public class Lab2_Question3 {
    /*
     * Function to count the number of digits of an Integer take from user
     */
    public static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Enter a number :: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Number of digits of " + n + " is " + countDigits(n));
        sc.close();
    }
}
