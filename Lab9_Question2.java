package com.semester;

import java.util.Scanner;

/*
 * Write a program in java which will accept the name and age of the user. If
 * name is blank/empty, then raise an exception (user defined) “NameException”
 * which will show the appropriate messages. Age of the user should be above 18
 * or else raise an exception “InsufficientAgeException” with proper message.
 * You may incorporate other exceptions to make your program robust.
 */
class NameException extends Exception {
    public NameException(String message) {
        super(message);
    }
}

class InsufficientAgeException extends Exception {
    public InsufficientAgeException(String message) {
        super(message);
    }
}

public class Lab9_Question2 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Scanner input = new Scanner(System.in);

        String name = null;
        int age = 0;

        try {
            System.out.print("Enter your name: ");
            name = input.nextLine();

            if (name.isEmpty()) {
                input.close();
                throw new NameException("Name cannot be empty");
            }
            System.out.print("Enter your age: ");
            age = Integer.parseInt(input.next());

            if (age < 18) {
                input.close();
                throw new InsufficientAgeException("Age should be above 18");
            }
            System.out.println("Name: " + name + " Age: " + age);
        } catch (NameException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientAgeException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        }
        input.close();
    }
}