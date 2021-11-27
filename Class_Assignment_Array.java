package com.semester;

import java.util.*;

/*
 * Create a class to add two matrix
*/
class Matrix {
    public int Array[][] = new int[3][3];
    Scanner input = new Scanner(System.in);

    public void TakeInput() {
        System.out.println("\nEnter 3x3 matrix: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Array[i][j] = input.nextInt();
            }
        }
        System.out.println();
    }

    public void Display() {
        System.out.println("Matrix: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(Array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Matrix add(Matrix m) {

        System.out.println("\nAdded Matrix: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m.Array[i][j] = Array[i][j] + m.Array[i][j];
            }
        }
        return m;
    }
}

public class Class_Assignment_Array {
    public static void main(String[] args) {
        Matrix m1 = new Matrix();
        Matrix m2 = new Matrix();

        m1.TakeInput();
        m2.TakeInput();
        m1.Display();
        m2.Display();

        Matrix m3 = m1.add(m2);
        m3.Display();
    }
}