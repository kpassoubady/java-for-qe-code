package com.kavinschool.corejava.example;

import java.util.List;
import java.util.function.Predicate;

public class LambdaExpressionExample {
    public static void main(String[] args) {
        // Example 1: Simple lambda for Runnable
        Runnable runnable = () -> System.out.println("Running in a thread");
        Thread thread = new Thread(runnable);
        thread.start();  // Output: Running in a thread

        // Example 2: Lambda for Predicate (Functional Interface)
        List<String> names = List.of("Alice", "Bob", "Charlie", "David");

        // Using a lambda expression to filter names that start with 'A'
        Predicate<String> startsWithA = name -> name.startsWith("A");

        System.out.println("Names starting with A:");
        names.stream()
                .filter(startsWithA)   // Applying the lambda filter
                .forEach(System.out::println);  // Output: Alice

        // Example 3: Using lambda to sort a list
        List<Integer> numbers = List.of(5, 2, 9, 1, 6);
        System.out.println("Numbers sorted:");
        numbers.stream()
                .sorted((n1, n2) -> n1 - n2)  // Sorting using a lambda expression
                .forEach(System.out::println);  // Output: 1, 2, 5, 6, 9
    }
}
