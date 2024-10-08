package com.pluralsight;

import java.util.Random;
import java.util.Scanner;

public class quotesGuys {
    public static void main(String[] args) {
        String[] quotes = {
                "I will become the king of the pirates",
                "A stitch in time saves nine",
                "Actions speak louder than words",
                "Inherited Will, The swelling of the changing times, and the dreams of people",
                "Death is never an apology.",
                "I don’t care what my place in the world is. I just want to know what I am capable of",
                "An apple a day keeps the doctor away",
                "It’s not about whether you can or can’t do it. You just do it.",
                "We have to live a life of no regrets",
                "You reap what you sow"
        };

        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        Random random = new Random();

        while (continueLoop) {
            try {
                System.out.println("1. Enter a number between 1-10 to display a specific quote.");
                System.out.println("2. Enter 'R' to display a random quote.");
                System.out.print("Your choice: ");

                String input = scanner.next();

                if (input.equalsIgnoreCase("R")) {
                    int randomIndex = random.nextInt(quotes.length);
                    System.out.println(quotes[randomIndex]);
                } else {
                    int index = Integer.parseInt(input);
                    System.out.println(quotes[index - 1]);
                }

                System.out.print("Do you want to see another quote? (Y/N): ");
                String answer = scanner.next();

                if (answer.equalsIgnoreCase("N")) {
                    continueLoop = false;
                }
            } catch (Exception exception) {
                System.out.println("Invalid input. Enter the number buddy.");
                scanner.nextLine();  // Clear the buffer.
            }
        }

        scanner.close();
    }
}