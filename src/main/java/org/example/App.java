
package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Mary Brashear
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //Declare variables
        int c, f;
        String input;
        Scanner sc = new Scanner(System.in);

        //Get user input
        System.out.println("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.");
        input = sc.next();
        //Allow user to enter uppercase or lowercase letters
        input = input.toUpperCase();

        System.out.println("Your choice: " + input);

        //print out findings
        if((input).equals("C")) {
            System.out.println("Please enter the temperature in Fahrenheit:");
            f = sc.nextInt();
            c = (f - 32) * 5 / 9;
            System.out.println("The temperature in Celsius is " + c + ".");
        }
        else if((input).equals("F")) {
            System.out.println("Please enter the temperature in Celsius:");
            c = sc.nextInt();
            f = (c * 9 / 5) + 32;
            System.out.println("The temperature in Fahrenheit is " + f + ".");
        }

        sc.close();
    }
}