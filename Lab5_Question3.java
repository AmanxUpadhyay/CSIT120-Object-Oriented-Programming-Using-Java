package com.semester;

import java.util.*;

/*
 * Create a class in Java called Circle with instance variables for the centre and the radius. Initialize (constructors) and display its variables. Use "this" keyword.
 * Also take a class variable that can count the number of instances created for the class.
*/
class Circle {
    private double Radius;
    private static int InstanceCounter = 1;

    public Circle() {
        InstanceCounter++;
    }

    public static int countInstances() {
        return InstanceCounter;
    }

    public Circle(double r) {
        this.Radius = r;
    }

    public double getRadius() {
        return this.Radius;
    }

    public void setRadius(double r) {
        this.Radius = r;
    }

    public double getArea() {
        return 2 * 3.14 * this.Radius * this.Radius;
    }

    public double getPerimeter() {
        return 2 * 3.14 * this.Radius;
    }
}

public class Lab5_Question3 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Scanner input = new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.print("Enter Radius: ");
        double R = input.nextDouble();
        Circle c1 = new Circle(R);
        System.out.println("Circle Radius: " + c1.getRadius() + " Area: " + c1.getArea());
        System.out.println("Number of instances: " + Circle.countInstances());
        System.out.println("-------------------------");

        Circle c2 = new Circle();
        System.out.println("Using setRadius()");
        System.out.print("Enter Radius: ");
        c2.setRadius(input.nextDouble());
        System.out.println("Circle Radius: " + c2.getRadius() + " Area: " + c2.getArea());
        System.out.println("Number of instances: " + Circle.countInstances());
        System.out.println("-------------------------");

        Circle c3 = new Circle();
        System.out.println("Using setRadius()");
        System.out.print("Enter Radius: ");
        c3.setRadius(input.nextDouble());
        System.out.println("Circle Radius: " + c3.getRadius() + " Area: " + c3.getArea());
        System.out.println("Number of instances: " + Circle.countInstances());
        System.out.println("-------------------------");

        input.close();
    }
}
