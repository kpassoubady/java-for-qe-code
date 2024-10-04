package com.kavinschool.collections.lists;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>ArrayListFinanceTransactions class.</p>
 *
 * @author kangs
 */
public class ArrayListFinanceTransactions {

    // inner record Transaction
    record Transaction(String type, double amount) {
    }

    /**
     * <p>main.</p>
     *
     * @param args an array of {@link java.lang.String} objects
     */
    public static void main(String[] args) {
        System.out.println("ArrayListFinanceTransactions");
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction("Payment", 200.00));
        transactions.add(new Transaction("Invoice", 450.00));

        // Retrieve the second transaction
        Transaction secondTransaction = transactions.get(1);
        System.out.println("Second Transaction: " + secondTransaction);

    }
}
