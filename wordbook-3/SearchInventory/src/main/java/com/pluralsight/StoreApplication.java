package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class StoreApplication
{
    public static void main(String[] args)
    {
        ArrayList<Product> inventory = getInventory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("We carry the following inventory: ");
        for (int i = 0; i < inventory.size(); i++)
        {
            Product p = inventory.get(i);
            System.out.printf("id: %d %s - Price: $%.2f",
                    p.getId(), p.getName(), p.getPrice());
        }
    }
    public static ArrayList<Product> getInventory()
    {
        ArrayList<Product> inventory = new ArrayList<Product>();
        inventory.add(5,fish);

        return inventory;
    }

}

