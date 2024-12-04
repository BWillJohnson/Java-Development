package com.pluralsight;

import Models.Actor;
import com.pluralsight.DBManager.DataManager;
import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class QueryApp {
    public static void main(String[] args) throws SQLException {
        if (args.length != 2) {
            System.out.println("Username and Password are needed to connect to the Database!");
            System.exit(1);
        }

        String username = args[0];
        String password = args[1];

        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/Sakila");
        dataSource.setUsername(username);
        dataSource.setPassword(password);

        DataManager dataManager = new DataManager(dataSource);

        Scanner myScan = new Scanner(System.in);

        System.out.println("Please enter a actor lastName: ");
       String lastName = myScan.nextLine();
        List<Actor> actor = dataManager.getActorByLastNameRequest(lastName);
        if (!actor.isEmpty()){
            System.out.println("lastName matches are:\n ");

            for (Actor actors : actor) {
                System.out.println("Actor ID: " + actors.getActorID());
                System.out.println("FirstName: " + actors.getFirstName());
                System.out.println("LastName: " + actors.getLastName());
                System.out.println();
            }
        }else {
            System.err.println("Notice NO MATCHES!");
        }

    }
}
