package com.kavinschool.corejava.example.operators;

public class Operators {
	public static void main(String args[]) {
		int month = 12;
		int day = 31;
		int total = day * month;
		int exp1 = 1 * 2 * 5 - 3 * 10 - 12 / 2 + 15 % 2;
		double exp2 = 1.0e02 * 2.0e05;
		System.out.println("Total:" + total);
		System.out.println("Exp1:" + exp1);
		System.out.println("Exp2:" + exp2);

		int result = month > day ? 0 : -1;
		System.out.println("result:" + result);
	}
}