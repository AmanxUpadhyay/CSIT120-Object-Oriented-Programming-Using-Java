package com.semester;

import java.util.Scanner;

public class Lab1_Question4 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        
        Scanner io = new Scanner(System.in);
        System.out.println("Input the radius of the circle: ");
        double radius = io.nextDouble();

        System.out.println("Perimeter is = " + (2 * radius * Math.PI));
        System.out.println("Area is = " + (Math.PI * radius * radius));
        io.close();
    }
}
