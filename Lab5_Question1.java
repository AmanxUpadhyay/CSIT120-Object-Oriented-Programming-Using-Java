package com.semester;

import java.util.*;

/*
 * Design a class program in Java to calculate the discount given to a customer on purchasing LED TV. The program also displays the amount paid by the customer after discount as following.
 * Class Name: Television
 * Data Members: cost (float), discount (float), amount (float)
 * Member Functions (you may assume suitable arguments):
    * accept () – to input the cost of TV
    * calculate () – to calculate the discount
    * display () – to show the discount and the amount paid after discount
*/

class Television {
    private float cost, discount, amount;
    Scanner input = new Scanner(System.in);

    Television() {
    }

    public void Accept() {
        System.out.println("\n------------------------------");
        System.out.print("Enter The Cost: ");
        cost = input.nextInt();
        Calculate();
    }

    private void Calculate() {
        if (cost > 0) {
            if (cost >= 25000) {
                discount = 25;
            } else if (cost >= 10000) {
                discount = 10;
            } else if (cost >= 5000) {
                discount = 5;
            } else {
                discount = 0;
            }
            amount = cost - discount / 100 * cost;
            Display();
        } else {
            System.out.println("Enter Valid Cost");
            Accept();
        }
    }

    private void Display() {
        System.out.println("------------------------------");
        if (discount > 0) {
            System.out.println("Discount: " + discount + "%");
            System.out.println("Pay the Amount: " + amount);
        } else {
            System.out.println("Pay the Amount: " + amount);
        }
        System.out.println("------------------------------");
    }
}

public class Lab5_Question1 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Television Tv = new Television();
        Tv.Accept();
    }
}