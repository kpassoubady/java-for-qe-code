package com.kavinschool.collections.lists;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>ListExample class.</p>
 *
 * @author kangs
 */
public class ListExample {
    /**
     * <p>main.</p>
     *
     * @param args an array of {@link java.lang.String} objects
     */
    public static void main(String[] args) {
        System.out.println("ArrayList Example");
        List<String> list = new ArrayList<>(); // specific ArrayList to List interface
        list.add("QA Engineer");
        list.add("Automation Architect");
        list.add("Developer");

        System.out.println(list); // Output: [QA Engineer, Automation Architect, Developer]

        // Access by index
        System.out.println(list.get(1)); // Output: Automation Architect

        // Remove by index
        list.remove(1);
        System.out.println(list); // Output: [QA Engineer, Developer]

        // Remove by object
        list.remove("Developer");
        System.out.println(list); // Output: [QA Engineer]

        // Check if the list contains an element
        System.out.println(list.contains("QA Engineer")); // Output: true

        // Get size of the list
        System.out.println(list.size()); // Output: 1

    }
}
