package com.kavinschool.basics.example;

public class BreakContinueExample {
	public static void main(String[] args) {
		// Example with 'break'
		System.out.println("Break example:");
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				break; // Terminates the loop when i equals 5
			}
			System.out.println("i: " + i);
		}

		// Example with 'continue'
		System.out.println("\nContinue example:");
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				continue; // Skips the current iteration if i is even
			}
			System.out.println("i: " + i);
		}
	}
}
