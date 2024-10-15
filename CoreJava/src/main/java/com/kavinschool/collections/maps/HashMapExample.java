package com.kavinschool.collections.maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>HashMapExample class.</p>
 *
 * @author kangs
 */
public class HashMapExample {
    /**
     * <p>main.</p>
     *
     * @param args an array of {@link java.lang.String} objects
     */
    public static void main(String[] args) {
        System.out.println("Hello HashMap");
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Test1", 85);
        hashMap.put("Test2", 95);
        hashMap.put("Test3", 75);

        System.out.println(hashMap); // Output: {Test1=85, Test2=95, Test3=75}

        // Access by key
        System.out.println(hashMap.get("Test2")); // Output: 95

        // Remove by key
        hashMap.remove("Test2");
        System.out.println(hashMap); // Output: {Test1=85, Test3=75}

        // Check if the map contains a key
        System.out.println(hashMap.containsKey("Test1")); // Output: true

        // Check if the map contains a value
        System.out.println(hashMap.containsValue(75)); // Output: true

        // Get the size of the map
        System.out.println(hashMap.size()); // Output: 2

        // Add a few more elements
        hashMap.put("Test4", 55);
        hashMap.put("Test5", 65);
        System.out.println(hashMap); // Output: {Test1=85, Test3=75, Test4=55, Test5=65}

        // Get all keys
        System.out.println(hashMap.keySet()); // Output: [Test1, Test3, Test4, Test5]

        // Get all values
        System.out.println(hashMap.values()); // Output: [85, 75, 55, 65]
    }
}
