package com.kavinschool.basics.example;

/**
 * <p>Variables class.</p>
 *
 * @author kangs
 */
public class Variables {

	static byte k; static int i;
	static short s; static long l;
	static float f; static double d;
	static char c = 'c'; static boolean b;

	/**
	 * <p>main.</p>
	 *
	 * @param args an array of {@link java.lang.String} objects
	 */
	public static void main(String[] args) {
		int m = 0;
		System.out.println("byte:" + k + "\nint:" + i + "\nshort:" + s + "\nlong:" + l);
		System.out.println("float:" + f + "\ndouble:" + d + "\nchar:" + c + "\nboolean:" + b);
		System.out.println("m:" + m);
	}
}
