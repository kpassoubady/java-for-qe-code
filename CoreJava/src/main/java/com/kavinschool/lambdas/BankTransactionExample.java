package com.kavinschool.lambdas;

import java.util.*;

/**
 * <p>BankTransactionExample class.</p>
 *
 * @author kangs
 */
public class BankTransactionExample {

    static class Transaction {
        private final String id;
        private final double amount;
        private final String type;  // e.g., "DEBIT" or "CREDIT"

        public Transaction(String id, double amount, String type) {
            this.id = id;
            this.amount = amount;
            this.type = type;
        }

        public double getAmount() {
            return amount;
        }

        public String getType() {
            return type;
        }

        @Override
        public String toString() {
            return "Transaction{" +
                    "id='" + id + '\'' +
                    ", amount=" + amount +
                    ", type='" + type + '\'' +
                    '}';
        }
    }

    /**
     * <p>main.</p>
     *
     * @param args an array of {@link java.lang.String} objects
     */
    public static void main(String[] args) {
        // Sample list of transactions
        List<Transaction> transactions = Arrays.asList(
                new Transaction("TXN001", 1200, "CREDIT"),
                new Transaction("TXN002", 800, "DEBIT"),
                new Transaction("TXN003", 1500, "CREDIT"),
                new Transaction("TXN004", 500, "DEBIT"),
                new Transaction("TXN005", 2000, "CREDIT"),
                new Transaction("TXN006", 700, "DEBIT")
        );

        // 1. Filter transactions that are "CREDIT" and amount > 1000
        List<Transaction> highValueCreditTransactions = transactions.stream()
                .filter(t -> t.getType().equals("CREDIT") && t.getAmount() > 1000)
                .toList(); // collect the results into a list

        // 2. Map those transactions to their amounts
        List<Double> highValueAmounts = highValueCreditTransactions.stream()
                .map(Transaction::getAmount)
                .toList(); // collect the results into a list

        // 3. Reduce the amounts to calculate the total sum
        double totalHighValueAmount = highValueAmounts.stream()
                .reduce(0.0, Double::sum);

        // Print the results
        System.out.println("High-Value Credit Transactions:");
        highValueCreditTransactions.forEach(System.out::println);

        System.out.println("Total Amount of High-Value Credit Transactions: $" + totalHighValueAmount);
    }
}
