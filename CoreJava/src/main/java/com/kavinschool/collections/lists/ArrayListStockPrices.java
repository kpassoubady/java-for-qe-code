package com.kavinschool.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStockPrices {
    public static void main(String[] args) {
        System.out.println("ArrayListStockPrices");
        List<Double> stockPrices = new ArrayList<>();
        stockPrices.add(150.25);
        stockPrices.add(152.40);
        stockPrices.add(148.60);

        // Retrieve the price at a specific time
        double priceAtNoon = stockPrices.get(1);
    }
}