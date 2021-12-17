package com.semester;

import java.util.Scanner;

public class Class_Assignment_TestException {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, pSum = 0, nSum = 0;

        num = input.nextInt();

        while (num != 0) {
            if(num < 0) {
                nSum += num;
            } else {
                pSum += num;
            }
            num = input.nextInt();
        }

        System.out.println("Positive sum: " + pSum);
        System.out.println("Negative sum: " + nSum);

        // What is the input for num that covers the independent path 1.2.7? Answer: -1


        input.close();
    }
}

/*

What is the independent path covered by the input 10 and then 0?
Answer: 10 + 0 = 0 (0 is the independent path)

Cyclomatic complexity for the above code is: 1

*/