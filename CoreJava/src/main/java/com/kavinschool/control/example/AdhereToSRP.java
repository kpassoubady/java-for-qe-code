package com.kavinschool.control.example;

import java.io.FileWriter;
import java.io.IOException;

public class AdhereToSRP {
	
	// Class 1: Invoice (Handles only business logic)
	private static class Invoice {
	    private String customerName;
	    private double amount;

	    public Invoice(String customerName, double amount) {
	        this.customerName = customerName;
	        this.amount = amount;
	    }

	    public double calculateTotalAmount() {
	        double tax = amount * 0.15; // 15% tax
	        return amount + tax;
	    }

	    public String getCustomerName() {
	        return customerName;
	    }

	    public double getAmount() {
	        return amount;
	    }
	}

	// Class 2: InvoicePrinter (Handles printing responsibility)
	private static class InvoicePrinter {
	    public void print(Invoice invoice) {
	        System.out.println("Customer: " + invoice.getCustomerName());
	        System.out.println("Amount: " + invoice.getAmount());
	        System.out.println("Total with tax: " + invoice.calculateTotalAmount());
	    }
	}

	// Class 3: InvoiceSaver (Handles file-saving responsibility)
	private static class InvoiceSaver {
	    public void saveToFile(Invoice invoice, String filename) throws IOException {
	        FileWriter fileWriter = new FileWriter(filename);
	        fileWriter.write("Customer: " + invoice.getCustomerName() + "\n");
	        fileWriter.write("Amount: " + invoice.getAmount() + "\n");
	        fileWriter.write("Total with tax: " + invoice.calculateTotalAmount() + "\n");
	        fileWriter.close();
	    }
	}

	

	public static void main(String[] args) throws IOException {
        Invoice invoice = new Invoice("John Doe", 500.0);

        // Printing the invoice
        InvoicePrinter printer = new InvoicePrinter();
        printer.print(invoice);

        // Saving the invoice to a file
        InvoiceSaver saver = new InvoiceSaver();
        saver.saveToFile(invoice, "invoice.txt");
    }

}
