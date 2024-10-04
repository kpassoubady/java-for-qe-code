package com.kavinschool.collections.sets;

import java.util.HashSet;
import java.util.Set;

/**
 * <p>StockSetPortfolio class.</p>
 *
 * @author kangs
 */
public class StockSetPortfolio {
    /**
     * <p>main.</p>
     *
     * @param args an array of {@link java.lang.String} objects
     */
    public static void main(String[] args) {
        Set<String> stockPortfolio = new HashSet<>();
        stockPortfolio.add("AAPL");
        stockPortfolio.add("GOOGL");
        stockPortfolio.add("AAPL");  // Duplicate, will not be added

        System.out.println(stockPortfolio);  // Output: [AAPL, GOOGL]

    }
}
