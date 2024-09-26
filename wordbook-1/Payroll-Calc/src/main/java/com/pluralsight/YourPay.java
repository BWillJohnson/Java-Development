package com.pluralsight;

import java.util.Scanner;

public class YourPay {
    public static void main(String[] args) {
        Scanner myPay = new Scanner(System.in);
       // Introduction
        System.out.println("Enter your name: ");
        String name = myPay.nextLine();
        System.out.println("Thank you: " + name);
       // Calculations of your Pay.
        System.out.println("Hours worked?");
        double hours = myPay.nextDouble();
        System.out.println("What is your payrate?");
        double payRate = myPay.nextDouble();

        double grosspay = hours * payRate;
        System.out.println(grosspay);




    }

}
