package com.pluralsight;

public class Reservation {
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean isWeekend;



    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = false;
        if (roomType.equalsIgnoreCase("King ")){
            this.price= 139.00;
        } else if (roomType.equalsIgnoreCase(" Double")) {
            this.price=124.00;
        }
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }
    public double getReservationTotal(){
        double totalPrice = price + numberOfNights;

        if (isWeekend){
            totalPrice *= 1.1;
        }
        return totalPrice;
    }
}
