package com.semester;

class Employee {
    void show() {
        System.out.println("I am an Employee");
    }

    void show(int code) {
        System.out.println("I am an Employee with code " + code);
    }
}

class RegularEmployee extends Employee {
    void f() {
        System.out.println("I am f() of regular employee");
    }

    void show(String name) {
        System.out.println("I am an Employee with name " + name);
    }
}

public class Class_Assignment_Inheritance {
    
}
