package com.kavinschool.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsInCollection {

	private static class Employee{
	}

	private static class Engineer extends Employee {
	}

	private static class Manager extends Employee {
	}

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		stringList.add("Automation");
		stringList.add("Testing");
		System.out.println(stringList);

		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Engineer());
		employeeList.add(new Manager());
		System.out.println(employeeList);
	}
}
