package com.kavinschool.collections.lists;

import java.util.Vector;

public class InsurancePoliciesVector {
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
	}
}
