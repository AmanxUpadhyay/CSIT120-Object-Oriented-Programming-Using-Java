package com.semester;
import java.util.*;
/*
 * Write a program in Java to accept 15 numbers from the user in an array. Now print the smallest and largest numbers.
*/

class ArrayMaxMin{
    private int size = 15;
    private int Array[] = new int[size];
    private int min = Array[0], max = Array[0];
    private Scanner input = new Scanner(System.in);

    public ArrayMaxMin(){}

    public void getInput() {
        for(int i = 0; i < size; i++) {
            Array[i] = input.nextInt();
        }
    }

    private void MaxMin() {
        for(int i = 0; i < size; i++) {
            if(Array[i] > max) {
                max = Array[i];
            }
            if(Array[i] < min) {
                min = Array[i];
            }
        }
    }

    public void Res() {
        MaxMin();
        System.out.println("Size of Array: " + size);
        System.out.println("Largest number: " + max + " Smallest number: " + min);
    }
}

public class Lab6_Question2 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        System.out.print("Enter Element of Array: ");
        ArrayMaxMin arr = new ArrayMaxMin();

        arr.getInput();
        arr.Res();
    }
}
