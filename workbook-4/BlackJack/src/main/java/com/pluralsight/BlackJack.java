package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class BlackJack {
    private ArrayList<Card> cards;

    public static void main(String[] args) {

        Scanner myScan =new Scanner(System.in);
        // Prompt gambler to play BlackJack!
        System.out.println("Hi welcome to BlackJack!");
        System.out.println("Here a quick run down the goal of this game is to hit 21 or close 21.\n");
        System.out.println("!Notice! !Scoring Rules!");
        System.out.println("All number cards are worth their numeric value.");
        System.out.println("Face cards are worth 10 points.");
        System.out.println("Ace is worth 11 points.");
        System.out.println("=====================================================================");
        System.out.println("Enter your name gambler: ");
        String gambler = myScan.nextLine();
        System.out.println("Ready to gamble!" + " " + gambler);

        //I need to create and shuffle my deck.
        Deck deck = new Deck();
        deck.shuffle();

        //I need to call the hand
        Hand gamblerHand = new Hand();
        gamblerHand.deal(deck.deal());
        gamblerHand.deal(deck.deal());
        Hand dealersHand = new Hand();
        dealersHand.deal(deck.deal());
        dealersHand.deal(deck.deal());
        System.out.println("gambler shows hand " + gamblerHand);
        gamblerHand.print();

        System.out.println("===================");
        System.out.println("Dealer shows hand " + dealersHand);
        dealersHand.print();

        int  gamblerScore = gamblerHand.getValue();
        int dealerScore = dealersHand.getValue();

        System.out.println("Winner of this table: ");







    }

}
