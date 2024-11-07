package com.kavinschool.exceptions;

public class BankTransaction {

	// Method to process a transaction
	public void processTransaction(String transactionId, double amount) throws TransactionFailedException {
		if (amount < 0) {
			throw new TransactionFailedException(transactionId, amount, "Negative amount is not allowed.");
		}
		if (amount > 10000) {
			throw new TransactionFailedException(transactionId, amount, "Amount exceeds transaction limit.");
		}

		// Assuming transaction succeeded if above checks pass
		System.out.println("Transaction with ID: " + transactionId + " for $" + amount + " processed successfully.");
	}

	public static void main(String[] args) {
		BankTransaction transaction = new BankTransaction();
		try {
			// Test case with negative amount
			transaction.processTransaction("TXN12345", -500);
		} catch (TransactionFailedException e) {
			System.out.println(e.getMessage()); // Custom message
			e.printStackTrace(); // Custom stack trace
		}

		try {
			// Test case with large amount exceeding the limit
			transaction.processTransaction("TXN67890", 15000);
		} catch (TransactionFailedException e) {
			System.out.println(e.toString()); // Custom toString method
		}

		try {
			// Successful transaction
			transaction.processTransaction("TXN11111", 5000);
		} catch (TransactionFailedException e) {
			e.printStackTrace();
		}
	}
}
