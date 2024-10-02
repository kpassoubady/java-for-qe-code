package com.kavinschool.corejava.example.operators;

public class RecordPatternMatching {
    /**
     * @param address Address can be null
     */ // Person class with nullable fields
    record Person(String name, Address address) {
    }

    // Address class with city field
    record Address(String city) {
    }

    //Pattern Matching with record: You can now use pattern matching with records to deconstruct objects more elegantly.
    public static void main(String[] args) {
        Person person = new Person("John", new Address("San Francisco"));

        // Pattern matching with record
        if (person instanceof Person p) { // Pattern matching; no need for explicit casting
            System.out.println("Person Name: " + p.name());
            System.out.println("City: " + p.address().city());
        }

        // Explicit casting example
        Object obj = "Hello, Java 21!";  // Assigning a String object to a variable of type Object
        if (obj instanceof String) {
            String str = (String) obj;  // Manual casting required
            System.out.println("Traditional: The length of the string is " + str.length());
        }

        // Another example without if side effects of pattern matching
        if (obj instanceof String str) {  // Pattern matching; no need for explicit casting
            System.out.println("Pattern Matching: The length of the string is " + str.length());
        }

        // Another example with Dog class and instanceof pattern matching
        Animal animal = new Dog("Buddy");
        if (animal instanceof Dog dog) {
            System.out.println("This is a dog named " + dog.getName());
        } else if (animal instanceof Cat cat) {
            System.out.println("This is a cat named " + cat.getName());
        }

    }
}
