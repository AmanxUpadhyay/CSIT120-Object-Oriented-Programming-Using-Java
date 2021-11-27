package com.semester;

import java.util.*;

/*
 * Write a program in Java to accept 10 integers and then display the odd numbers, even numbers and prime numbers.
 */

class Array {
    private int size = 10;
    private int Array[] = new int[size];
    private Scanner input = new Scanner(System.in);

    public Array() {
    }

    private void getInput() {
        for (int i = 0; i < size; i++) {
            Array[i] = input.nextInt();
        }
    }

    private void OperationEven() {
        System.out.print("Even Numbers: ");
        for (int i = 0; i < size; i++) {
            if (Array[i] % 2 == 0) {
                System.out.print(Array[i] + " ");
            }
        }
    }

    private void OperationOdd() {
        System.out.print("Odd Numbers: ");
        for (int i = 0; i < size; i++) {
            if (Array[i] % 2 != 0) {
                System.out.print(Array[i] + " ");
            }
        }
    }

    private void OperationPrime() {
        int counter, i, j;
        System.out.print("Prime Numbers: ");
        for (i = 0; i < size; i++) {
            counter = 0;
            for (j = 2; j < Array[i]; j++) {
                if (Array[i] % j == 0) {
                    counter = 1;
                    break;
                }
            }
            if (counter == 0) {
                System.out.print(Array[i] + " ");
            }
        }
    }

    public void Res() {
        System.out.print("Enter Element of Array: ");
        getInput();
        System.out.println("Size of Array: " + size);
        OperationEven();
        OperationOdd();
        System.out.println("");
        OperationPrime();
    }
}

public class Lab6_Question3 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        Array arr = new Array();
        arr.Res();
    }
}
