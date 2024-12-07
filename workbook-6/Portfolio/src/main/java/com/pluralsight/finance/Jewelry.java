package com.pluralsight.finance;

public class Jewelry implements IValuable {
    private double karat;

    public Jewelry(double karat) {
        this.karat = karat;
    }

    public double getKarat() {
        return karat;
    }

    @Override
    public double getValue() {
        return 0;
    }
}
