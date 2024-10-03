package com.kavinschool.collections.lists;

import java.util.ArrayList;

public class BankAccount {
	public static void main(String[] args) {
		ArrayList<String> transactions = new ArrayList<>();
		transactions.add("Deposit: $500");
		transactions.add("Withdrawal: $200");
		transactions.add("Deposit: $300");
		for (String transaction : transactions) {
			System.out.println(transaction);
		}
		System.out.println("First transaction: " + transactions.get(0));
	}
}
