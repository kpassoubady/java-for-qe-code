package com.kavinschool.exceptions;

public class ArrayIndexBoundExceptionExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        try {
            System.out.println("First Number: " + numbers[0]);
            System.out.println("15th Number: " + numbers[15]);
            System.out.println("This line will not be executed");
        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
