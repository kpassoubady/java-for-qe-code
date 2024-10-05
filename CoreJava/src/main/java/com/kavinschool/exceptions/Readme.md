# Java Exceptions

- [Java Exceptions](#java-exceptions)
  - [com.kavinschool.exceptions](#comkavinschoolexceptions)
  - [Classes](#classes)
  - [Usage](#usage)
  - [Example](#example)
  - [Best Practices](#best-practices)
- [Java Exception Hierarchy](#java-exception-hierarchy)
  - [1. Throwable (Base Class)](#1-throwable-base-class)
  - [2. Error](#2-error)
  - [3. Exception](#3-exception)
  - [4. RuntimeException](#4-runtimeexception)
  - [5. Common Subclasses of Exception (Checked Exceptions)](#5-common-subclasses-of-exception-checked-exceptions)
  - [6. Common Subclasses of Error](#6-common-subclasses-of-error)
  - [Checked vs. Unchecked Exceptions](#checked-vs-unchecked-exceptions)

## com.kavinschool.exceptions

This package contains custom exception classes used throughout the application. These exceptions are designed to handle specific error conditions and provide meaningful error messages to the users.

## Some of the common exceptions discussed are:

- **CustomException**: A base class for all custom exceptions.
- **UserNotFoundException**: Thrown when a user is not found in the system.
- **InvalidInputException**: Thrown when the input provided by the user is invalid.
- **DatabaseException**: Thrown when there is an error related to database operations.

## Usage

These exceptions should be used to handle specific error conditions in the application. By using custom exceptions, you can provide more detailed and user-friendly error messages.

## Example

```java
try {
    // Some code that may throw an exception
} catch (UserNotFoundException e) {
    // Handle user not found exception
} catch (InvalidInputException e) {
    // Handle invalid input exception
} catch (DatabaseException e) {
    // Handle database exception
} catch (CustomException e) {
    // Handle any other custom exceptions
}
finally {
    // Cleanup code
}
```

## Best Practices

- Always provide a meaningful message when throwing an exception.
- Use specific exceptions for specific error conditions.
- Catch and handle exceptions appropriately to ensure the application remains stable.

# Java Exception Hierarchy

## 1. Throwable (Base Class)

- **Description**: The superclass for all errors and exceptions in Java.
- **Subclasses**:
  - `Error`
  - `Exception`

---

## 2. Error

- **Description**: Represents serious issues that a reasonable application should not attempt to handle.
- **Common Subclasses**:
  - `OutOfMemoryError`
  - `StackOverflowError`
  - `LinkageError`

---

## 3. Exception

- **Description**: Represents conditions that a reasonable application might want to catch.
- **Subclasses**:
  - **Checked Exceptions**: Must be handled or declared in method signatures.
    - `IOException`
    - `SQLException`
    - `FileNotFoundException`
    - `ParseException`
  - **Unchecked Exceptions** (subclasses of `RuntimeException`): Do not require explicit handling.
    - `NullPointerException`
    - `ArrayIndexOutOfBoundsException`
    - `ArithmeticException`
    - `IllegalArgumentException`

---

## 4. RuntimeException

- **Description**: A subclass of `Exception`, these exceptions represent programming errors and are not checked at compile-time.
- **Common Subclasses**:
  - `NullPointerException`
  - `ArrayIndexOutOfBoundsException`
  - `IllegalStateException`
  - `ClassCastException`

---

## 5. Common Subclasses of Exception (Checked Exceptions)

- **IOException**: Signals I/O errors, such as failure in file handling or network communication.
- **SQLException**: Represents errors that occur during interaction with a database.
- **ClassNotFoundException**: Thrown when an application tries to load a class through its string name but the class cannot be found.

---

## 6. Common Subclasses of Error

- **OutOfMemoryError**: Thrown when the JVM runs out of memory.
- **StackOverflowError**: Occurs when the stack space for a thread is exhausted, typically due to deep recursion.
- **LinkageError**: Indicates a class dependency issue, such as a version mismatch between classes.

## Checked vs. Unchecked Exceptions

| Feature                   | Checked Exception                                | Unchecked Exception                                 |
|---------------------------|--------------------------------------------------|----------------------------------------------------|
| **Definition**             | Exceptions that are checked at compile-time.     | Exceptions that occur at runtime and are not checked at compile-time. |
| **Inheritance**            | Subclass of `Exception` (except for `RuntimeException`). | Subclass of `RuntimeException`.                    |
| **Declaration Requirement**| Must be declared in a method’s `throws` clause if not handled within the method. | No need to declare or catch in a method's `throws` clause. |
| **Handling Requirement**   | Must be caught or declared to propagate in the method signature. | Can be caught, but not required to be handled explicitly. |
| **Typical Examples**       | `IOException`, `SQLException`, `FileNotFoundException`, `ParseException`. | `NullPointerException`, `ArrayIndexOutOfBoundsException`, `ArithmeticException`, `IllegalArgumentException`. |
| **When Occurs**            | Typically caused by external factors like I/O operations, database access, or other checked conditions. | Typically caused by programming errors like logic mistakes, null dereferencing, or arithmetic issues. |
| **Purpose**                | To signal conditions that a program should anticipate and handle gracefully. | To signal programming bugs or runtime conditions that a programmer should prevent. |
| **Compile-time Checking**  | Yes, checked by the compiler.                   | No, detected during program execution (runtime).    |
| **Impact on Code**         | Requires more verbose code due to mandatory try-catch blocks or `throws` declarations. | Simpler code but might result in runtime crashes if not handled. |
| **Common Use Case**        | File handling, database access, and network operations where the error could be anticipated. | Dereferencing `null` objects, invalid array index access, illegal argument values in methods. |
