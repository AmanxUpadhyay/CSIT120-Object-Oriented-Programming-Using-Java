package com.semester;
import java.util.*;
public class Lab1_Question2 {
    /*
     * Accept two numbers from the user and then add and print the sum.
    */
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        int n1, n2;
        Scanner input = new Scanner(System.in);
        n1 = input.nextInt();
        n2 = input.nextInt();

        int sum = n1+n2;

        System.out.println("\nSum of the numbers: "+ sum);
        input.close();
    }
}
