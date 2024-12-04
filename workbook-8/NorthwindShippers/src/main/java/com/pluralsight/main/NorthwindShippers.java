package com.pluralsight.main;

import com.pluralsight.db.DataManager;
import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.util.Scanner;

public class NorthwindShippers {

    public static void main(String[] args) {
        if (args.length != 2){
            System.out.println(" !NOTICE! Need to provided a username and password!");
            System.exit(1);
        }
        String username = args[0];
        String password = args[1];

        BasicDataSource northwindDataSource = new BasicDataSource();
        northwindDataSource.setUrl("jdbc:mysql://localhost:3306/northwind");
        northwindDataSource.setUsername(username);
        northwindDataSource.setPassword(password);

        DataManager dataManager = new DataManager(northwindDataSource);

        Scanner myScan = new Scanner(System.in);

        System.out.println("Enter shipper name ");

        while (true){
            System.out.println("----Shippers--Menu----");
            System.out.println("1. Insert Shippers (Name & Phone)");
            System.out.println("2. Update shipper phone number");
            System.out.println("3. Delete Shipper// Notice DO NOT DELETE 1-3 for any reason");

            System.out.println("Enter you option here: ");
            int choice = myScan.nextInt();
            myScan.nextLine();

            switch (choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
        }
    }
}
