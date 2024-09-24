package com.kavinschool.corejava.example;

public class If2 {
	public static void main(String args[]) {
		int keith = 5, ken = 15, kavin = 10;
		int max = 0;

		// if-else clause
		if (keith > ken) {
			System.out.println("Keith has more money than Ken");
			max = keith;
		} else {
			max = ken;
			System.out.println("Ken has more money than Keith");
		}

		System.out.println("The maximum value between Keith and Ken is:" + max);

	}
}
