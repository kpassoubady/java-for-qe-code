package com.kavinschool.control.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * <p>BigDecimalExample class.</p>
 *
 * @author kangs
 */
public class BigDecimalExample {
    /**
     * <p>main.</p>
     *
     * @param args an array of {@link java.lang.String} objects
     */
    public static void main(String[] args) {
        // Example 1: Creating BigDecimal from String
        BigDecimal price = new BigDecimal("19.99");
        BigDecimal quantity = new BigDecimal("3");

        // Multiply price by quantity
        BigDecimal totalCost = price.multiply(quantity);
        System.out.println("Total Cost (not-rounded): " + totalCost);  // Output: 59.97

        // Example 2: BigDecimal with division and rounding
        BigDecimal dividend = new BigDecimal("100");
        BigDecimal divisor = new BigDecimal("3");

        // Divide with RoundingMode (to 2 decimal places)
        BigDecimal result = dividend.divide(divisor, 2, RoundingMode.HALF_UP);
        System.out.println("Division Result (rounded to 2 decimals): " + result);  // Output: 33.33

        // Example 3: Adding and subtracting BigDecimal values
        BigDecimal discount = new BigDecimal("5.00");
        BigDecimal finalCost = totalCost.subtract(discount);
        System.out.println("Final Cost after Discount: " + finalCost);  // Output: 54.97

        // Example 4: Comparison using compareTo()
        BigDecimal threshold = new BigDecimal("50.00");
        if (finalCost.compareTo(threshold) > 0) {
            System.out.println("Final cost is above the threshold.");
        } else {
            System.out.println("Final cost is below the threshold.");
        }
    }
}
