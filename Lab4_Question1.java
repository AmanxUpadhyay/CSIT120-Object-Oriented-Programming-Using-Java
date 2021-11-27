package com.semester;

/*
 * Create a class called Time contains three instance variables (data members) to store, hours, minutes and seconds.
 * Define constructor(s) to initialize the data members with user input.
 * Define a method to show the time in hh:mm:ss format.
 * Define a method to add two time-objects and store the result in a third time object.

 ! Write suitable code to show the time in proper format where the values for seconds and minutes are lesser than 60. Write suitable code to test the Time class and its functionalities.
 */

class Time {
    private int seconds, minutes, hours;

    public Time() {
    }

    public Time(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public int getHours() {
        return this.hours;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public Time addTime(Time time) {
        Time result = new Time();

        int seconds = this.seconds + time.getSeconds();
        if (seconds >= 60) {
            seconds -= 60;
            this.minutes++;
        }

        int minutes = this.minutes + time.getMinutes();
        if (minutes >= 60) {
            minutes -= 60;
            this.hours++;
        }

        int hours = this.hours + time.getHours();
        if (hours >= 24) {
            hours -= 24;
        }

        result.setSeconds(seconds);
        result.setMinutes(minutes);
        result.setHours(hours);

        return result;
    }
}

public class Lab4_Question1 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.println("\n_______________________________");

        Time Time1 = new Time(20, 25, 1);
        Time Time2 = new Time(20, 25, 1);
        Time Time3 = Time1.addTime(Time2);

        System.out.println("      Time: " + Time3.getHours() + " : " + Time3.getMinutes() + " : " + Time3.getSeconds());
        System.out.println("-------------------------------");
    }
}
