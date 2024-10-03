package com.kavinschool.collections.lists;

import java.util.LinkedList;

public class InsuranceClaimsLinkedList {
	public static void main(String[] args) {
		LinkedList<String> claims = new LinkedList<>();

		claims.add("Claim 001: Car Accident");
		claims.add("Claim 002: Home Fire");
		claims.addFirst("Claim 000: Health Emergency");

		String firstClaim = claims.removeFirst();
		System.out.println("Processing: " + firstClaim);

		System.out.println("Pending claims: " + claims);
	}
}
