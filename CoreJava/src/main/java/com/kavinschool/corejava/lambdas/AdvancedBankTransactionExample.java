package com.kavinschool.corejava.lambdas;

import java.util.*;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;



public class AdvancedBankTransactionExample {

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

        // 1. Group transactions by type (DEBIT or CREDIT)
        ConcurrentMap<String, List<Transaction>> groupedTransactions = transactions.parallelStream()
                .collect(Collectors.groupingByConcurrent(Transaction::getType));

        System.out.println("Grouped Transactions (DEBIT vs CREDIT):");
        groupedTransactions.forEach((type, txns) -> {
            System.out.println(type + ":");
            txns.forEach(System.out::println);
        });

        // 2. Apply an interest rate of 2% on CREDIT transactions above $1000
        double interestRate = 0.02;
        List<Transaction> updatedCreditTransactions = transactions.parallelStream()
                .filter(t -> t.getType().equals("CREDIT") && t.getAmount() > 1000)
                .peek(t -> {
                    double interest = t.getAmount() * interestRate;
                    t.setAmount(t.getAmount() + interest); // Apply interest
                })
                .toList(); // collect to a new list

        // Display updated credit transactions after applying interest
        System.out.println("\nCredit Transactions with Interest Applied:");
        updatedCreditTransactions.forEach(System.out::println);

        // 3. Calculate total sum of CREDIT transactions after applying interest, using parallel stream
        double totalCreditAmount = updatedCreditTransactions.parallelStream()
                .mapToDouble(Transaction::getAmount)
                .sum();

        System.out.println("\nTotal Amount of CREDIT Transactions after Applying Interest: $" + totalCreditAmount);
    }
}
