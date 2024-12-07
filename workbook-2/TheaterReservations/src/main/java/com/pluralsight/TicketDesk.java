package com.pluralsight;

import java.time.LocalDate;
import java.util.Scanner;

public class TicketDesk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How are you, Whats your name?:  ");
        String fullName = input.nextLine();

        int indexOfSpace = fullName.indexOf("");
        String firstName = fullName.substring(0, indexOfSpace);
        String lastName = fullName.substring(indexOfSpace + 1);

        System.out.println("What date will you be attending the Theater (MM/DD/YYYY): ");
        String datefl = input.nextLine();

    }

    public static int printTickets(Scanner input, int date, String firstName, String lastName) {
        System.out.println("Hi, How many tickets are you looking to get: ");
        int numTickets = input.nextInt();
        String ticketString = numTickets == 1 ? " Ticket " : " Tickets ";
        String confirmationMessage = numTickets + ticketString + " Reserved " + date + " under " + lastName + " ," + firstName;
        System.out.println(confirmationMessage);
        return numTickets;

    }

}