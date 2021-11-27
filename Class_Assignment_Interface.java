package com.semester;

import java.util.Scanner;

/*
 * Q1) Create an interface called Player. The interface has an abstract method 
 * called play() that displays a message describing the meaning of “play” to the
 * class. Create classes called Child, Musician, and Actor that all implement Player. Create an application (TestPlayer.java) that demonstrates the use of the classes.
 */

interface Player {
    abstract void play(String s);
}

class Child implements Player {
    @Override
    public void play(String s) {
        System.out.printf(s+" is Child and he is playing");
    }
}

class Musician implements Player {
    @Override
    public void play(String s) {
        System.out.printf(s +" is Musician and he is playing");
    }
}

class Actor implements Player {
    @Override
    public void play(String s) {
        System.out.printf(s +" is Actor and he is playing");
    }
}

public class Class_Assignment_Interface {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Scanner sc = new Scanner(System.in);
        
        Player p1 = new Child();
        
        System.out.printf("Enter the name: ");
        String name = sc.nextLine();
        p1.play(name);

        System.out.printf("\nEnter the name: ");
        name = sc.nextLine();
        Player p2 = new Musician();
        p2.play(name);
        
        
        System.out.printf("\nEnter the name: ");
        name = sc.nextLine();
        Player p3 = new Actor();
        p3.play(name);

        sc.close();
    }
}
