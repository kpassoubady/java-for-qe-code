package com.kavinschool.collections.sets;

import java.util.HashSet;
import java.util.Set;

/**
 * <p>HashSetExample class.</p>
 *
 * @author kangs
 */
public class HashSetExample {
    /**
     * <p>main.</p>
     *
     * @param args an array of {@link java.lang.String} objects
     */
    public static void main(String[] args) {
        System.out.println("Hello HashSet");
        Set<String> hashSet = new HashSet<>();
        hashSet.add("QA Engineer");
        hashSet.add("Automation Architect");
        hashSet.add("QA Engineer"); // Duplicate will not be added.

        System.out.println(hashSet); // Output: [QA Engineer, Automation Architect]

        // Check if the set contains an element
        System.out.println(hashSet.contains("QA Engineer")); // Output: true
        // Check a non-existing element
        System.out.println(hashSet.contains("Developer")); // Output: false

        // Remove an element
        hashSet.remove("Automation Architect");
        System.out.println(hashSet); // Output: [QA Engineer]

        // Get the size of the set
        System.out.println(hashSet.size()); // Output: 1

        // Clear the set
        hashSet.clear();
        System.out.println(hashSet); // Output: []

        // Check if the set is empty
        System.out.println(hashSet.isEmpty()); // Output: true

        // Add a new element
        hashSet.add("Developer");
        System.out.println(hashSet); // Output: [Developer]

    }
}
