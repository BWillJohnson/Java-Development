package com.pluralsight;

import java.util.Scanner;

public class HoagieShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hey there, Whats your age to recieve a hoagie discount.");
        System.out.println("Enter age:     ");
        int age = input.nextInt();

        if (17 >= age) {
            System.out.println("Great you have received a 10% discount!");
        } else {
            System.out.println("Great you have received a 20% discount!");
        }
        calculateFinalPrice(age, input);
    }

    public static double calculateFinalPrice(int age, Scanner myScan) {

        System.out.println("What size hoagie would you like?");
        System.out.println(" We have a reg size [1] hoagie for $5.45, and a [2] Large hoagie for $8.95:  " );

        double basePrice1 = 5.45 * 0;
        double basePrice = 8.95 * 0;


    }
}

