package com.kavinschool.exceptions;


/**
 * In a banking system, an exception could occur when attempting 
 * to withdraw more money than available in an account.
 */
public class BankAccountWithDrawException {
	private static class BankAccount {
		private double balance;

		public BankAccount(double balance) {
			this.balance = balance;
		}

		public void withdraw(double amount) throws Exception {
			if (amount > balance) {
				throw new Exception("Insufficient funds");
			}
			balance -= amount;
		}
	}

	public static void main(String[] args) {
		BankAccount account = new BankAccount(500);
		try {
			account.withdraw(600);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
