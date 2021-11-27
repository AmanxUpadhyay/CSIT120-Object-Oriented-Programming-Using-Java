package com.semester;
import java.util.*;

/*
 * Write a program in java to accept 6 numbers and then sort them in descending order and display the sorted array on the screen.
 */

class ArraySort {
    private int size = 6;
    private Integer Array[] = new Integer[size];
    private Scanner input = new Scanner(System.in);

    private void getInput() {
        for (int i = 0; i < size; i++) {
            Array[i] = input.nextInt();
        }
    }

    public void Res() {
        System.out.print("Enter Element of Array: ");
        getInput();
        System.out.println("Size of Array: " + size);
        Arrays.sort(Array, Collections.reverseOrder());
        System.out.print("Reverse Array: "+Arrays.toString(Array));
    }
}

public class Lab6_Question4 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        ArraySort sort = new ArraySort();
        sort.Res();
    }
}
