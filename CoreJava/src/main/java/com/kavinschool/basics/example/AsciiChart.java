package com.kavinschool.basics.example;

/**
 * <p>
 * AsciiChart class.
 * </p>
 *
 * @author kangs
 */
public class AsciiChart {
	public static void main(String[] args) {
		System.out.println("=============================");
		System.out.println("       ASCII Chart");
		System.out.println("=============================");
		System.out.println("Dec\tHex\tOct\tAscii");
		System.out.println("=============================");
		for (int count = 0; count <= 255; count++) {
			System.out.printf("%d\t%X\t%o\t%c\n", count, count, count, count);
		}
		System.out.println("=============================");
	}
}
