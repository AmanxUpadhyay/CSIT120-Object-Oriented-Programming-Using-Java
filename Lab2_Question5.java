package com.semester;

public class Lab2_Question5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("\n");

        char Alphabet[] = {'A','B','C','D','E'};
        for (int i = 0; i < 4; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(Alphabet[i] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");

        int Tmp = 1;
        for (int i = 0; i < 4; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(Tmp++ + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }
}
