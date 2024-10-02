package com.kavinschool.corejava.example;

public class InstanceofExample {
    public static void main(String[] args) {
        Object obj = "Hello, Java 21!";  // Assigning a String object to a variable of type Object

        // Traditional instanceof check and cast (before Java 16)
        if (obj instanceof String) {
            String str = (String) obj;  // Manual casting required
            System.out.println("Traditional: The length of the string is " + str.length());
        }

        // Using instanceof with pattern matching (Java 16+)
        if (obj instanceof String str) {  // Pattern matching; no need for explicit casting
            System.out.println("Pattern Matching: The length of the string is " + str.length());
        }

        // Another example with custom class and instanceof pattern matching
        Animal animal = new Dog("Buddy");

        if (animal instanceof Dog dog) {
            System.out.println("This is a dog named " + dog.getName());
        } else if (animal instanceof Cat cat) {
            System.out.println("This is a cat named " + cat.getName());
        }
    }
}

// A simple Animal class and two subclasses
class Animal {
    // Basic fields and methods
}

class Dog extends Animal {
    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Cat extends Animal {
    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
