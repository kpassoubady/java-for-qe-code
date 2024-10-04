package com.kavinschool.collections.sets;

import java.util.HashSet;
import java.util.Set;

/**
 * <p>BankHashSet class.</p>
 *
 * @author kangs
 */
public class BankHashSet {
	/**
	 * <p>main.</p>
	 *
	 * @param args an array of {@link java.lang.String} objects
	 */
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
