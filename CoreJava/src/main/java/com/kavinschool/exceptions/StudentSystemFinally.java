package com.kavinschool.exceptions;

/**
 * In a student system, an exception could occur when attempting to find a
 * student that does not exist. 
 * The finally block ensures that the search operation is marked as completed regardless of the outcome.
 */
public class StudentSystemFinally {
	public static class StudentSystem {
	    public String findStudent(String studentId) throws Exception {
	        if (studentId.equals("123")) {
	            return "John Doe";
	        } else {
	            throw new Exception("Student not found");
	        }
	    }
	}
	
	public static void main(String[] args) {
		StudentSystem studentSystem = new StudentSystem();
		try {
			System.out.println(studentSystem.findStudent("12345"));
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			System.out.println("Finally block executed");
            System.out.println("Search operation finished.");
		}
	}
}
