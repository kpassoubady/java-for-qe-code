package com.kavinschool.exceptions;

import java.io.Serial;

/**
 * TransactionFailedException, which extends the Exception class. It includes
 * overrides for all relevant methods like getMessage(), toString(), and
 * printStackTrace(), as well as custom constructors
 */
public class TransactionFailedException extends Exception {

	@Serial
	private static final long serialVersionUID = -1633327360662357292L;
	// Custom attributes related to transaction
	private String transactionId;
	private double amount;
	private String reason;

	// Default Constructor
	public TransactionFailedException() {
		super("Transaction failed due to an unknown reason");
	}

	// Constructor with reason
	public TransactionFailedException(String reason) {
		super(reason);
		this.reason = reason;
	}

	// Constructor with custom attributes
	public TransactionFailedException(String transactionId, double amount, String reason) {
		super("Transaction ID: " + transactionId + " for amount $" + amount + " failed. Reason: " + reason);
		this.transactionId = transactionId;
		this.amount = amount;
		this.reason = reason;
	}

	// Override getMessage method
	@Override
	public String getMessage() {
		return "Transaction ID: " + transactionId + " failed with amount: $" + amount + ". Reason: " + reason;
	}

	// Override toString method
	@Override
	public String toString() {
		return "TransactionFailedException{" + "transactionId='" + transactionId + '\'' + ", amount=" + amount
				+ ", reason='" + reason + '\'' + '}';
	}

	// Override printStackTrace method to add custom information
	@Override
	public void printStackTrace() {
		System.err.println("Custom Stack Trace: Transaction ID: " + transactionId + ", Amount: $" + amount);
		super.printStackTrace();
	}

	// Additional methods (Optional)
	public String getTransactionId() {
		return transactionId;
	}

	public double getAmount() {
		return amount;
	}

	public String getReason() {
		return reason;
	}
}
