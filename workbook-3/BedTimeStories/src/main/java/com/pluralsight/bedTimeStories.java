package com.pluralsight;

import java.io.FileInputStream;

import java.util.Scanner;

public class bedTimeStories {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Whats your name?");
        scanner.nextLine();
        System.out.println("enter the name of the book file you would like too read with syntax like this entity.txt:\n ");
        String Books = scanner.nextLine().trim();

        scanner.close();
        try {
            FileInputStream fis = new FileInputStream(Books);

            String story;
            int lineCount = 1;
            Scanner input = new Scanner(fis);

            while (input.hasNextLine()) {
                story = lineCount + ". " + input.nextLine().toLowerCase();
                System.out.println(story);
                lineCount++;
            }
        } catch (Exception e) {
            System.out.println( "Enter story EX: golilocks.txt");
            e.printStackTrace();

          scanner.close();
        }

    }
}
