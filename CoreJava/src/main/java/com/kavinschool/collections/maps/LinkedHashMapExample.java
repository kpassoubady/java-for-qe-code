package com.kavinschool.collections.maps;

import java.util.LinkedHashMap;
import java.util.Map;

// Advantages of LinkedHashMap:
// 1. It maintains the insertion order.
// 2. It is faster than TreeMap.
// 3. It is slower than HashMap.
// 4. It is not synchronized.
// 5. It is not thread-safe.

/**
 * <p>LinkedHashMapExample class.</p>
 *
 * @author kangs
 */
public class LinkedHashMapExample {
    /**
     * <p>main.</p>
     *
     * @param args an array of {@link java.lang.String} objects
     */
    public static void main(String[] args) {
        Map<String, Integer> shoppingCart = new LinkedHashMap<String, Integer>();
        shoppingCart.put("PROD123", 2);  // 2 quantities of PROD123
        shoppingCart.put("PROD456", 1);  // 1 quantity of PROD456

        for (Map.Entry<String, Integer> entry : shoppingCart.entrySet()) {
            System.out.println("Product: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }

    }
}
