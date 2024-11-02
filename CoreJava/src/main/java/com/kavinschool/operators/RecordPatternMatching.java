package com.kavinschool.operators;

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
        // Pattern matching; no need for explicit casting
        System.out.println("Person Name: " + person.name());
        System.out.println("City: " + person.address().city());

        // Explicit casting example
        String obj = "Hello, Java 21!";  // Assigning a String object to a variable of type Object
        // Manual casting required
        System.out.println("Traditional: The length of the string is " + obj.length());

        // Pattern matching example
        System.out.println("Pattern Matching: The length of the string is " + obj.length());

        // Another example with Dog class and instanceof pattern matching
        Dog dog = new Dog("Buddy");
        System.out.println("This is a dog named " + dog.getName());

    }
}
