package com.semester;
import java.util.*;

public class Lab1_Question1 {
    /*
     * @param args accept the name of the user and then print welcome message.
    */
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        String name;
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        System.out.println("\nWelcome " + name + ". Have a nice day.");
        input.close();
    }
}