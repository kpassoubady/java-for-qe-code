package com.kavinschool.basics.example;

/**
 * <p>Literals class.</p>
 *
 * @author kangs
 */
public class Literals {
	
	 /**
	  * <p>main.</p>
	  *
	  * @param args an array of {@link java.lang.String} objects
	  */
	 public static void main(String args[]) {
	        byte k = 012;  short s = 0xAB;
	        int i = 65000; long l = 65000000L;
	        float f = 5.55f;  double d = 6.6666666D;
	        char c = 'c';     boolean b = true;

	        System.out.println("byte:" + k + "\nint:" + i + "\nshort:" + s + "\nlong:" + l);
	        System.out.println("float:" + f + "\ndouble:" + d + "\nchar:" + c + "\nboolean:" + b);
	    }
}
