package com.pluralsight;

public class ProgramRunner {
    public static void main(String[] args) {
       mopedScooter slowRide = new mopedScooter("turq","Red",25,5,1,10,1000);


        semiTruck semiTruck = new semiTruck("Chevy","black",125,4,4,15,1);

        hoverCraft hoverCraft = new hoverCraft("backToFuture","Blue",50,100,4,20,80);

        Car car = new Car("Nissan","Neon",90,100,4,5,4);


        // Test the functionality of the classes and methods
        slowRide.ride();
        semiTruck.loadCargo();
        hoverCraft.hover();
        car.openTrunk();

        // Accessing Vehicle getters
        System.out.println("Color of the Moped: " + slowRide.getColor());
        System.out.println("Fuel capacity of the SemiTruck: " + semiTruck.getFuelCapacity());
        System.out.println("Air cushion pressure of the HoverCraft: " + hoverCraft.getAirCushionPressure());
        System.out.println("Top speed of the Car: " + car.getTopSpeed());
    }
}
