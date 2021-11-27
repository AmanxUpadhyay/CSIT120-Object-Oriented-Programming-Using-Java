package com.semester;

/*
 * Define a class called Point with two member variables x and y of time int. Define constructor(s) to initialize x and y.
 * Now define another class called Rectangle with width (int) , hight(int) and origin (Point) as member variables.
 * Define suitable constructor(s) to initialize the data members.
 * Define a method called move( ) which takes the value for x and y to move the origin.
 * Also, define suitable method(s) to calculate area and perimeter of the rectangle.
 ! Write suitable code to test the functionalities of the Rectangle class.
 */

class Point {
    private int x, y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class Rectangle1 {
    private int width, height;
    private Point origin;

    public Rectangle1(int width, int height, int x, int y) {
        this.width = width;
        this.height = height;
        this.origin = new Point(x, y);
    }

    public void setWidth(int x) {
        this.width = x;
    }

    public void setHeight(int y) {
        this.height = y;
    }

    public void moveOrigin(int x, int y) {
        this.origin.setX(x);
        this.origin.setY(y);
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public Point getOrigin() {
        return this.origin;
    }
}

public class Lab4_Question2 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        Rectangle1 rect = new Rectangle1(15, 20, 3, 4);
        System.out.println("Old Origin Point:: " + rect.getOrigin().getX() + " " + rect.getOrigin().getY());

        rect.moveOrigin(5, 6);
        System.out.println("New Origin Point:: " + rect.getOrigin().getX() + " " + rect.getOrigin().getY());
    }
}