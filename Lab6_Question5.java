package com.semester;
import java.util.*;
/*
 * Write a program in Java to accept the elements (numbers) in a 4x4 matrix using 2D array. Find the largest and the smallest numbers of the matrix.
*/
class MatrixMaxMin {
    private int size = 2;
    private Integer Array[][] = new Integer[size][size];
    private Scanner input = new Scanner(System.in);

    private void getInput() {
        for (int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                Array[i][j] = input.nextInt();
            }
        }
    }

    private void MinMax() {
        int min = Array[0][0], max = Array[0][0];

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(min > Array[i][j]){
                    min = Array[i][j];
                }
                if(max < Array[i][j]){
                    max = Array[i][j];
                }
            }
        }
        System.out.println("Smallest Element: " + min);
        System.out.println("Largest Element: " + max);
    }

    public void Res() {
        System.out.println("Enter Element of Array: ");
        getInput();
        System.out.println("_______________________________");
        System.out.println("Size of Array: [" + size + "]" + "[" + size + "]");
        MinMax();
        System.out.println("_______________________________");
    }
}

public class Lab6_Question5 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        MatrixMaxMin sort = new MatrixMaxMin();
        sort.Res();
    }
}
