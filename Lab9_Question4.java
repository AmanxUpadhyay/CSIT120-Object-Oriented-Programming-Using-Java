package com.semester;

import java.util.Scanner;

class TooHotException extends Exception {
    public TooHotException(String msg) {
        super(msg);
    }
}

class TooColdException extends Exception {
    public TooColdException(String msg) {
        super(msg);
    }
}

public class Lab9_Question4 {
    /*
     * Function to: If temperature > 40, throw exception “TooHot”.
     * If temperature <8, throw exception “TooCold”.
     * Otherwise, print “Normal” and convert it to Fahrenheit.
    */
    public static void checkTemperature(double temperature) throws TooHotException, TooColdException {
        if (temperature > 40) {
            throw new TooHotException("Too hot");
        } else if (temperature < 8) {
            throw new TooColdException("Too cold");
        } else {
            System.out.print("Normal: ");
            System.out.print(temperature * 9 / 5 + 32);
        }
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temperature = input.nextDouble();
        
        try {
            checkTemperature(temperature);
        } catch (TooHotException e) {
            System.out.println(e.getMessage());
        } catch (TooColdException e) {
            System.out.println(e.getMessage());
        }

        input.close();
    }
}
