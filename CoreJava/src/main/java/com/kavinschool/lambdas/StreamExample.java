package com.kavinschool.lambdas;

import java.util.*;



/**
 * <p>StreamExample class.</p>
 *
 * @author kangs
 */
public class StreamExample {

    static class Transaction {
        private final String id;
        private double amount;
        private final String type;  // e.g., "DEBIT" or "CREDIT"

        public Transaction(String id, double amount, String type) {
            this.id = id;
            this.amount = amount;
            this.type = type;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
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
        List<Transaction> transactions = Arrays.asList(
                new Transaction("TXN001", 1000, "CREDIT"),
                new Transaction("TXN002", 500, "DEBIT"),
                new Transaction("TXN003", 1200, "CREDIT"),
                new Transaction("TXN004", 700, "DEBIT")
        );

        // Filter and collect only CREDIT transactions
        List<Transaction> creditTransactions = transactions.stream()
                .filter(t -> "CREDIT".equals(t.getType()))
                .toList();

        // Print the result
        creditTransactions.forEach(System.out::println);

        // Calculate the total of CREDIT transactions
        double totalCreditAmount = transactions.stream()
                .filter(t -> "CREDIT".equals(t.getType()))
                .mapToDouble(Transaction::getAmount)
                .sum();

        System.out.println("Total Credit Amount: " + totalCreditAmount);
    }
}
