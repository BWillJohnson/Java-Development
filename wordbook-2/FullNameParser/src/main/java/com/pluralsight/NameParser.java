package com.pluralsight;

import java.util.Scanner;

public class NameParser {
    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);

        String firstName = getFirstName(myScan);
        String middleName = getMiddleName(myScan);
        String lastName = getLastName(myScan);
        printStatement(firstName, middleName, lastName);
    }

    public static String getFirstName(Scanner myScan) {
        System.out.println(" Enter your firstName: ");
        String firstName = myScan.nextLine().trim();
        // String trimmed.firstName = firstName.trim();
        System.out.println(firstName.trim());
        return firstName;

       
    }


    public static String getLastName(Scanner myScan) {
        System.out.println(" Enter your lastName: ");
        return myScan.nextLine();
    }


    public static String getMiddleName(Scanner myScan) {
        System.out.println(" Enter your middleName: ");
        return myScan.nextLine();
    }

    public static void printStatement(String firstName, String middleName, String lastName) {
        System.out.println("Hey  " + firstName + " " + middleName + " " + lastName);
    }
    // String trimmed entity = entity.trim();

}
