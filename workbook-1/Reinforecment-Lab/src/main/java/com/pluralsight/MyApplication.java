package com.pluralsight;

import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = getName(input);

        int age = getAge(input);

        printNameAndAge(name, age);
        System.out.println("=======================================");
        printVotingEligibilty(age);
        System.out.println("=======================================");
        printMessage(name, age);
        System.out.println("=======================================");
        printWelcomeMessage(name);
        System.out.println("=======================================");
        printDrinkingEligibity(name, age);
        System.out.println("=======================================");
        double number = getnum(input);
        System.out.println("========================================");
        double squareRoot = calcSquareRoot(number);
        System.out.println("========================================");
        int firstnum = getFirstNum(input);
        int secondNum = getSecondNum(input);
        boolean isGreaterThan = isGreaterThan(firstnum,secondNum);

        String welcomeMessage = name.equals("Eve") ? "You are not welcome gui," + name + "!" :

    }

    public static String getName(Scanner input) {
        System.out.println(" Enter your name: ");
        return input.nextLine();
    }

    public static int getAge(Scanner input) {
        System.out.println("Enter your age: ");
        return input.nextInt();
    }

    public static void printNameAndAge(String name, int age) {
        System.out.println("Hi what is your Name, Age");
        System.out.println("Enter your age:");

    }

    public static void printMessage(String name, int age) {
        System.out.println("Hey, " + name + " You are " + age + " Years old!");
    }

    public static void printVotingEligibilty(int age) {
        if (age >= 18) {
            System.out.println("You my friend can vote!");
        } else {
            System.out.println("you my friend are not old enough to vote!");
        }
    }

    public static void printWelcomeMessage(String name) {
        if (name.equalsIgnoreCase("Alice")) {
            System.out.println("Hey Alice XD");
        } else {
            System.out.println("Hmmph stranger!");
        }
    }

    public static void printDrinkingEligibity(String name, int age) {
        if (name.equalsIgnoreCase("Bob") && age >= 21) {
            System.out.println("You can drink big fella!");
        } else {
            System.out.println("You cant drink young fella!");
        }
    }

    public static double getnum(Scanner scanner) {
        System.out.println("Enter your number: ");
        return scanner.nextDouble();
    }

    public static double calcSquareRoot(double num) {
        return Math.sqrt(num);
    }

    public static int getFirstNum(Scanner scanner) {
        System.out.println("Emter your first num: ");
        return scanner.nextInt();
    }

    public static int getSecondNum(Scanner scanner) {
        System.out.println("Emter your second num: ");
        return scanner.nextInt();
    }
    public static boolean isGreaterThan(int firstNum, int secondNum){
        if (firstNum > secondNum){
            return true;
        } else {
            return false;
        }
    }
}
