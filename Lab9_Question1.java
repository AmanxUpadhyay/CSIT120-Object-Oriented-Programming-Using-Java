package com.semester;

import java.util.Scanner;

public class Lab9_Question1 {
    /*
     * Create Method Exception() which use try and catch to generate ArrayIndexOutOfBoundsException and NumberFormatException.
     */
    public static void Exception() {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter the number of elements in the array");
            int n = input.nextInt();
            int[] arr = new int[n];

            System.out.println("Enter the elements of the array");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(input.next());
            }
            System.out.println("Enter the index of the element to be accessed");
            int index = Integer.parseInt(input.next());
            System.out.println("The element at index " + index + " is " + arr[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        }

        input.close();
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Exception();
    }
}
