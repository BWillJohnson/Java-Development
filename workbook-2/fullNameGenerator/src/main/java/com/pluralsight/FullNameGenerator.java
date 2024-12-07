package com.pluralsight;

import java.util.Scanner;

public class FullNameGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String firstName = getFirstName(input);
        String middleName = getMiddleName(input);
        String lastName = getLastName(input);
        String suffix = getSuffixName(input);
        getWelcome();
        printFullName(firstName, middleName, lastName, suffix);

    }

    public static String printFullName(String firstName, String middleName, String lastName, String suffix) {
        String fullName = firstName + middleName + lastName + suffix;

        if (!middleName.isEmpty() && !suffix.isEmpty()) {
            System.out.println("FullName: " + firstName + " " + lastName);
        } else if (!suffix.isEmpty()) {
            System.out.println("FullName: " + firstName + " " + middleName + " " + lastName);
        } else if (!middleName.isEmpty()) {
            System.out.println("FullName: " + firstName + " " + lastName + " " + suffix);
        } else {
            System.out.println("FullName: " + firstName + " " + middleName + " " + lastName + " " + suffix);
        }
        return firstName + middleName + lastName + suffix;
    }

    public static String getFirstName(Scanner input) {
        System.out.println("Enter your firstName: ");
        return input.nextLine();
    }

    public static String getMiddleName(Scanner input) {
        System.out.println("Enter your middleName: ");
        String middleName = input.nextLine();
        return middleName;
    }

    public static String getLastName(Scanner input) {
        System.out.println("Enter your lastName: ");
        String lastName = input.nextLine();
        return lastName;
    }

    public static String getSuffixName(Scanner input) {
        System.out.println("Enter your suffixName: ");
        String suffixName = input.nextLine();
        return suffixName;
    }

    public static String getWelcome() {
        String greetings = " Welcome to Java! ";
        System.out.println(greetings);

        return greetings;
    }

}
