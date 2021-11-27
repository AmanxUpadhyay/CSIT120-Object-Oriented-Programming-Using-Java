package com.semester;

/**
 * * Create a class call ComplexNumber which contains two data members (real and imaginary).
 * * Now add three methods as following:
 * * void getComplex(int a, int b) - to get a complex number
 * * void showComplex( ) - to show the complex number
 * * ComplexNumber addComplex(Complex c) - to add two complex number. e.g. c=a.addComplex(b) will add a and b,
 * * the result will be stored in c.
 * * Now write a suitable programme to test the class and its different methods.
*/

class ComplexNumber {
    private int real, imaginary;

    public ComplexNumber() {
    }

    public ComplexNumber(int r, int i) {
        this.real = r;
        this.imaginary = i;
    }

    public void showComplex() {
        System.out.println("Complex Numbers: " + this.real + " + " + this.imaginary + "i");
    }

    public ComplexNumber addComplexNumber(ComplexNumber c) {
        c.real += this.real;
        c.imaginary += this.imaginary;
        return c;
    }
}

public class Lab3_Question1 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        ComplexNumber C1 = new ComplexNumber(10, 20);
        C1.showComplex();

        ComplexNumber C2 = new ComplexNumber(10, 20);
        C2.showComplex();

        ComplexNumber C3 = new ComplexNumber();
        C3 = C1.addComplexNumber(C2);
        System.out.println("-------------------------\nAfter Addition: ");
        C3.showComplex();
    }
}
