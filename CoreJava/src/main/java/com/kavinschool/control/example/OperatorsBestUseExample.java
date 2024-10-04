package com.kavinschool.control.example;

/**
 * <p>OperatorsBestUseExample class.</p>
 *
 * @author kangs
 */
public class OperatorsBestUseExample {
	/**
	 * <p>main.</p>
	 *
	 * @param args an array of {@link java.lang.String} objects
	 */
	public static void main(String[] args) {
		// Correct usage of short-circuiting
//		if (isUserLoggedIn && isAdmin) {  
//		    grantAccess();
//		}

		String s1 = "Java";
		String s2 = "Java";
		
		// Use equals() for object comparison
		if (s1.equals(s2)) {
			System.out.println("Strings are equal"); 
		}
	}
}
