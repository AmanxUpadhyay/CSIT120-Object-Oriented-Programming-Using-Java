package com.semester;

/*
 * Write a program in Java to implement Money class. This class should have
 * field for initializing a rupee and paisa value. The paisa value will be in
 * the range from 0 -99 with the paisa being the same sign as that of rupees.
 * The class should have all reasonable constructors, addition, subtraction
 * methods, and a main () method that provides a thorough test of all the
 * methods in the class.
*/

class Money {
    private int Rupee, Paisa;

    public Money() {
    }

    public Money(int r, int p) {
        this.Rupee = r + p / 100;
        this.Paisa = p % 100;
    }

    public void Addition(int r, int p) {
        Paisa = Paisa + p;
        int Temp = Paisa / 100;
        Paisa = Paisa % 100;
        Rupee = Rupee + Temp + r;
    }

    public void Subtraction(int r, int p) {
        int Temp = p / 100;
        p = p % 100;

        if (p > Paisa) {
            Paisa = Paisa + 100;
            Rupee = Rupee - 1;
            Paisa = Paisa - p;
        } else {
            Paisa = Paisa - p;
        }
        Rupee = Rupee - r - Temp;
    }

    public void Res() {
        System.out.println("Money: " + this.Rupee + "." + this.Paisa);
    }
}

public class Lab7_Question1 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        Money m1 = new Money(0, 50);
        m1.Res();

        m1.Addition(0, 60);
        m1.Res();

        m1.Subtraction(0, 60);
        m1.Res();
    }
}
