package com.semester;

import java.util.Scanner;

/*
 * Write a multi threading program in java which takes two lines of texts as input.
 * Now print both the line (word wise) as output of two concurrent threads.
 * Example:
    Enter a line of text:
    Welcome to Amity University Kolkata
    Enter another line of text:
    Today is Tuesday and 30th November
 * Output:
    Welcome
    Today
    is
    to
    Tuesday
    Amity
    and
    University
    Kolkata
    30th
    November
*/
class MultiLineThread extends Thread {
    String line;

    MultiLineThread(String line) {
        this.line = line;
    }

    public void run() {
        String[] words = line.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}

public class Lab10_Question1 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter a line of text:");
            String line1 = input.nextLine();
            System.out.println("Enter another line of text:");
            String line2 = input.nextLine();

            MultiLineThread t1 = new MultiLineThread(line1);
            MultiLineThread t2 = new MultiLineThread(line2);
            t1.start();
            t2.start();
        } catch (Exception e) {
            System.out.println("Invalid input");
        }

        input.close();
    }
}
