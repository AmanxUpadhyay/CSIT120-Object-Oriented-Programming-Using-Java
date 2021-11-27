package com.semester;

/*
 * Write a program in Java that implements method overloading and shows passing object as parameter.
 */
class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        length = 0.0;
        width = 0.0;
    }

    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public void setLength(double l) {
        length = l;
    }

    public void setWidth(double w) {
        width = w;
    }

    public void set(double l, double w) {
        length = l;
        width = w;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }
}

public class Lab5_Question5 {

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 20);

        System.out.println("Length : " + rect.getLength());
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Area: " + rect.getArea());

        changeRectangle(rect);

        System.out.println();
        System.out.println("Length : " + rect.getLength());
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Area: " + rect.getArea());
    }

    public static void changeRectangle(Rectangle r) {
        r.set(30, 5);
    }
}
