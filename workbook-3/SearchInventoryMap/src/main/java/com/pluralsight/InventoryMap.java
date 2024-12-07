package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;
public class StoreApp
{
    // the key is the product id, the value is a product object
    static HashMap<Integer, String> inventory =  new HashMap<>();
    static void main(String[] args) {
// this method loads product objects into inventory
        loadInventory();
        Scanner scanner = new Scanner(System.in);
        System.out.print("What item # are you interested in? ");
        int id = scanner.nextInt();
        String matchedProduct = inventory.get(id);
        if (matchedProduct == null) {
            System.out.println("We don't carry that product");
            return;
        }
        System.out.printf("We carry %s and the price is $%.2f", matchedProduct.getName(), matchedProduct.getPrice());
    }

    private static void loadInventory() {

        try {
            BufferedReader BR = new BufferedReader(new FileReader("inventory.csv"));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
