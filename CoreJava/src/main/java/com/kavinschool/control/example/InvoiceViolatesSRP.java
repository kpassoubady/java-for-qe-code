package com.kavinschool.control.example;

import java.io.FileWriter;
import java.io.IOException;

class Invoice {
	private String customerName;
	private double amount;

	public Invoice(String customerName, double amount) {
		this.customerName = customerName;
		this.amount = amount;
	}

	// Responsibility 1: Calculate total amount with tax
	public double calculateTotalAmount() {
		double tax = amount * 0.15; // 15% tax
		return amount + tax;
	}

	// Responsibility 2: Print the invoice details
	public void printInvoice() {
		System.out.println("Customer: " + customerName);
		System.out.println("Amount: " + amount);
		System.out.println("Total with tax: " + calculateTotalAmount());
	}

	// Responsibility 3: Save invoice to a file
	public void saveToFile(String filename) throws IOException {
		FileWriter fileWriter = new FileWriter(filename);
		fileWriter.write("Customer: " + customerName + "\n");
		fileWriter.write("Amount: " + amount + "\n");
		fileWriter.write("Total with tax: " + calculateTotalAmount() + "\n");
		fileWriter.close();
	}
}

public class InvoiceViolatesSRP {

}
