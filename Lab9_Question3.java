package com.semester;
import java.util.Scanner;
/*
 * Write a program in java which accepts username and password. 
 * Raise a user defined exception if username is less than 6 characters and password does not match.
*/

class PasswordException extends Exception {
    public PasswordException(String msg) {
        super(msg);
    }
}

public class Lab9_Question3 {
    //! Function to Take Username and Password and check 
    //! if Username is less than 6 characters and Password does not match with Username
    public static void checkPassword(String username, String password) throws PasswordException {
        if (username.length() < 6) {
            throw new PasswordException("Username is less than 6 characters");
        } else if (username.equals(password)) {
            throw new PasswordException("Password should not match with Username");
        }
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter Username: ");
                String username = input.nextLine();
                System.out.println("Enter Password: ");
                String password = input.nextLine();
                checkPassword(username, password);
                System.out.println("Username and Password are correct");
                break;
            } catch (PasswordException e) {
                System.out.println(e.getMessage());
            }
        }
        input.close();
    }
}
