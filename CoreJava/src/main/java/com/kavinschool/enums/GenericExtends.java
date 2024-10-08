package com.kavinschool.enums;

public class GenericExtends {

	enum Day {
		MONDAY, TUESDAY, WEDNESDAY;
	}

	public static void main(String[] args) {
		Day day = Enum.valueOf(Day.class, "MONDAY");
		System.out.println(day); // Outputs: MONDAY
	}

}
