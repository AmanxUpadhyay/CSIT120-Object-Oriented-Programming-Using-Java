package com.semester;

/*
 * Create a class call Calculation which contains various methods for addition, multiplication and subtraction of integers and floats.
 * Use method overloading to accept
 * 2 integers/floats and
 * 3 integers/floats and so on where the name for all addition functions will be same and same as for multiplication and subtraction.
*/

class Calculation {
    public int add(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public int divide(int x, int y) {
        return x / y;
    }

    public float add(float x, float y) {
        return x + y;
    }

    public float subtract(float x, float y) {
        return x - y;
    }

    public float multiply(float x, float y) {
        return x * y;
    }

    public float divide(float x, float y) {
        return x / y;
    }

    public int add(int x, int y, int z) {
        return x + y + z;
    }

    public int subtract(int x, int y, int z) {
        return x - y - z;
    }

    public int multiply(int x, int y, int z) {
        return x * y * z;
    }

    public int divide(int x, int y, int z) {
        return (x / y) / z;
    }

    public float add(float x, float y, float z) {
        return x + y + z;
    }

    public float subtract(float x, float y, float z) {
        return x - y - z;
    }

    public float multiply(float x, float y, float z) {
        return x * y * z;
    }

    public float divide(float x, float y, float z) {
        return (x / y) / z;
    }
}

public class Lab3_Question2 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        
        Calculation c = new Calculation();
        System.out.println(c.add(10, 20));
        System.out.println(c.add(10, 20, 30));

        System.out.println(c.subtract(10, 20));
        System.out.println(c.subtract(10, 20, 30));

        System.out.println(c.multiply(10, 20));
        System.out.println(c.multiply(10, 20, 30));

        System.out.println(c.divide(30, 10));
        System.out.println(c.divide(30, 10, 5));
    }
}
