package com.pluralsight;

public class mopedScooter extends modifiedVehicles {
    public mopedScooter(String model, String color, int topSpeed, int fuelCapacity, int numberOfPassengers, int cargoCapacity, int maxWeight) {
        super(model, color, topSpeed, fuelCapacity, numberOfPassengers, cargoCapacity);
        this.maxWeight = maxWeight;
    }

    private int maxWeight;

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void ride() {
        System.out.println("Riding the moped.");
    }
}
