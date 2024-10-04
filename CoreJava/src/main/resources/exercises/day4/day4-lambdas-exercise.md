# Functional Interfaces and Lambdas - Student Management System

## Problem Statement
>
> [!IMPORTANT]
>
> You are tasked with creating a system for managing a list of students in a school. Each student has a name, grade, and age. The system needs to:
>
> 1. Filter out students who are below a passing grade (e.g., grade < 60).
> 2. Sort the students by age.
> 3. Print the names of all students in the system.
>
> You must use **lambda expressions** and **functional interfaces** to implement the filtering and sorting logic. Additionally, use the **Stream API** to efficiently process the list of students and demonstrate the best practices for writing lambdas.

## Specific Requirements
>
> [!TIP]
>
> 1. Create a `Student` class with fields `name`, `grade`, and `age`.
> 2. Use a **functional interface** and lambda expression to filter out students with grades less than 60.
> 3. Use a **lambda expression** to sort the list of students by age.
> 4. Use the **Stream API** to process the list of students for filtering, sorting, and printing their names.
> 5. Ensure that the solution follows **best practices** for writing lambdas and avoid common pitfalls such as overly complex lambda expressions or redundant operations.
>

## Instructions
>
> [!CAUTION]
>
>
> 1. **Create the `Student` class**:
>    - The class should contain fields for `name`, `grade`, and `age`, along with appropriate getters and constructors.
> 2. **Filter Students**:
>    - Use a functional interface and a lambda expression to filter out students with a grade less than 60.
> 3. **Sort Students**:
>    - Use a lambda expression with the `Comparator` interface to sort the students by age in ascending order.
> 4. **Use Stream API**:
>    - Use the `Stream` API to first filter the list of students, then sort them by age, and finally print their names.
> 5. **Best Practices**:
>    - Ensure that the lambda expressions are concise and follow best practices such as not writing overly complex lambdas or reusing unnecessary operations.
> 6. **Common Pitfalls**:
>    - Avoid issues such as using lambdas where method references could be more efficient, or creating lambdas that are difficult to understand.
>

## Example Output

```text
Filtered and Sorted List of Students:
Alice, Age: 17, Grade: 85
Bob, Age: 16, Grade: 75
Charlie, Age: 18, Grade: 65
```

## Starting Code Snippet
>
> [!WARNING]
> May not compile or work, modify the code as needed.
>

```java
import java.util.*;
import java.util.stream.Collectors;

// Student class with name, grade, and age fields
class Student {
    private String name;
    private int grade;
    private int age;
}

public class StudentManagement {
    public static void main(String[] args) {
        // Create a list of students
        List<Student> students = Arrays.asList(
            new Student("Eve", 45, 19)    // Below passing grade
        );

        // Step 1: Filter out students with a grade < 60 using Stream and Lambda


        // Step 2: Sort the passing students by age using Lambda


        // Step 3: Print the filtered and sorted list of students
        System.out.println("Filtered and Sorted List of Students:");
    }
}

```
