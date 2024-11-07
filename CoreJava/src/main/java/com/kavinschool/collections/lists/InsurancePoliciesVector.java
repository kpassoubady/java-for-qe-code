package com.kavinschool.collections.lists;

import java.util.Vector;

/**
 * <p>InsurancePoliciesVector class.</p>
 *
 * @author kangs
 */
public class InsurancePoliciesVector {
	/**
	 * <p>main.</p>
	 *
	 * @param args an array of {@link java.lang.String} objects
	 */
	public static void main(String[] args) {
		Vector<String> policies = new Vector<>();

		policies.add("Policy 001: Life Insurance");
		policies.add("Policy 002: Auto Insurance");
		policies.add("Policy 003: Health Insurance");

		for (String policy : policies) {
			System.out.println(policy);
		}

		policies.remove(1);
		System.out.println("Remaining policies: " + policies);
		System.out.println("First policy: " + policies.firstElement());
		System.out.println("policies.size() = " + policies.size());
		System.out.println("policies.capacity() = " + policies.capacity());

	}
}
