# Java Collections Framework Exercise

## Problem Statement
>
> [!IMPORTANT]
>
> Write a Java program that creates and manages a collection of students using the `List`, `Set`, and `Map` interfaces from the Java Collections Framework. Each student should have an `ID` (integer) and `name` (string). Use Generics to ensure that the collections are type-safe. The program should allow you to:
> 
> 1. Add a list of students to a `List`.
> 2. Remove duplicate students using a `Set`.
> 3. Map each student’s `ID` to their `name` using a `Map`.
> 4. Print the list of students, the set of unique students, and the student `ID`-to-`name` mapping.
>

## Specific Requirements
>
> [!TIP]
>
> 1. Create a `Student` class with `ID` and `name` fields. Override the `equals()` and `hashCode()` methods to ensure students with the same ID are treated as duplicates.
> 2. Use a `List<Student>` to store multiple students.
> 3. Use a `Set<Student>` to remove duplicate students from the list.
> 4. Use a `Map<Integer, String>` to map each student’s ID to their name.
> 5. Ensure that the collections are type-safe using Generics.
> 6. Print the full list of students, the set of unique students, and the student ID-to-name mapping.

## Example Output

```text
List of Students:
1: Alice
2: Bob
3: Alice
4: Charlie

Set of Unique Students:
1: Alice
2: Bob
4: Charlie

Student ID to Name Mapping:
1 -> Alice
2 -> Bob
4 -> Charlie
```

## Instructions
>
> [!CAUTION]
>
> 1. Create a `Student` class with two fields: `ID` (an integer) and `name` (a string). Override the `equals()` and `hashCode()` methods based on the `ID` field to treat students with the same ID as equal.
> 2. Create a `List<Student>` and add several `Student` objects to it, including some with duplicate `ID`s.
> 3. Use a `Set<Student>` to remove duplicates from the list by adding all students from the `List` to the `Set`.
> 4. Create a `Map<Integer, String>` and add the `ID` and `name` of each unique student from the `Set` to the `Map`.
> 5. Print the contents of the `List`, `Set`, and `Map` in a structured format.

## Starting Code Snippet
>
> [!WARNING]
> May not compile or work, modify the code as needed.
>

```java
import java.util.*;

// Student class with ID and name fields
class Student {
    private int id;
    private String name;

    @Override
    public String toString() {
        return id + ": " + name;
    }
}

public class StudentCollectionExample {
    public static void main(String[] args) {
        // List to store multiple students
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Alice"));
        studentList.add(new Student(1, "Alice")); // Duplicate ID

        // Print the list of students
        System.out.println("List of Students:");


        // Set to remove duplicates from the list
        Set<Student> uniqueStudents = new HashSet<>(studentList);

        // Print the set of unique students
        System.out.println("\nSet of Unique Students:");


        // Map to associate student IDs with their names
        Map<Integer, String> studentMap = new HashMap<>();


        // Print the map of student ID to name
        System.out.println("\nStudent ID to Name Mapping:");

    }
}

```
