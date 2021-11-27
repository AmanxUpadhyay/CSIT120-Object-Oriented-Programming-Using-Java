package com.semester;

class Shape {
    float area, perimeters;

    public Shape() {
    }

    public Shape(float a, float p) {
        this.area = a;
        this.perimeters = p;
    }

    public float Area(float w, float h) {
        return w * h;
    }

    public float Perimeter(float w, float h) {
        return 2 * (w + h);
    }

    public float Area(float r) {
        float PI = 3.14f;
        return PI * (r * r);
    }

    public float Perimeter(float r) {
        float PI = 3.14f;
        return 2 * PI * r;
    }
}

public class Lab3_Question3 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Shape shape = new Shape();

        shape.area = shape.Area(10, 20);
        shape.perimeters = shape.Perimeter(10, 20);

        System.out.println("Area of Rectangle: " + shape.area);
        System.out.println("Perimeter of Rectangle: " + shape.perimeters);
    }
}
