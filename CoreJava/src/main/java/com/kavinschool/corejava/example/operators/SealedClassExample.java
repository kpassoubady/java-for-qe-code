package com.kavinschool.corejava.example.operators;

/*
 * Sealed Classes: A sealed class is a class that restricts which other classes can extend it.
 * Java 17 introduced sealed classes, a feature that restricts which classes or interfaces can extend or implement them.
 * Sealed classes work well with pattern matching, making it easier to handle different types in a type-safe manner.
 */

public class SealedClassExample {
    public static void main(String[] args) {
        // Example using pattern matching with sealed classes
        Shape shape1 = new Circle(5);
        Shape shape2 = new Rectangle(4, 6);
        Shape shape3 = new Square(4);

        // Pattern matching with sealed classes
        System.out.println(describeShape(shape1)); // Output: Circle with radius 5.0
        System.out.println(describeShape(shape2)); // Output: Rectangle with width 4.0 and height 6.0
        System.out.println(describeShape(shape3)); // Output: Square with side length 4.0
    }

    // Method that uses pattern matching to describe different shapes
    // This eliminates the need for explicit type casting when matching the specific subclass of Shape.
    public static String describeShape(Shape shape) {
        return switch (shape) {
            case Circle c -> "Circle with radius " + c.radius();
            case Rectangle r -> "Rectangle with width " + r.width() + " and height " + r.height();
            case Square s -> "Square with side length " + s.sideLength();
            default -> throw new IllegalStateException("Unexpected shape: " + shape);
        };
    }
}

// Sealed class hierarchy for different
// the sealed interface Shape defines the permitted subclasses (Circle, Rectangle, Square) using the permits' clause.
// Sealed classes ensure that no other classes outside this hierarchy can extend Shape.
// This enforces a controlled inheritance structure, which improves maintainability and security.
// The sealed class or interface explicitly lists the permitted subclasses,
// ensuring that any extension of the class hierarchy is restricted to known types.
// This makes reasoning about the code easier and enhances type safety
sealed interface Shape permits Circle, Rectangle, Square {
}

// Circle class extends Shape
record Circle(double radius) implements Shape {
}

// Rectangle class extends Shape
record Rectangle(double width, double height) implements Shape {
}

// Square class extends Shape
record Square(double sideLength) implements Shape {
}
