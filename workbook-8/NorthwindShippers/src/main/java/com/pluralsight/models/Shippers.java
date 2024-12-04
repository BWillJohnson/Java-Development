package com.pluralsight.models;

public class Shippers {
    private int ShipperId;
    private String companyName;
    private String phone;

    public Shippers(int shipperId, String companyName, String phone) {
        ShipperId = shipperId;
        this.companyName = companyName;
        this.phone = phone;
    }

    public int getShipperId() {
        return ShipperId;
    }

    public void setShipperId(int shipperId) {
        ShipperId = shipperId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Shippers{" +
                "ShipperId=" + ShipperId +
                ", companyName='" + companyName + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
