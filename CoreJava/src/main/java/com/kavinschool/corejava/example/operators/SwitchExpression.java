package com.kavinschool.corejava.example.operators;

// Switch Expression Example
/*
 * Switch expressions are a new preview feature in Java 12 that allow you to use switch as an expression.
 * Switch expressions return values and make code more concise.
 * The new syntax uses -> and supports multiple labels.
 */
public class SwitchExpression {
    // Provide a day of the week and get the number of the day using switch expression
    public static int getDayNumber(String day) {
        return switch (day) {
            case "Monday" -> 1;
            case "Tuesday" -> 2;
            case "Wednesday" -> 3;
            case "Thursday" -> 4;
            case "Friday" -> 5;
            case "Saturday" -> 6;
            case "Sunday" -> 7;
            default -> -1;
        };
    }

    // Provide a day of the week and get the number of the day using switch expression
    // A method that takes a Day enum as input and returns the number of letters in the day name.
    public static int getNumLetters(final Day day) {
        return switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY -> 7;
            default -> throw new IllegalStateException("Invalid day: " + day);
        };
    }

    // Enum representing the days of the week
    private enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        // call getDayNumber() method with different days
        System.out.println("Day Number: " + getDayNumber("Monday"));
        System.out.println("Day Number: " + getDayNumber("Friday"));
        System.out.println("Day Number: " + getDayNumber("Sunday"));
        System.out.println("Day Number: " + getDayNumber("Invalid Day"));
        // call getNumLetters() method with different days
        System.out.println("Number of letters in Monday: " + getNumLetters(Day.MONDAY));
        System.out.println("Number of letters in Tuesday: " + getNumLetters(Day.TUESDAY));
        System.out.println("Number of letters in Wednesday: " + getNumLetters(Day.WEDNESDAY));

    }
}
