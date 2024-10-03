package com.kavinschool.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
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
