package com.kavinschool.basics.example;

/**
 * <p>Switch class.</p>
 *
 * @author kangs
 */
public class SwitchWithBreaks {
	/**
	 * <p>main.</p>
	 *
	 * @param args an array of {@link java.lang.String} objects
	 */
	public static void main(String[] args) {
		int option = (int) (Math.random() * 6.0);
		System.out.println("Option:" + option);
		switch (option) {
		case 1:
			System.out.println("Selenium IDE");
			break;
		case 2:
			System.out.println("Selenium Core");
			break;
		case 3:
			System.out.println("Selenium RC");
			break;
		case 4:
			System.out.println("Selenium on Rails");
			break;
		case 5:
			System.out.println("Selenium Grid");
			break;
		default:
			System.out.println("Selenium");
			break;
		}
	}
}
