package com.kavinschool.collections.maps;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <p>InsuranceLinkedHashMap class.</p>
 *
 * @author kangs
 */
public class InsuranceLinkedHashMap {
	/**
	 * <p>main.</p>
	 *
	 * @param args an array of {@link java.lang.String} objects
	 */
	public static void main(String[] args) {
		Map<String, String> policyHolders = new LinkedHashMap<>();

		policyHolders.put("POL001", "John Doe");
		policyHolders.put("POL002", "Jane Smith");
		policyHolders.put("POL003", "Alice Brown");

		System.out.println("Policy Holders: " + policyHolders);

		policyHolders.put("POL002", "Jane Doe");

		for (Map.Entry<String, String> entry : policyHolders.entrySet()) {
			System.out.println("Policy: " + entry.getKey() + ", Holder: " + entry.getValue());
		}
	}
}
