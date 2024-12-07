package com.pluralsight;

public class Cash extends Asset {
    private double orginalCost;

    public Cash(String description, String dateAcquired, double originalCost, double orginalCost) {
        super(description, dateAcquired, originalCost);
        this.orginalCost = orginalCost;
    }

    public double getOrginalCost() {
        return orginalCost;
    }

    public void setOrginalCost(double orginalCost) {
        this.orginalCost = orginalCost;
    }

    @Override
    public double getValue() {
        return orginalCost;
    }
}
