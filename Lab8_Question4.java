package com.semester;

import java.util.*;

public class Lab8_Question4 {

    public static void IntNames(String str) {
        String InitName = "", res = "";
        char ch;
        int whiteSpace, i;

        str = " " + str;

        whiteSpace = str.lastIndexOf(" ");
        res = str.substring(whiteSpace + 1);

        for (i = 0; i < whiteSpace; i++) {
            ch = str.charAt(i);
            if (ch == ' ') {
                InitName = InitName + str.charAt(i + 1) + " ";
            }
        }
        res = InitName + res;

        System.out.println("----------------------------------");
        System.out.println("Original Name : " + str);
        System.out.println("----------------------------------");
        System.out.println("Final Name : " + res);
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        IntNames(str);
        
        input.close();
    }
}
