# Java Basic Operations Exercise

## Problem Statement

> [!IMPORTANT]
> Write a Java program that declares and initializes variables of different data types such as integers, floats, characters, and strings. Use these variables to perform basic arithmetic operations like addition, subtraction, and multiplication. Additionally, the program should demonstrate how to use escape codes to format the output by including a tab space and a new line in the printed results.

## Specific Requirements
>
> [!TIP]
>
> 1. Declare variables of type `int`, `float`, `char`, and `String`.
> 2. Perform the following arithmetic operations using variables:
>     - Add two integers.
>     - Subtract one integer from another.
>     - Multiply an integer by a floating-point value.
> 3. Use escape codes (`\n` and `\t`) in the `System.out.println` statements to format the output.
> 4. Print the results of the operations along with a character and a formatted string.

## Example Output

```text
Result of operations:

Sum of 10 and 20 is: 30
Difference between 20 and 10 is: 10
Product of 10 and 5.75 is: 57.5

Character value: A
Escape code example: tab space    and new line
```

## Instructions

1. Create variables to hold integer values (e.g., `num1`, `num2`), a floating-point number (`decimalValue`), a character (`initial`), and a message (`String`).
2. Perform the arithmetic operations (addition, subtraction, multiplication).
3. Use `System.out.println` statements to print the results in a well-formatted way using escape codes for tab space (`\t`) and new lines (`\n`).

> [!WARNING]
> Starting Code Snippet (May not compile or work):
> Modify the code as needed.

```java
public class BasicOperations {
    public static void main(String[] args) {
        // Declare and initialize variables of different data types

        String message = "Result of operations:\n";
        String escapeMessage = "Escape code example: tab space and new line";
        
        // Perform basic arithmetic operations

        
        // Print the results using escape codes for formatting
        System.out.println(message);
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
        System.out.println("Difference between " + num2 + " and " + num1 + " is: " + difference);
        System.out.println("Product of " + num1 + " and " + decimalValue + " is: " + product + "\n");
        System.out.println("Character value: " + initial);
        System.out.println(escapeMessage);
    }
}
```
