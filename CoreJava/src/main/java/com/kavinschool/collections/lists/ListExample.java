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
        List<String> list = new ArrayList<>();
        list.add("QA Engineer");
        list.add("Automation Architect");
        list.add("Developer");

        System.out.println(list); // Output: [QA Engineer, Automation Architect, Developer]

        // Access by index
        System.out.println(list.get(1)); // Output: Automation Architect

    }
}
