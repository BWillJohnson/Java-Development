package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        // Create a new instance of CellPhone
        CellPhone cellPhone1 = new CellPhone();
        CellPhone cellPhone2 = new CellPhone();
        CellPhone cellPhone3 = new CellPhone(153035, "iphone x", "Xfinity", "7177777777", "Luffy");

        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the information for CellPhone 1:");
        // Prompt user for cell phone information and set the properties
        System.out.print("What is the serial number? ");
        int serialNumber = scanner.nextInt();  // Read integer value
        cellPhone1.setSerialNumber(serialNumber);
        scanner.nextLine();  // Consume newline

        System.out.print("What model is the phone? ");
        String model = scanner.nextLine();  // Read entire line till newline
        cellPhone1.setModel(model);

        System.out.print("Who is the carrier? ");
        String carrier = scanner.nextLine();
        cellPhone1.setCarrier(carrier);

        System.out.print("What is the phone number? ");
        String phoneNumber = scanner.nextLine();
        cellPhone1.setPhoneNumber(phoneNumber);

        System.out.print("Who is the owner of the phone? ");
        String owner = scanner.nextLine();
        cellPhone1.setOwner(owner);
        System.out.println("=============================================");
        System.out.println("Enter the information for CellPhone 2:");

        System.out.print("What is the serial number? ");
        serialNumber = scanner.nextInt();  // Read integer value
        cellPhone2.setSerialNumber(serialNumber);
        scanner.nextLine();  // Consume newline

        System.out.print("What model is the phone? ");
        model = scanner.nextLine();  // Read entire line till newline
        cellPhone2.setModel(model);

        System.out.print("Who is the carrier? ");
        carrier = scanner.nextLine();
        cellPhone2.setCarrier(carrier);

        System.out.print("What is the phone number? ");
        phoneNumber = scanner.nextLine();
        cellPhone2.setPhoneNumber(phoneNumber);

        System.out.print("Who is the owner of the phone? ");
        owner = scanner.nextLine();
        cellPhone2.setOwner(owner);
        System.out.println("===============================================");
        System.out.print("What is the serial number? ");
        int serialNumber = scanner.nextInt();  // Read integer value
        cellPhone3.setSerialNumber(serialNumber);
        scanner.nextLine();  // Consume newline

        System.out.print("What model is the phone? ");
        String model = scanner.nextLine();  // Read entire line till newline
        cellPhone3.setModel(model);

        System.out.print("Who is the carrier? ");
        String carrier = scanner.nextLine();
        cellPhone3.setCarrier(carrier);

        System.out.print("What is the phone number? ");
        String phoneNumber = scanner.nextLine();
        cellPhone3.setPhoneNumber(phoneNumber);

        System.out.print("Who is the owner of the phone? ");
        String owner = scanner.nextLine();
        cellPhone3.setOwner(owner);

        // Close the scanner
        scanner.close();

        display(cellPhone1);
        display(cellPhone2);
        display(cellPhone3);

        cellPhone1.dial(cellPhone2.getPhoneNumber());
        cellPhone2.dial(cellPhone1.getPhoneNumber());
        cellPhone2.dial(cellPhone3.getPhoneNumber());
        cellPhone1.dial(cellPhone3.getPhoneNumber());


    }

    public static void display(CellPhone phone) {
        System.out.println("\nCellPhone Details:");
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
    }

}