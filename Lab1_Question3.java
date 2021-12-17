package com.semester;

public class Lab1_Question3 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        double celsius = 100.0, fahrenheit = 0.0;

        fahrenheit = (celsius * 1.8) + 32;
        System.out.println(" Value of temperature in fahrenheit:" + fahrenheit);
    }
}
