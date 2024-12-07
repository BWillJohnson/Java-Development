package com.pluralsight;

import java.util.List;
import java.util.Scanner;

public class StoreApplication
{
    public static void main(String[] args)
    {
        List<Product> inventory = getInventory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("We carry the following inventory: ");
        for (int i = 0; i < inventory.size(); i++)
        {
            Product p = inventory.get(i);
            System.out.printf("id: %d %s - Price: $%.2f",
                    p.getId(), p.getName(), p.getPrice());
        }
    }
    public static List<Product> getInventory() {
        List<Product> inventory = new ArrayList<Product>();
        inventory.add(new Product(2,"Pancakes",9.99));
        inventory.add(new Product(1,"Hotsauce",3.75));
        inventory.add(new Product(3,"Steak",14.99));
        inventory.add(new Product(1,"Turkey",9.75));
        inventory.add(new Product(1,"A1 sauce",6.75));

        return inventory;
    }


}

