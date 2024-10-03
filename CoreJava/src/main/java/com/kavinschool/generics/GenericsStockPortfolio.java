package com.kavinschool.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Base interface for financial assets
interface Asset {
    double getMarketValue();
    String getName();
}

// Stock class implementing Asset
class Stock implements Asset {
    private final String ticker;
    private final double marketValue;

    public Stock(String ticker, double marketValue) {
        this.ticker = ticker;
        this.marketValue = marketValue;
    }

    @Override
    public double getMarketValue() {
        return marketValue;
    }

    @Override
    public String getName() {
        return ticker;
    }
}

// Bond class implementing Asset
class Bond implements Asset {
    private final String bondName;
    private final double marketValue;

    public Bond(String bondName, double marketValue) {
        this.bondName = bondName;
        this.marketValue = marketValue;
    }

    @Override
    public double getMarketValue() {
        return marketValue;
    }

    @Override
    public String getName() {
        return bondName;
    }
}

// Portfolio class using Generics
class Portfolio<T extends Asset> {
    private final List<T> assets = new ArrayList<>();

    public void addAsset(T asset) {
        assets.add(asset);
    }

    public double getTotalMarketValue() {
        return assets.stream().mapToDouble(Asset::getMarketValue).sum();
    }

    public List<String> getAssetNames() {
        return assets.stream().map(Asset::getName).collect(Collectors.toList());
    }
}

public class GenericsStockPortfolio {
    public static void main(String[] args) {
        Portfolio<Stock> stockPortfolio = new Portfolio<>();
        stockPortfolio.addAsset(new Stock("AAPL", 150.0));
        stockPortfolio.addAsset(new Stock("GOOGL", 2800.0));

        Portfolio<Bond> bondPortfolio = new Portfolio<>();
        bondPortfolio.addAsset(new Bond("Government Bond 2025", 1000.0));

        System.out.println("Stock Portfolio Market Value: " + stockPortfolio.getTotalMarketValue());
        System.out.println("Bond Portfolio Market Value: " + bondPortfolio.getTotalMarketValue());
    }
}
