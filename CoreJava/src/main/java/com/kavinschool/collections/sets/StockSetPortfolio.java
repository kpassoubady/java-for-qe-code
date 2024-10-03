package com.kavinschool.collections.sets;

import java.util.HashSet;
import java.util.Set;

public class StockSetPortfolio {
    public static void main(String[] args) {
        Set<String> stockPortfolio = new HashSet<>();
        stockPortfolio.add("AAPL");
        stockPortfolio.add("GOOGL");
        stockPortfolio.add("AAPL");  // Duplicate, will not be added

        System.out.println(stockPortfolio);  // Output: [AAPL, GOOGL]

    }
}
