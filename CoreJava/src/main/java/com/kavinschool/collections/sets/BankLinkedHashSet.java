package com.kavinschool.collections.sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class BankLinkedHashSet {
	public static void main(String[] args) {
		Set<String> transactions = new LinkedHashSet<>();

		transactions.add("Deposit: $500");
		transactions.add("Withdraw: $200");
		transactions.add("Deposit: $300");

		System.out.println("Transaction History: " + transactions);

		transactions.add("Deposit: $500");
		System.out.println("After Attempting Duplicate: " + transactions);

		if (transactions.contains("Withdraw: $200")) {
			System.out.println("Withdraw: $200 exists in history");
		}
	}
}
