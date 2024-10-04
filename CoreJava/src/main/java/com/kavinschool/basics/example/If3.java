package com.kavinschool.basics.example;

/**
 * <p>If3 class.</p>
 *
 * @author kangs
 */
public class If3 {

	/**
	 * <p>main.</p>
	 *
	 * @param args an array of {@link java.lang.String} objects
	 */
	public static void main(String args[]) {
		int keith = 5, ken = 15, kavin = 10;

		// Simplified max finding
		int max = keith;
		if (ken > max) {
			max = ken;
		}
		if (kavin > max) {
			max = kavin;
		}

		System.out.println("The maximum value between Keith, Ken and Kavin is: " + max);
	}

}
