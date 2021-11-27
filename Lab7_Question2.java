/**
 * @Author: Aman Upadhyay
 */

package com.semester;
import java.util.Scanner;
/*
 * Define a class MotorVehicle
 * Data Members: modelName, modelNumber, modelPrice
 * Methods: 
 * display() – to display the name, price and model number of the vehicle 
 * Car with suitable constructors 
*/
class MotorVehicle {
    String modelName;
    int modelNumber;
    double modelPrice;

    MotorVehicle(String modelName, int modelNumber, double modelPrice) {
        this.modelName = modelName;
        this.modelNumber = modelNumber;
        this.modelPrice = modelPrice;
    }

    void display() {
        System.out.println("Model Name: " + modelName);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Model Price: " + modelPrice);
    }
}

/*
 * Define another class named Car that inherits the class MotorVehicle Data
 * Members: discountRate 
 * Methods: 
    * display() – to display the Car name, Car model number, Car price and the discount rate 
    * discount() – to compute the discount.
 
 * Create the classes MotorVehicle and Car with suitable constructors and test it.
*/

class Car extends MotorVehicle {
    double discountRate;

    Car() {
        super("", 0, 0);
        discountRate = 0;
    }

    Car(String modelName, int modelNumber, double modelPrice, double discountRate) {
        super(modelName, modelNumber, modelPrice);
        this.discountRate = discountRate;
    }

    void display() {
        super.display();
        System.out.println("Discount Rate: " + discountRate);
    }

    double discount() {
        double dis = modelPrice * discountRate/100;
        System.out.println("Discount: " + dis);
        return modelPrice - dis;
    }
}

public class Lab7_Question2 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        
        Car car = new Car();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the model name: ");
        car.modelName = input.nextLine();
        System.out.print("Enter the model number: ");
        car.modelNumber = input.nextInt();
        System.out.print("Enter the model price: ");
        car.modelPrice = input.nextDouble();
        System.out.print("Enter the discount rate: ");
        car.discountRate = input.nextDouble();

        System.out.println("\nCar Details: ");
        car.display();
        System.out.println("Total Amount: " + car.discount());
        input.close();
    }
}