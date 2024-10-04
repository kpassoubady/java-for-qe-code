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
        hashSet.add("QA Engineer"); // Duplicate, will not be added.

        System.out.println(hashSet); // Output: [QA Engineer, Automation Architect]

    }
}
