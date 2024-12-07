package com.pluralsight;

import java.util.Scanner;

public class animeLibrary {
    private static final Books[] Book = new Books[15];

    public static void main(String[] args) {
        // Initializing ArrayList

        Book[0] = new Books(1, 978, "Naruto Volume 1");
        Book[1] = new Books(2, 979, "Demon Slayer Volume 7");
        Book[2] = new Books(3, 980, "One Piece Volume 3");
        Book[3] = new Books(4, 981, "My Hero Academia Volume 10");
        Book[4] = new Books(5, 982, "How i killed the demon king Volume 8");

        displayBookLog(Book);
        System.out.println("Invalid Book entry please click in between [0] - [4], Thank You!!");

    }

    public static void displayBookLog(Books[] books) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println(" Hi welcome to the Anime library!");
            System.out.println(" [1] Books available for me:  ");
            System.out.println(" [2] Books that are Checked out: ");
            System.out.println(" [3] EXIT library");
            System.out.println("\nEnter your response: ");

            int option = input.nextInt();

            switch (option) {
                case 1:
                    displayWholeBookShelf(books, input);
                    break;
                case 2:
                    displayBookHistory(input);
                    break;
                case 3:
                    System.out.println("Sayonara!");
                default:
                    System.err.println();
            }
        }


    }
    public static void displayWholeBookShelf(Books[] book, Scanner input) {
        System.out.println("available Books!: ");
        boolean present = false;
        for (Books manga : book) {
            if (!book.getIsCheckedOut()) {
                System.out.println("ID: " + book.getID() + " / " + book.getISBN() + " / " + book.getTitle());
                present = true;
            }
        }
        if (!present) {
            System.out.println("\nOops sorry book is not available, Try again later");
            return;
        }
        System.out.println("\n To check out a book,you need to enter IDN, or 0 to go return to home: ");

        int IDN = input.nextInt();
        input.nextLine();

        if (IDN == 0) {
            return;
        }
        for (Books books : book) {
            if (books.getID() == IDN && !books.getIsCheckedOut()) {
                System.out.println("\nEnter your name, your fantasy awaits: ");
                String nameOfReader = input.nextLine();
                books.logOut(nameOfReader);
                return;
            }
        }
        System.out.println("Book is currently on a journey already sorry, Try again later: ");
    }

    public static void displayBookHistory(Scanner input) {
        System.out.println("\nHere are all the books that are CheckedOut already!: ");
        boolean present = false;
        for (Books books : Book) {
            if (books.getIsCheckedOut()) {
                System.out.println("\nIDN " + books.getID() + " " + "ISBN" + " " + books.getISBN() + " " + books.getTitle() + " " + "Checked out to " + " " + books.getIsCheckedTo());
                present = true;
            }
        }
        if (!present) {
            System.out.println("Hey ^_^ i found the book and its here!");
        }
        System.out.println("\n Enter [C] to check a book in, Enter [X] to go back to main menu: ");
        String option = input.nextLine().toUpperCase();
        if (option.equalsIgnoreCase("X")) {
            System.out.println("Ok, Main menu.");
        } else if (option.equalsIgnoreCase("C")) {
            System.out.println("\nEnter the book IDN to check the book in ^_^");
            int IDN = input.nextInt();

            for (Books books : Book) {
                if (books.getID() == IDN && books.getIsCheckedOut()) {
                    books.logIn();
                    return;
                }
            }
        } else {
            System.err.println("\n ERROR: Invalid option.");
        }

    }


}