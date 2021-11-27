package com.semester;

class Employee1 // super class
{
    void show() {
        System.out.println("I am an Employee");
    }

}

class RegularEmployee1 extends Employee1 // sub class
{
    void show()// Overriding show() of Employee
    {
        System.out.println("I am a Regular Employee");
        super.show(); // show() of Employee class
    }

}

class CasualEmployee extends Employee1 {
    // left it for the students as self assessment
    void show()// Overriding show() of Employee
    {
        System.out.println("I am a Casual Employee");
    }
}
public class Class_Assignment_Inheritance_2 {
    public static void main(String args[]) {
        Employee1 emp; // object of the super class

        System.out.println("emp points to Employee instance");
        emp = new Employee1();
        emp.show(); // show() of Employee

        System.out.println("emp points to RegularEmployee instance");
        emp = new RegularEmployee1(); // emp points to sub class instance
        emp.show();// show() of RegularEmployee

        System.out.println("emp points to CasualEmployee instance");
        emp = new CasualEmployee();// emp points to sub class instance
        emp.show();// show() of CasualEmployee
    }
}

// When a class contain abstract function then it is called abstract class.

/**
 * What is an Abstract class?
 * Ans: An abstract class is a class that contains at least one abstract method. An abstract method is a method that is declared, but contains no implementation. Abstract classes may not be instantiated, and require subclasses to provide implementations for their abstract methods. 
 * Abstract classes are useful when you want to provide a template for subclasses to extend, but don't want to provide all the implementation in the superclass.
 */