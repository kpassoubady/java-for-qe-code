package com.kavinschool.exceptions;

/**
 * In a financial system, a runtime exception could occur if an application tries 
 * to access a non-existing record.
 */
public class FinancialSystemException {
	public static class FinancialSystem {
	    public void processRecord(String record) {
	        if (record == null) {
	            throw new NullPointerException("Record is null");
	        }
	        System.out.println("Processing record: " + record);
	    }
	}
	
	public static void main(String[] args) {
		FinancialSystem financialSystem = new FinancialSystem();
		try {
			financialSystem.processRecord(null);
		} catch (NullPointerException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
