package com.pluralsight;

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;

    public class MathApp {
    public static void main(String[] args) {
       // Q1
        double bobsalary = 15000;
        double garysalary = 23000;
        double highestSalary = Math.max(bobsalary, garysalary);
        System.out.println("The highest salary is" + highestSalary);

        //Q2
        int carPrice = 5_000;
        int truckPrice = 15_000;
        System.out.println(Math.max(carPrice,truckPrice));

        System.out.println("Q2_Truck");

        //Q3
        double radius = 7.25;
        double area = Math.PI * Math.pow(radius,2);
        System.out.print("The area of a circle radius " + radius);

        //Q4
            double num1 = 5.0;
            double sqrtnum1 = Math.sqrt(num1);
            System.out.println(Math.sqrt(num1));

        //Q5
        double pointsDistance = Math.hypot(85-5, 50-10);

        System.out.println(pointsDistance);

        //Q6 Absolute value
        System.out.println(Math.abs(-4.7));

        //Q7
        double num4 = 1;
        double num5 = 10;
        System.out.println(Math.random());


        }


    }