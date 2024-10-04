# Java Control Flow Exercise

## Problem Statement

Write a Java program that generates a random number between 1 and 7, representing the days of the week (1 for Monday, 2 for Tuesday, etc.). Based on the number, the program should print the name of the day using a `switch` statement. If the number is outside this range (though it shouldn’t be), the program should print an error message.

Additionally, use a `for` loop to print the numbers 1 through 10, then use a `while` loop to count down from 10 to 1. Finally, demonstrate the use of a `do-while` loop to print "This will print at least once!" regardless of conditions.

## Specific Requirements

1. Generate a random number between 1 and 7 to represent the days of the week.
2. Use a `switch` statement to map the random number (1-7) to the corresponding day of the week.
3. Implement a `for` loop to print the numbers 1 to 10.
4. Implement a `while` loop to print numbers 10 down to 1.
5. Use a `do-while` loop to print a message at least once.
6. Use the `forEach` loop to iterate over an array of strings representing the days of the week.

## Example Output

```text
The random number is: 3
The day is: Wednesday

Counting from 1 to 10:
1 2 3 4 5 6 7 8 9 10 

Counting down from 10:
10 9 8 7 6 5 4 3 2 1 

This will print at least once!

Days of the week:
Monday
Tuesday
Wednesday
Thursday
Friday
Saturday
Sunday

```

## Instructions

1. Generate a random number between 1 and 7 using `Math.random()` or the `Random` class.
2. Use a `switch` statement to print the corresponding day of the week based on the random number.
3. Implement a `for` loop to count from 1 to 10 and print each number.
4. Use a `while` loop to count down from 10 to 1 and print each number.
5. Implement a `do-while` loop to print a message at least once.
6. Create an array with days of the week and use the `forEach` loop to print each day.