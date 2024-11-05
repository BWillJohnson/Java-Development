package com.pluralsight.finance;

public class Gold implements IValuable {
    private double weight;

    public Gold(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getValue() {
        return 0;
    }
}
