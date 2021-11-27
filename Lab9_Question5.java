package com.semester;

import java.util.Scanner;

class WrongAnswerException extends Exception {
    public WrongAnswerException(String message) {
        super(message);
    }
}

public class Lab9_Question5 {
    /*
     * Write a program to develop a Quiz Management System, where a user needs to
     * answer 3 questions. If any of the answer is wrong, throw an exception
     * “WrongAnswerException”.
     */
    public static void QuizManagement() {
        Scanner input = new Scanner(System.in);
        int score = 0;

        try {
            System.out.println(
                    "Question 1: What is the capital of India? \nA, Delhi \nB, Mumbai \nC, Chennai \nD, Kolkata");
            System.out.print("Enter your answer: ");
            String answer1 = input.nextLine();

            if (answer1.equalsIgnoreCase("A")) {
                System.out.println("good! The answers are correct");
                score++;
            } else {
                input.close();
                throw new WrongAnswerException("Wrong Answer");
            }

            System.out.println(
                    "Question 2: What is the capital of Pakistan? \nA, Lahore \nB, Karachi \nC, Islamabad \nD, Peshawar");
            System.out.print("Enter your answer: ");
            String answer2 = input.nextLine();

            if (answer2.equalsIgnoreCase("B")) {
                System.out.println("good! The answers are correct");
                score++;
            } else {
                input.close();
                throw new WrongAnswerException("Wrong Answer");
            }

            System.out.println(
                    "Question 3: What is the capital of China? \nA, Beijing \nB, Shanghai \nC, Hong Kong \nD, Macao");
            System.out.print("Enter your answer: ");
            String answer3 = input.nextLine();
            
            if (answer3.equalsIgnoreCase("C")) {
                System.out.println("good! The answers are correct");
                score++;
            } else {
                input.close();
                throw new WrongAnswerException("Wrong Answer");
            }

            System.out.println("Your score is " + score);
        } catch (WrongAnswerException e) {
            System.out.println(e.getMessage());
        }
        input.close();
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        QuizManagement();
    }
}
