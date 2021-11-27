package com.semester;

import java.util.Scanner;

public class Lab8_Question5 {
    /*
     * Function to replace vowels present in string with 0 and return result
     */
    public static String ReplaceVowel(String str) {
        String res = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                res += "@";
            } else {
                res += str.charAt(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();

        System.out.println("----------------------------------");
        System.out.println("Replace Vowel:\n" + ReplaceVowel(str));
        System.out.println("----------------------------------");

        input.close();
    }
}