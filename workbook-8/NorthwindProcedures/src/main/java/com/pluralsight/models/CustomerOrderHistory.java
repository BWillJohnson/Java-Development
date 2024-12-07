package com.pluralsight.models;

public class CustomerOrderHistory {
    private String productName;
    private int totalQuantity;

    public CustomerOrderHistory(String productName, int totalQuantity) {
        this.productName = productName;
        this.totalQuantity = totalQuantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    @Override
    public String toString() {
        return "CustomerOrderHistory{" +
                "productName='" + productName + '\'' +
                ", totalQuantity=" + totalQuantity +
                '}';
    }
}
