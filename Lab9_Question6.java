package com.semester;
import java.util.Scanner;
/*
 * Write a program in Java to accept the student’s name and obtained marks in three subjects.
 * The marks should be between 0 and 50 and the name cannot be blank or else an
 * appropriate exception to be raised. Find the total marks and percentage.
 */

class MarkException extends Exception {
    public MarkException(String message) {
        super(message);
    }
}

class BlankNameException extends Exception {
    public BlankNameException(String message) {
        super(message);
    }
}

class Student {
    private String name;
    private int mark1, mark2, mark3;

    public Student(String n, int m1, int m2, int m3) {
        this.name = n;
        this.mark1 = m1;
        this.mark2 = m2;
        this.mark3 = m3;
    }

    public String getName() {
        return name;
    }

    public int getMark1() {
        return mark1;
    }

    public int getMark2() {
        return mark2;
    }

    public int getMark3() {
        return mark3;
    }

    public int getTotal() {
        return mark1 + mark2 + mark3;
    }

    public double getPercentage() {
        return (getTotal() / 300.0) * 100;
    }
}

public class Lab9_Question6 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter your name: ");
            String name = input.nextLine();
            if (name.isEmpty()) {
                input.close();
                throw new BlankNameException("Name cannot be blank");
            }
            System.out.print("Enter your marks in three subjects: ");
            int mark1 = input.nextInt();
            int mark2 = input.nextInt();
            int mark3 = input.nextInt();
            if (mark1 < 0 || mark1 > 50 || mark2 < 0 || mark2 > 50 || mark3 < 0 || mark3 > 50) {
                input.close();
                throw new MarkException("Marks should be between 0 and 50");
            }
            Student student = new Student(name, mark1, mark2, mark3);
            System.out.println("Your name is " + student.getName());
            System.out.println("Your total marks is " + student.getTotal());
            System.out.println("Your percentage is " + student.getPercentage());
        } catch (MarkException e) {
            System.out.println(e.getMessage());
        } catch (BlankNameException e) {
            System.out.println(e.getMessage());
        }

        input.close();
    }
}
