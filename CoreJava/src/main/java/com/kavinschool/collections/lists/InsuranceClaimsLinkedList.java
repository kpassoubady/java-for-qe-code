package com.kavinschool.collections.lists;

import java.util.LinkedList;

/**
 * <p>InsuranceClaimsLinkedList class.</p>
 *
 * @author kangs
 */
public class InsuranceClaimsLinkedList {
	/**
	 * <p>main.</p>
	 *
	 * @param args an array of {@link java.lang.String} objects
	 */
	public static void main(String[] args) {
		LinkedList<String> claims = new LinkedList<>();

		claims.add("Claim 001: Car Accident");
		System.out.println("claims = " + claims);
		claims.add("Claim 002: Home Fire");
		System.out.println("claims = " + claims);
		claims.addFirst("Claim 000: Health Emergency");
		System.out.println("claims = " + claims);
		claims.addFirst("Claim 004: Luggage Insurance");
		System.out.println("claims = " + claims);
		String firstClaim = claims.removeFirst();
		System.out.println("Processing: " + firstClaim);

		System.out.println("Pending claims: " + claims);
		claims.addLast(firstClaim);
		System.out.println("claims = " + claims);
	}
}
