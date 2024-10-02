package com.pluralsight;

import java.util.Scanner;

public class HoagieShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hey there, Whats your age to received a hoagie discount.");
        System.out.println("Enter age:     ");
        int age = input.nextInt();

        if (17 >= age) {
            System.out.println("Great you have received a 10% discount!");
        } else {
            System.out.println("Great you have received a 20% discount!");
        }


        System.out.println("What size hoagie would you like?");
        System.out.println(" We have a reg size [1] hoagie for $5.45, and a [2] Large hoagie for $8.95");
        System.out.println("Enter your hoagieSize: ");
        int hoagieSize = input.nextInt();

        double basePrice;
        if (hoagieSize == 1) {
            basePrice = 5.45;
        } else if (hoagieSize == 2) {
            basePrice = 5.45;
        } else {
            System.out.println("Error hoagie size");
            return;
        }


        double discountPercentage;
        if (age <= 17) {
            discountPercentage = 0.1;
        } else {
            discountPercentage = 0.2;
        }
        double finalPrice = basePrice * (1 - discountPercentage);
        System.out.println(finalPrice);

    }
}

