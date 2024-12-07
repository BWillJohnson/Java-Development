package com.pluralsight.finance;

import java.util.ArrayList;
import java.util.List;

public class Portfolio implements IValuable{
    private String name;
    private String owner;
    private List<IValuable> assets;

    public Portfolio(String name, String owner, List<IValuable> assets) {
        this.name = name;
        this.owner = owner;
        this.assets = new ArrayList<>();
    }

    public void addAsset(IValuable asset) {
        assets.add(asset);
    }

    @Override
    public double getValue() {
        double totalValue = 0;
        for (IValuable asset : assets) {
            totalValue += asset.getValue();
        }
        return totalValue;
    }

    public IValuable getMostValuable(){
        if (assets.isEmpty()) {
            return null;
        }
        IValuable mostValuableAsset = assets.get(0);
        double highestValue = mostValuableAsset.getValue();

        for (IValuable asset : assets) {
            double assetValue = asset.getValue();
            if (assetValue > highestValue){
                highestValue = assetValue;
                mostValuableAsset = asset;
            }
        }
        return mostValuableAsset;
    }
    public IValuable getLeastValuable(){
        if (assets.isEmpty()) {
            return null;
        }
        IValuable leastValuableAsset = assets.get(0);
        double leastValue = leastValuableAsset.getValue();

        for (IValuable asset : assets) {
            double assetValue = asset.getValue();
            if (assetValue > leastValue){
                leastValue = assetValue;
                leastValuableAsset = asset;
            }
        }
        return leastValuableAsset;
    }
}