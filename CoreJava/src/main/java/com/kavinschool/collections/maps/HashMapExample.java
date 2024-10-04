package com.kavinschool.collections.maps;

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

    }
}
