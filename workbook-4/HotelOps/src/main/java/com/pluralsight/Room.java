package com.pluralsight;

public class Room {
    // Attributes
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;


    // Constructors
    public Room(int numberOfBeds, double price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = false;
        this.isDirty = false;

    }


    //Getters & Setters
    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void checkIn() {
        if (!isOccupied && !isDirty) {
            isOccupied = true;
            isDirty = true;
        }
    }

    public void checkout() {
        isOccupied = false;
    }
    public void cleanRoom() {
        if (!isOccupied) {
            isDirty = false;
        }
    }

    public boolean isAvailable() {
        return !isOccupied && !isDirty;
    }

    public boolean isCheckedIn() {
        return isOccupied && isDirty;
    }

    public boolean isCheckedOut() {

        System.out.println("HouseKeeper is not finished cleaning and sanitizing room!");
        return isDirty && !isOccupied;
    }

    public boolean isCleanRoom() {
        System.out.println("HouseKeeper has finished sterilizing and freshening your room!");
        return !isOccupied && !isDirty;
    }
}
