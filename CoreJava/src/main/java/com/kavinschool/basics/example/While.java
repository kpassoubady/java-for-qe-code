package com.kavinschool.basics.example;

/**
 * <p>
 * While class.
 * </p>
 *
 * @author kangs
 */
public class While {

	/**
	 * <p>
	 * main.
	 * </p>
	 *
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to Loops!!!");

		int i = 0;

		while (i < 100) {
			if (i == 10) {
				break; // terminate loop if i is 10
			}
			System.out.println("i: " + i);
			i++;
		}
		System.out.println("Loop complete.");
	}
}
