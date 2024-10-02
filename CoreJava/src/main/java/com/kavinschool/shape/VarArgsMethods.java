package com.kavinschool.shape;

// What are VarArgs?
// VarArgs is a feature in Java that allows you to pass a variable number of arguments to a method.
// The syntax for declaring a method that takes a variable number of arguments is as follows:
// public void methodName(Type... variableName) { }
// The three dots (...) are used to denote that the method can take a variable number of arguments.
// The variableName is the name of the array that will be used to store the arguments passed to the method.
// The Type is the type of the arguments that can be passed to the method.
// The variable number of arguments passed to the method are stored in an array of the specified type.
// The array is created by the Java compiler and is passed to the method as a single argument.
// The method can then access the elements of the array using the array index notation.
// The variable number of arguments passed to the method can be of any type, including primitive types, reference types, and arrays.
// The variable number of arguments passed to the method can be of different types, as long as they are all compatible with the specified type.
// The variable number of arguments passed to the method can be of different lengths, as long as they are all compatible with the specified type.

public class VarArgsMethods {
    // Example 1: Method with a variable number of arguments
    // This method takes a variable number of arguments of type int and prints their values.
    public static void printNumbers(int... numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    // Example 2: Method with a variable number of arguments
    // This method takes a variable number of arguments of type String and prints their values.
    public static void printStrings(String... strings) {
        for (String string : strings) {
            System.out.println(string);
        }
    }

    // Example 3: Method with a variable number of arguments
    // This method takes a variable number of arguments of type double and prints their values.
    public static void printDoubles(double... doubles) {
        for (double d : doubles) {
            System.out.println(d);
        }
    }

    // Example 4: Method with a variable number of arguments and a fixed argument
    // This method takes a variable number of arguments of type int and a fixed argument of type String.
    // The fixed argument is printed before the variable number of arguments.
    public static void printNumbersWithMessage(String message, int... numbers) {
        System.out.println(message);
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    // Main method to test the above methods
    public static void main(String[] args) {
        // Example 1: Calling the method with a variable number of arguments
        // The method can be called with any number of arguments, including zero arguments.
        printNumbers(1, 2, 3, 4, 5);
        printNumbers(10, 20, 30);
        printNumbers(100, 200);
        printNumbers(1000);
        printNumbers();

        // Example 2: Calling the method with a variable number of arguments
        // The method can be called with any number of arguments, including zero arguments.
        printStrings("Hello", "World");
        printStrings("Java", "Programming", "Language");
        printStrings("Variable", "Number", "Of", "Arguments");
        printStrings();

        // Example 3: Calling the method with a variable number of arguments
        // The method can be called with any number of arguments, including zero arguments.
        printDoubles(1.1, 2.2, 3.3, 4.4, 5.5);
        printDoubles(10.1, 20.2, 30.3);
        printDoubles(100.1, 200.2);
        printDoubles(1000.1);
        printDoubles();

        // Example 4: Calling the method with a variable number of arguments and a fixed argument
        // The method can be called with any number of arguments, including zero arguments.
        printNumbersWithMessage("Numbers:", 1, 2, 3, 4, 5);
        printNumbersWithMessage("Numbers multiple of 10:", 10, 20, 30);
        printNumbersWithMessage("Numbers multiple of 100:", 100, 200);
        printNumbersWithMessage("Numbers multiple of 1000:", 1000);
        printNumbersWithMessage("No Numbers:");

    }
}
