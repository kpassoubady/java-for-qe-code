package com.kavinschool.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class PortfolioHashMapExample {
    // Inner class for Portfolio
    static class Portfolio {
        String type;
        double value;

        Portfolio(String type, double value) {
            this.type = type;
            this.value = value;
        }
    }

    // Create a map to store customer portfolios
    public static void main(String[] args) {
        Map<String, Portfolio> customerPortfolios = new HashMap<>();
        customerPortfolios.put("CUST001", new Portfolio("Stocks", 100000));
        customerPortfolios.put("CUST002", new Portfolio("Bonds", 50000));

        Portfolio portfolio = customerPortfolios.get("CUST001");  // Retrieve portfolio by customer ID
        System.out.println("Customer CUST001 has " + portfolio.type + " valued at " + portfolio.value);

    }
}
