package com.kavinschool.basics.example;

public class If3 {

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
