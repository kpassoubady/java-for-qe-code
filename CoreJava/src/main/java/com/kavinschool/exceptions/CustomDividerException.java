package com.kavinschool.exceptions;

import java.io.Serial;

//Custom Exception Class
class DivisionByZeroException extends Exception {
	public DivisionByZeroException(String message) {
		super(message);
	}
}


//Class to perform division
public class CustomDividerException {

	// Method to divide two numbers
	public double divide(double numerator, double denominator) throws DivisionByZeroException {
		if (denominator == 0) {
			throw new DivisionByZeroException("Error: Division by zero is not allowed.");
		}
		return numerator / denominator;
	}

	public static void main(String[] args) {
		CustomDividerException divider = new CustomDividerException();

		// Division example 1 (successful)
		try {
			System.out.println("Result: " + divider.divide(10, 2));
		} catch (DivisionByZeroException exception) {
			System.out.println(exception.getMessage());
		}

		// Division example 2 (division by zero)
		try {
			System.out.println("Result: " + divider.divide(10, 0));
		} catch (DivisionByZeroException exception) {
			System.out.println(exception.getMessage()); // Custom error message
		}
	}
}
