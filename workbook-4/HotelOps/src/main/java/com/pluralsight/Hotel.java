package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }
    public int getAvailableSuites(){
        return numberOfSuites - bookedSuites;
    }
    public int getAvailableRooms(){
        return numberOfRooms - bookedBasicRooms;
    }
    public boolean bookedRooms(int numberOfRooms,boolean isSuite){
        if (numberOfRooms<=0){
            return false;
        }
        if (isSuite){
            //Num of suite calc
            if (getAvailableSuites()>=numberOfRooms){
                bookedSuites += numberOfRooms;
                return true;
            }
        }else{
            //Num of room calc
            if (getAvailableRooms()>= numberOfRooms){
                bookedBasicRooms += numberOfRooms;
                return true;
            }
        }
        return false;
    }
}





