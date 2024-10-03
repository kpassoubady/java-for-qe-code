package com.kavinschool.collections.sets;

import java.util.HashSet;
import java.util.Set;

public class BankHashSet {
	public static void main(String[] args) {
		Set<String> customerIds = new HashSet<>();

		customerIds.add("CUST001");
		customerIds.add("CUST002");
		customerIds.add("CUST003");

		customerIds.add("CUST002");
		System.out.println("Customer IDs: " + customerIds);

		if (customerIds.contains("CUST001")) {
			System.out.println("Customer CUST001 exists");
		}

		customerIds.remove("CUST003");
		System.out.println("Updated Customer IDs: " + customerIds);
	}
}
