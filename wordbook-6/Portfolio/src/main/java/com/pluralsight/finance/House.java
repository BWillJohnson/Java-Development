package com.pluralsight.finance;

public class House implements IValuable{
    private int yearBuilt;
    private int squareFeet;
    private int bedRooms;

    public House(int yearBuilt, int squareFeet, int bedRooms) {
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedRooms = bedRooms;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(int squareFeet) {
        this.squareFeet = squareFeet;
    }

    public int getBedRooms() {
        return bedRooms;
    }

    public void setBedRooms(int bedRooms) {
        this.bedRooms = bedRooms;
    }

    @Override
    public double getValue() {
        return 0;
    }
}
