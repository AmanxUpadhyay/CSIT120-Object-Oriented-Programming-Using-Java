package com.semester;

import java.util.*;

/*
 * Write a program in Java to show that the value of non-static variable is not visible to all the instances, and therefore cannot be used to count the number of instances.
*/
class Circle1 {
    private double Radius;
    private int InstanceCounter;

    public Circle1() {
        InstanceCounter++;
    }

    public int countInstances() {
        return this.InstanceCounter;
    }

    public Circle1(double r) {
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

public class Lab5_Question4 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Scanner input = new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.print("Enter Radius: ");
        double R = input.nextDouble();

        Circle1 c1 = new Circle1(R);

        System.out.println("Circle Radius: " + c1.getRadius() + " Area: " + c1.getArea());
        System.out.println("Number of instances: " + Circle.countInstances());
        System.out.println("-------------------------");

        Circle1 c2 = new Circle1();

        System.out.println("Using setRadius()");
        System.out.print("Enter Radius: ");
        c2.setRadius(input.nextDouble());
        System.out.println("Circle Radius: " + c2.getRadius() + " Area: " + c2.getArea());
        System.out.println("Number of instances: " + Circle.countInstances());
        System.out.println("-------------------------");

        Circle1 c3 = new Circle1();

        System.out.println("Using setRadius()");
        System.out.print("Enter Radius: ");
        c3.setRadius(input.nextDouble());
        System.out.println("Circle Radius: " + c3.getRadius() + " Area: " + c3.getArea());
        System.out.println("Number of instances: " + Circle.countInstances());
        System.out.println("-------------------------");

        input.close();
    }

}
