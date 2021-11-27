package com.semester;

import java.util.*;

/*
 * Design a class in Java that describes a Person. It should have instance variables to record name, age and salary. Create a person object. Set and display its instance variables.
*/
class Person {
    private String name;
    private int age;
    private double salary;
    Scanner input = new Scanner(System.in);

    Person() {
    }

    public void getInfo() {
        System.out.println("------------------------");
        System.out.print("Enter Your Name: ");
        name = input.nextLine();
        System.out.print("Enter Your age: ");
        age = input.nextInt();
        System.out.print("Enter Your salary: ");
        salary = input.nextDouble();
        displayInfo();
    }

    private void displayInfo() {
        System.out.println("------------------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

public class Lab5_Question2 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Person P = new Person();
        P.getInfo();
    }
}
