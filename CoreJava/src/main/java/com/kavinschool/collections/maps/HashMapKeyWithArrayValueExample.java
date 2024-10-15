package com.kavinschool.collections.maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashMapKeyWithArrayValueExample {
    public static void main(String[] args) {
        System.out.println("Hello HashMap");
        // Create a new Map where Key is String value is an Array
        Map<String, String[]> map = new HashMap<>();
        map.put("Test1", new String[] { "A", "B", "C" });
        map.put("Test2", new String[] { "X", "Y", "Z" });
        System.out.println(Arrays.deepToString(map.values().toArray()));

        // Access by a key with an index from the array
        System.out.println(map.get("Test2")[1]); // Output: Y

        // Access by a key
        System.out.println(Arrays.toString(map.get("Test2"))); // Output: [X, Y, Z]

        // Use for each loop to access all keys and values
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + Arrays.toString(map.get(key)));
        }
    }
}
