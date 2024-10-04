# Java Arrays and Enums Exercise

## Problem Statement:
Write a Java program that defines an enum representing the months of the year. The program should then create a one-dimensional array containing the average temperatures for each month. Next, create a two-dimensional array where each row represents a week in a month, and each column represents the days of the week (7 days). The program should print out the average temperature for each month using the one-dimensional array and then print out the temperatures for each week of a specific month using the two-dimensional array.

## Specific Requirements:
1. Define an `enum` for the months of the year (`JANUARY` to `DECEMBER`).
2. Create a one-dimensional array to store the average temperatures for each month (12 elements).
3. Create a two-dimensional array where each row represents the weekly temperatures of a specific month, and each column represents a day of the week (7 days per week).
4. Print the average temperature for each month.
5. Print the temperatures for a specific week of a given month by accessing the two-dimensional array.

## Example Output:
```text
Average Temperatures for Each Month:
JANUARY: -5.0°C
FEBRUARY: 0.0°C
MARCH: 5.0°C
...
DECEMBER: -2.0°C

Weekly Temperatures for MARCH:
Week 1: [10.0, 12.0, 15.0, 13.0, 9.0, 7.0, 8.0]
Week 2: [12.0, 11.0, 14.0, 15.0, 10.0, 8.0, 9.0]
...

## Instructions:
1. **Enum Definition**: Define an `enum` named `Month` with values representing the months of the year.
2. **One-Dimensional Array**: Create a one-dimensional array `averageTemperatures` with 12 elements, each representing the average temperature for a month.
3. **Two-Dimensional Array**: Create a two-dimensional array `weeklyTemperatures` where each row represents the temperatures for one week, and each column represents the temperatures for each day of the week.
4. **Loop**: Use a loop to print the average temperatures for each month using the enum and one-dimensional array.
5. **Access the 2D Array**: Print the temperatures for each week of a specific month using the two-dimensional array.
6. The program should neatly format the output for both average and weekly temperatures.

> [!WARNING]
> Starting Code Snippet (May not compile or work):
> Modify the code as needed.

```java
// Enum definition for months of the year
enum Month {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
}

public class TemperatureReport {
    public static void main(String[] args) {
        // One-dimensional array to store average temperatures for each month
        double[] averageTemperatures = {
            -5.0, 0.0, 5.0, 10.0, 15.0, 20.0, 25.0, 23.0, 18.0, 10.0, 5.0, -2.0
        };

        // Two-dimensional array for weekly temperatures of March (4 weeks, 7 days each)
        double[][] weeklyTemperatures = {
            {10.0, 12.0, 15.0, 13.0, 9.0, 7.0, 8.0},
            {12.0, 11.0, 14.0, 15.0, 10.0, 8.0, 9.0},
            {11.0, 10.0, 13.0, 14.0, 12.0, 9.0, 8.0},
            {13.0, 12.0, 15.0, 14.0, 10.0, 8.0, 9.0}
        };

        // Print the average temperatures for each month
        System.out.println("Average Temperatures for Each Month:");
        for (Month month : Month.values()) {
            System.out.println(month + ": " + averageTemperatures[month.ordinal()] + "°C");
        }

        // Print weekly temperatures for March
        System.out.println("\nWeekly Temperatures for MARCH:");
        for (int week = 0; week < weeklyTemperatures.length; week++) {
            System.out.print("Week " + (week + 1) + ": ");
            for (int day = 0; day < weeklyTemperatures[week].length; day++) {
                System.out.print(weeklyTemperatures[week][day] + " ");
            }
            System.out.println(); // Move to the next line after printing each week's temperatures
        }
    }
}
```
