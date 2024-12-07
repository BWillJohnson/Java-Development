package com.pluralsight.models;

import java.sql.Date;

public class SalesByYear {
    private Date shippedDate;
    private int orderId;
    private double subtotal;


    public SalesByYear(Date shippedDate, int orderId, double subtotal) {
        this.shippedDate = shippedDate;
        this.orderId = orderId;
        this.subtotal = subtotal;

    }

    public Date getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(Date shippedDate) {
        this.shippedDate = shippedDate;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }


    @Override
    public String toString() {
        return "SalesByYear{" +
                "shippedDate='" + shippedDate + '\'' +
                ", orderId=" + orderId +
                ", subtotal=" + subtotal +
                '}';
    }
}
