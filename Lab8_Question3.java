package com.semester;

import java.util.Scanner;

public class Lab8_Question3 {
    /*
     * Function to check whether the string is unique or not
     */
    public static boolean uniqueChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = input.nextLine();
        if (uniqueChar(str)) {
            System.out.println("String is unique");
        } else {
            System.out.println("String is not unique");
        }

        input.close();
    }
}