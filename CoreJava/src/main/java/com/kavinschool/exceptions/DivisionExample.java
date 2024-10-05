package com.kavinschool.exceptions;

public class DivisionExample {

	// Method to perform division
	public int divide(int numerator, int denominator) {
		return numerator / denominator; // This will throw ArithmeticException if the denominator is 0
	}

	public static void main(String[] args) {
		DivisionExample example = new DivisionExample();

		// Division with a valid denominator
		try {
			int result = example.divide(10, 2);
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Error: " + e.getMessage());
		}

		// Division by zero
		try {
			int result = example.divide(10, 0); // This will throw ArithmeticException
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Error: Division by zero is not allowed.");
		}
	}
}