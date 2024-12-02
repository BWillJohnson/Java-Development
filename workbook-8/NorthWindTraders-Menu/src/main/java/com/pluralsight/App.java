package com.pluralsight;

import java.sql.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws ClassNotFoundException {
        Connection connection = null;
        PreparedStatement Statement = null;
        ResultSet results = null;

        try {
            if (args.length != 2) {
                System.out.println("Notice need userName and Password");
                System.exit(1);
            }
            String username = args[0];
            String password = args[1];

            Scanner myScan = new Scanner(System.in);
            boolean running = false;
            while (!running){
                System.out.println("--- Welcome to Northwind traders----");
                System.out.println("1. Display all products");
                System.out.println("2. Display all customers");
                System.out.println("0. Exit -> ");

                System.out.println("Select your option Here: ");
                int option = myScan.nextInt();

                switch (option){
                    case 1 -> processAllProducts(username,password);
                    case 2 -> ProcessAllCustomers(username,password);
                    case 0 ->  running =true;
                    default -> System.err.println("Notice option is incorrect");
                }
            }



            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/northwind", username, password);

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (results != null) {
                try {
                    results.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (Statement != null) {
                try {
                    Statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
    public static void processAllProducts(String username, String password) throws ClassNotFoundException {
        Connection connection = null;
        PreparedStatement Statement = null;
        ResultSet results = null;

        Class.forName("com.mysql.cj.jdbc.Driver");

        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/northwind", username, password);


            String query = "SELECT ProductID, ProductName, UnitPrice, UnitsInStock FROM products";

            Statement = connection.prepareStatement(query);

            results = Statement.executeQuery();

            while (results.next()) {
                int productId = results.getInt("ProductID");
                String productName = results.getString("ProductName");
                double unitPrice = results.getDouble("UnitPrice");
                int unitsInStock = results.getInt("UnitsInStock");

                System.out.println("Product ID: " + productId);
                System.out.println("Product Name: " + productName);
                System.out.println("Unit Price: " + unitPrice);
                System.out.println("Units In Stock: " + unitsInStock);
                System.out.println("-----------------------------------------");
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (results != null) {
                try {
                    results.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (Statement != null) {
                try {
                   Statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
    }
    public static void ProcessAllCustomers(String username, String password) throws ClassNotFoundException{
        Connection connection = null;
        PreparedStatement Statement = null;
        ResultSet results = null;

        Class.forName("com.mysql.cj.jdbc.Driver");

        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/northwind", username, password);


            String query = "SELECT CustomerID, CompanyName, ContactName, ContactTitle, Country FROM customers";

            Statement = connection.prepareStatement(query);

            results = Statement.executeQuery();

            while (results.next()) {
                String CustomerID = results.getString("CustomerID");
                String CompanyName = results.getString("CompanyName");
                String ContactName = results.getString("ContactName");
                String ContactTitle = results.getString("ContactTitle");
                String Country = results.getString("Country");

                System.out.println("CustomerID: " + CustomerID);
                System.out.println("Company Name: " + CompanyName);
                System.out.println("Contact Name: " + ContactName);
                System.out.println("Contact Title: " + ContactTitle);
                System.out.println("Country: " + Country);
                System.out.println("-----------------------------------------");
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (results != null) {
                try {
                    results.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (Statement != null) {
                try {
                    Statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }


    }
}
