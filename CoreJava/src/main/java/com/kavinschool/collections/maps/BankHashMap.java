package com.kavinschool.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class BankHashMap {
	public static void main(String[] args) {
		Map<String, Double> customerAccounts = new HashMap<>();

		customerAccounts.put("CUST001", 5000.0);
		customerAccounts.put("CUST002", 1200.0);
		customerAccounts.put("CUST003", 3000.0);

		System.out.println("Account Balance of CUST001: $" + customerAccounts.get("CUST001"));

		customerAccounts.put("CUST002", 1500.0);
		customerAccounts.remove("CUST003");
		System.out.println("Customer Accounts after removal: " + customerAccounts);
	}
}
