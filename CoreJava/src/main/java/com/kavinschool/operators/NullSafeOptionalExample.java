package com.kavinschool.operators;

import java.util.Optional;

/*
* Null-safe Method Reference (?.): Not available in Java. Instead,
* we use Optional to handle null checks in a more functional style.
* Null Coalescing Operator (??): Not available in Java.
* The ternary operator or Optional.orElse() serves the same purpose to provide fallback values.
*/

public class NullSafeOptionalExample {
    /**
     * @param address Address can be null
     */ // Person class with nullable fields
    record Person(String name, Address address) {
    }

    // Address class with city field
    record Address(String city) {
    }

    public static void main(String[] args) {
        // Example using Optional for null-safe operations
        Person person = new Person("John", null);  // Person has a name, but the address is null

        // Use Optional to safely access the name and address fields
        String personName = Optional.of(person)
                .map(Person::name)
                .orElse("Robert");  // Safely get name or provide default

        String city = Optional.of(person)
                .map(Person::address)
                .map(Address::city)
                .orElse("Fremont");  // Safely get city or provide default

        System.out.println("Person Name: " + personName);
        System.out.println("City: " + city);

        // Another example with a null person object
        Person unknownPerson = null;
        String unknownName = Optional.ofNullable(unknownPerson)
                .map(Person::name)
                .orElse("Unknown Person");  // Provide default if person is null
        System.out.println("Unknown Person Name: " + unknownName);
    }
}

