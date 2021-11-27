package com.semester;
import java.util.*;
/*
 * Define a class in Java called Commission, which has an
 * instance variable, salesAmount; an appropriate constructor; and
 * a parameterized method, commission(float rate) that returns the commission.

 * Now write a test class to test the Commission class by reading a sales values for three salespersons in an array of objects. Finally, get and show the commission for three salespersons. If the sales are negative, your program should print the message “Invalid Amount”.
 */

class Commission{
    private float salesAmount, rate;

    public Commission(){}

    public Commission(float s, float r){
        this.salesAmount = s;
        this.rate = r;
    }

    public float getSalesAmount() {
        return this.salesAmount;
    }

    public float getRates() {
        return this.rate;
    }

    public void setSalesAmount(float s) {
        if(s > 0) {
            this.salesAmount = s;
        } else {
            System.out.println("Invalid");
        }
    }

    public void setRates(float r) {
        if(r > 0) {
            this.rate = r;
        } else {
            System.out.println("Invalid");
        }
    }

    public double Res() {
        double res = (salesAmount/100)*rate;
        return res;
    }
}

public class Lab6_Question9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\033[H\033[2J");

        Commission c = new Commission();
        System.out.print("Enter your Sales Amount: ");
        c.setSalesAmount(input.nextFloat());

        System.out.print("Enter your Rate: ");
        c.setRates(input.nextFloat());

        System.out.println("Your Commission Amount: " + c.Res());
        input.close();
    }
}
