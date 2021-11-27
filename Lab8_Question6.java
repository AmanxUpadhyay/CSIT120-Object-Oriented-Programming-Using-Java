package com.semester;

import java.util.Scanner;

public class Lab8_Question6 {
    /*
     * Function to remove all the vowels from the given string
     */
    public static String removeVowels(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o'
                    && str.charAt(i) != 'u' && str.charAt(i) != 'A' && str.charAt(i) != 'E' && str.charAt(i) != 'I' && str.charAt(i) != 'O' && str.charAt(i) != 'U') {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("----------------------------------");
        System.out.println("String after removing vowels: " + removeVowels(str));
        System.out.println("----------------------------------");

        sc.close();
    }
}
